package com.alaeldin.employmentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class APIResponseDto {
   private DepartmentDto departmentDto;
    private  EmploymentDto employmentDto;
}
