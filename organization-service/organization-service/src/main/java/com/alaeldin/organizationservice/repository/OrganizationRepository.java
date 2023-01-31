package com.alaeldin.organizationservice.repository;

import com.alaeldin.organizationservice.entity.Organiztion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organiztion,Long> {
    Organiztion findByOrganizationCode(String  organizationCode);
}
