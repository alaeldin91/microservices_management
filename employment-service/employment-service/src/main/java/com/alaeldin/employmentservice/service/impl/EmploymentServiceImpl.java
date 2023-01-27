package com.alaeldin.employmentservice.service.impl;

import com.alaeldin.employmentservice.dto.APIResponseDto;
import com.alaeldin.employmentservice.dto.DepartmentDto;
import com.alaeldin.employmentservice.dto.EmploymentDto;
import com.alaeldin.employmentservice.entity.Employement;
import com.alaeldin.employmentservice.repository.RepositoryEmployeeMent;
import com.alaeldin.employmentservice.service.ApiClient;
import com.alaeldin.employmentservice.service.EmployeementService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class EmploymentServiceImpl implements EmployeementService {
    private final RepositoryEmployeeMent repositoryEmployeeMent;
    //private WebClient webClient;
    private ApiClient apiClient;
    @Override
    public EmploymentDto saveEmployee(EmploymentDto employmentDto) {
         Employement employement = new Employement();
         employement.setId(employmentDto.getId());
         employement.setFirstName(employmentDto.getFirstName());
         employement.setLastName(employmentDto.getLastName());
         employement.setCode(employmentDto.getCode());
         employement.setEmail(employmentDto.getEmail());
         Employement employementSave = repositoryEmployeeMent.save(employement);
         EmploymentDto employmentDtoSave = new EmploymentDto();
         employmentDtoSave.setId(employementSave.getId());
         employmentDtoSave.setFirstName(employementSave.getFirstName());
         employmentDtoSave.setLastName(employementSave.getLastName());
         employmentDtoSave.setEmail(employementSave.getEmail());
         employmentDtoSave.setCode(employementSave.getCode());
         return employmentDtoSave;
    }

    @Override
    public APIResponseDto getEmployeeById(Long id) {
        Employement  employement = repositoryEmployeeMent.findById(id).get();
   //  DepartmentDto departmentDto = webClient.get().uri("http://localhost:8080/api/departments/"
     //                + employement.getCode())
       //         .retrieve().bodyToMono(DepartmentDto.class).block();
        DepartmentDto departmentDto = apiClient.getDepartmentByCode(employement.getCode());
        EmploymentDto employmentDto = new EmploymentDto();
        employmentDto.setId(employement.getId());
        employmentDto.setFirstName(employement.getFirstName());
        employmentDto.setLastName(employement.getLastName());
        employmentDto.setEmail(employement.getEmail());
        employmentDto.setCode(employement.getCode());
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setEmploymentDto(employmentDto);
        apiResponseDto.setDepartmentDto(departmentDto);
        return apiResponseDto;
    }
}
