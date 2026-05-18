package com.overlanwest.app.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.overlanwest.app.services.JwtService;
import com.overlanwest.app.services.MyUserDetailService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter extends OncePerRequestFilter{

    @Autowired
    private ApplicationContext appContext;

    @Autowired
    private JwtService jwtServ;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
    
        
            String path = request.getServletPath();

            if(path.startsWith("/auth/") || path.startsWith("error")){

                filterChain.doFilter(request, response);

                return;
            }

            String authHeader = request.getHeader("Authorization");
            String token = null;
            String username = null;

            if(authHeader != null && authHeader.startsWith("Bearer ")){

                token = authHeader.substring(7);
                username = jwtServ.extractUsername(token);

            }


            if(username != null && SecurityContextHolder.getContext().getAuthentication() == null){

                UserDetails ud = appContext.getBean(MyUserDetailService.class).loadUserByUsername(username);

                if(jwtServ.verifyToken(token, ud)){

                    UsernamePasswordAuthenticationToken userPAT = new UsernamePasswordAuthenticationToken(ud, ud, ud.getAuthorities());

                    userPAT.setDetails(new WebAuthenticationDetails(request));
                    SecurityContextHolder.getContext().setAuthentication(userPAT);
                }

            }filterChain.doFilter(request, response);
    }
    
}
