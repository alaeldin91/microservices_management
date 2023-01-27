package com.alaeldin.employmentservice.service;

import com.alaeldin.employmentservice.dto.APIResponseDto;
import com.alaeldin.employmentservice.dto.EmploymentDto;

public interface EmployeementService {
      EmploymentDto saveEmployee(EmploymentDto employmentDto);
      APIResponseDto getEmployeeById(Long id);
}
