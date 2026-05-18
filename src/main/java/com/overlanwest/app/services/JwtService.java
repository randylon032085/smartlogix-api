package com.overlanwest.app.services;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;



@Service
public class JwtService {

    @Value("${jwt.secret}")
    String secretKey;
    

    public String generateToken (String username){

        Map<String, Object> claims = new HashMap<>();

        return Jwts.builder()
            .claims()
            .add(claims)
            .subject(username)
            .issuedAt(new Date(System.currentTimeMillis()))
            .expiration(new Date(System.currentTimeMillis()+1000*60*60*5))
            .and()
            .signWith(getKey())
            .compact();
    }


    private SecretKey getKey() {
       byte[] key = Decoders.BASE64.decode(secretKey);
       return Keys.hmacShaKeyFor(key);
    }

    public String extractUsername (String token) {
        return extractClaims(token, Claims::getSubject);
    }

    public <T> T extractClaims (String token, java.util.function.Function<Claims, T> claimsResolver){

        Claims claims = extractAllClaims(token);

        return claimsResolver.apply(claims);
    }

    public Claims extractAllClaims (String token){

        return Jwts.parser()
            .verifyWith(getKey())
            .build()
            .parseSignedClaims(token)
            .getPayload();
   }

   public boolean verifyToken (String token, UserDetails ud){

        final String username = extractUsername(token);

        return username.equals(ud.getUsername()) && !isTokenExpired(token);
   }


   public boolean isTokenExpired (String token){

        final Date expiration = extractClaims(token, Claims::getExpiration);

        return expiration.before(new Date());
   }
}
