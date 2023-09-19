package com.example.gudgement.member.common.jwt;

import com.example.gudgement.member.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Authentication {
    private Long id;
    private String email;
    private Role role;
}
