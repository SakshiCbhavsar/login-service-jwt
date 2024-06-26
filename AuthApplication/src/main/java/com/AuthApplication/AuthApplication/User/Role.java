package com.AuthApplication.AuthApplication.User;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
@RequiredArgsConstructor
public enum Role {

    USER,
    ADMIN

}




