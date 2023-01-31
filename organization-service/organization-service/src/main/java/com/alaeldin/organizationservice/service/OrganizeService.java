package com.alaeldin.organizationservice.service;

import com.alaeldin.organizationservice.dto.OrganizationDto;

public interface OrganizeService {
    OrganizationDto saveOrganization(OrganizationDto organizationDto);
    OrganizationDto  getOrganizationCode(String  organizationCode);
}
