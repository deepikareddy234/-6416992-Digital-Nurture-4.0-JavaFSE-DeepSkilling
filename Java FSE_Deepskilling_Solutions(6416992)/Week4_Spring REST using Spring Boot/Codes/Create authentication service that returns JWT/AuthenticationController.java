package com.example.authservice.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

    // Use 256-bit (32+ chars) key for HS256
    private static final String SECRET = "mysecretkeymysecretkeymysecretkey";
    private static final Key key = Keys.hmacShaKeyFor(SECRET.getBytes());

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        logger.info("START - /authenticate");
        logger.debug("Authorization Header: {}", authHeader);

        String user = getUser(authHeader);
        logger.debug("Decoded user: {}", user);

        String token = generateJwt(user);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        logger.info("END - /authenticate");
        return map;
    }

    private String getUser(String authHeader) {
        String encoded = authHeader.replace("Basic ", "");
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes);
        return decoded.split(":")[0];
    }

    private String generateJwt(String user) {
        return Jwts.builder()
                .setSubject(user)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1200000)) // 20 mins
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
}
