package com.apps.apps.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {
    private int id;
    private String usersName;
    private String dob;
    private String city;
    private String country;

}
