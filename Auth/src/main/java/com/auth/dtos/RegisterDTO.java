package com.auth.dtos;

import com.auth.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
