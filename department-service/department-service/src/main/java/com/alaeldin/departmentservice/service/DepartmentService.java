package com.alaeldin.departmentservice.service;

import com.alaeldin.departmentservice.Dto.DepartmentDto;

public interface  DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(String departmentCode);

}
