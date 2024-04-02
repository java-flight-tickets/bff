package com.example.bff.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDto {
        @JsonProperty("id")
        String id;

        @JsonProperty("name")
        String name;

        @JsonProperty("username")
        String surname;

        @JsonProperty("email")
        String email;

        @JsonProperty("password")
        String password;

        @JsonProperty("country")
        String country;
}