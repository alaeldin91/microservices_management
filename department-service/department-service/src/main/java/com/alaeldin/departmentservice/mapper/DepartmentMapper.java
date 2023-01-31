package com.alaeldin.departmentservice.mapper;

import com.alaeldin.departmentservice.Dto.DepartmentDto;
import com.alaeldin.departmentservice.entity.Department;

public class DepartmentMapper {

    public static DepartmentDto mapToDepartmentDto(Department department){
         DepartmentDto departmentDto = new  DepartmentDto(
                 department.getId(),
                 department.getDepartmentName(),
                 department.getDepartmentDescription(),
                 department.getCode()
         );
         return departmentDto;
    }
    public static Department mapToDepartment(DepartmentDto departmentDto){
         Department department = new Department(
                 departmentDto.getId(),
                 departmentDto.getDepartmentName(),
                 departmentDto.getDepartmentDescription(),
                 departmentDto.getCode()
         );
         return department;
    }
}
