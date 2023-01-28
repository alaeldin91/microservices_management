package com.alaeldin.departmentservice.Dto;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
    private Long id;
    private String  departmentName;
    private String departmentDescription;
    private String code;
}
