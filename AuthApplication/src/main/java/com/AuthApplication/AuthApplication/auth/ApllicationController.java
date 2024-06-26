package com.AuthApplication.AuthApplication.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class ApllicationController {

    @Autowired
    private final AuthenticationService authenticationService;

    @PostMapping("signUp")
    public ResponseEntity <AuthenticationResponse> signUp(
        @RequestBody SignUpRequest request)
    {
       return ResponseEntity.ok(authenticationService.signUp(request));
    }
    @PostMapping("authenticate")
    public ResponseEntity <AuthenticationResponse> signUp(
            @RequestBody AuthenticationRequest request)
    {
        return ResponseEntity.ok(authenticationService.autenticate(request));
    }
}
