package com.alaeldin.organizationservice.controll;

import com.alaeldin.organizationservice.dto.OrganizationDto;
import com.alaeldin.organizationservice.service.impl.OrganizationImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/organizations")
@AllArgsConstructor
public class OrganizationController {
private OrganizationImpl organizationImpl;
@PostMapping
public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto){

    OrganizationDto  savedOrganizationDto = organizationImpl.saveOrganization(organizationDto);

    return new ResponseEntity<>(savedOrganizationDto, HttpStatus.CREATED);
}

@GetMapping("/{organizationCode}")
public ResponseEntity<OrganizationDto> getOrganizationCode(@PathVariable("organizationCode") String organizationCode){
    OrganizationDto organizationDto = organizationImpl.getOrganizationCode(organizationCode);
    return  new ResponseEntity<>(organizationDto,HttpStatus.OK);
}
}
