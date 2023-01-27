package com.alaeldin.departmentservice.service.impl;

import com.alaeldin.departmentservice.Dto.DepartmentDto;
import com.alaeldin.departmentservice.entity.Department;
import com.alaeldin.departmentservice.repository.DepartmentRepository;
import com.alaeldin.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentSServiceImpl  implements DepartmentService {
     private DepartmentRepository departmentRepository;
    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        //convert departmentDto  to department
        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
               departmentDto.getDepartmentDescription(),
                departmentDto.getCode());
         Department saveDepartment =departmentRepository.save(department);
        //convert Department to departmentDto
        DepartmentDto departmentSaveDto = new DepartmentDto(
                saveDepartment.getId(),
                saveDepartment.getDepartmentName(),
                saveDepartment.getDepartmentDescription(),
                saveDepartment.getCode());
        return departmentSaveDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByCode(departmentCode);
        DepartmentDto departmentDto= new DepartmentDto();
        departmentDto.setDepartmentName(department.getDepartmentName());
        departmentDto.setDepartmentDescription(department.getDepartmentDescription());
        departmentDto.setCode(department.getCode());
        departmentDto.setId(department.getId());
        return departmentDto;
    }
}
