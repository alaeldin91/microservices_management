package com.alaeldin.organizationservice.service.impl;

import com.alaeldin.organizationservice.dto.OrganizationDto;
import com.alaeldin.organizationservice.entity.Organiztion;
import com.alaeldin.organizationservice.mapper.OrganizationMapper;
import com.alaeldin.organizationservice.repository.OrganizationRepository;
import com.alaeldin.organizationservice.service.OrganizeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationImpl  implements OrganizeService {
    private OrganizationRepository organizationRepository;
    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

        Organiztion organiztion = OrganizationMapper.mapToOrganization(organizationDto);

        Organiztion saveOrganization = organizationRepository.save(organiztion);

        return OrganizationMapper.mapToOrganizationDto(saveOrganization);
    }

    @Override
    public OrganizationDto getOrganizationCode(String organizationCode) {
        Organiztion organiztion = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organiztion);
    }
}
