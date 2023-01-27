package com.alaeldin.employmentservice.service;

import com.alaeldin.employmentservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="DEPARTMENT-SERVER")
public interface ApiClient {
    @GetMapping("api/departments/{code}")
    DepartmentDto getDepartmentByCode(@PathVariable("code") String departmentCode);
}
