package com.alaeldin.organizationservice.mapper;

import com.alaeldin.organizationservice.dto.OrganizationDto;
import com.alaeldin.organizationservice.entity.Organiztion;

public class OrganizationMapper {
    public static OrganizationDto mapToOrganizationDto(Organiztion organiztion){
        OrganizationDto organizationDto = new OrganizationDto(
                organiztion.getId(),
                organiztion.getOrganizationName(),
                organiztion.getOrganizationDescription(),
                organiztion.getOrganizationCode() ,
                organiztion.getCreateDate()
        );
        return organizationDto;
    }
    public static Organiztion mapToOrganization(OrganizationDto organizationDto){
        Organiztion organiztion = new Organiztion(
                organizationDto.getId(),
                organizationDto.getOrganizationName(),
                organizationDto.getOrganizationDescription(),
                organizationDto.getOrganizationCode(),
                organizationDto.getCreateDate()
        );
        return organiztion;
    }
}
