package com.example.jwtauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        String base64Credentials = authHeader.substring("Basic ".length());
        String credentials = new String(Base64.getDecoder().decode(base64Credentials));
        String username = credentials.split(":")[0];
        String token = jwtUtil.generateToken(username);
        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return response;
    }
}
