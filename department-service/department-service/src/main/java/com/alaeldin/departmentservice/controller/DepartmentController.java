package com.alaeldin.departmentservice.controller;

import com.alaeldin.departmentservice.Dto.DepartmentDto;
import com.alaeldin.departmentservice.service.DepartmentService;
import com.alaeldin.departmentservice.service.impl.DepartmentSServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {

    private DepartmentSServiceImpl departmentService;
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentDto departmentSaveDto = departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(departmentSaveDto, HttpStatus.CREATED);
    }
    @GetMapping("/{code}")
    public ResponseEntity<DepartmentDto> getDepartmentById(@PathVariable("code") String departmentCode){
        DepartmentDto  departmentDto = departmentService.getDepartmentByCode(departmentCode);
        return new ResponseEntity<>(departmentDto,HttpStatus.OK);
    }
}
