package com.carsandtea.dto;

import lombok.Builder;
import lombok.Data;

@SuppressWarnings("unused")
@Data
@Builder
public class UserTo {
    Long id;
    String login;
    String password;
    Role role;
}
