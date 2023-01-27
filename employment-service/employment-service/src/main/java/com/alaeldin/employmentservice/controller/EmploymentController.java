package com.alaeldin.employmentservice.controller;

import com.alaeldin.employmentservice.dto.APIResponseDto;
import com.alaeldin.employmentservice.dto.EmploymentDto;
import com.alaeldin.employmentservice.service.EmployeementService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/employment")
public class EmploymentController {
    private final EmployeementService employeementService;
    @PostMapping
    public ResponseEntity<EmploymentDto> employeeSave( @RequestBody EmploymentDto employmentDto){
         EmploymentDto employmentSaveDto = employeementService.saveEmployee(employmentDto);
         return new ResponseEntity<>(employmentSaveDto, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
  public ResponseEntity<APIResponseDto> getEmployeeById(@PathVariable("id") Long id){
        APIResponseDto apiResponseDto = employeementService.getEmployeeById(id);
        return new ResponseEntity<>(apiResponseDto,HttpStatus.OK);

    }
}
