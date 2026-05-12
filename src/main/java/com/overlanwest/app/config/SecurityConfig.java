package com.overlanwest.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.expression.DefaultWebSecurityExpressionHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.overlanwest.app.services.MyUserDetailService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    

    @Autowired
    private MyUserDetailService myUserDetail;

    @Autowired
    private JwtFilter jwtFilter;

    @Autowired
    private JwtAuthEntryPoint jwtAuthEntryPoint;

    @Autowired
    private JwtAccessDeniedHandler jwtAccessDeniedHandler;

    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{

        return http
            .csrf(customizer -> customizer.disable() )
            .httpBasic(basic -> basic.disable())
            .formLogin(form -> form.disable())
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .exceptionHandling(ex -> ex
            .authenticationEntryPoint(jwtAuthEntryPoint)
            .accessDeniedHandler(jwtAccessDeniedHandler))

            .authorizeHttpRequests(request -> request
            .requestMatchers("auth/**","/error").permitAll()
            .requestMatchers("/api/v1/user/all-user").hasRole("MANAGER")
            .requestMatchers("/api/v1/force-to-assign/all-force-to-assign").hasRole("EMPLOYEE")  
            .requestMatchers("/api/v1/manifest/all-manifest").hasRole("DRIVER")
            .requestMatchers("/api/v1/user/**").hasRole("ADMIN")
            .anyRequest()
            .authenticated())
            .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
            .build();

    }

    @Bean
    public AuthenticationProvider authProvicer() {

        DaoAuthenticationProvider daoAuth = new DaoAuthenticationProvider();
        daoAuth.setPasswordEncoder(new BCryptPasswordEncoder());
        daoAuth.setUserDetailsService(myUserDetail);
        return daoAuth;
    }

    @Bean
    public AuthenticationManager authManager (AuthenticationConfiguration authConfig) throws Exception{
        
        return authConfig.getAuthenticationManager();
    }

    @Bean
    public RoleHierarchy roleHierarchy(){

        RoleHierarchyImpl roleHierarchyImpl = new RoleHierarchyImpl();

        roleHierarchyImpl.setHierarchy("""
                ROLE_ADMIN > ROLE_MANAGER
                ROLE_MANAGER > ROLE_EMPLOYEE
                ROLE_EMPLOYEE > ROLE_DRIVER


        """);   

        return roleHierarchyImpl;
    }
    
    @Bean
    public DefaultWebSecurityExpressionHandler webSecurityHandler (RoleHierarchy roleHierarchy){

        DefaultWebSecurityExpressionHandler handler = new DefaultWebSecurityExpressionHandler();
        handler.setRoleHierarchy(roleHierarchy);
        return handler;
    }

}
