package com.alaeldin.employmentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmploymentDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String code;

}
