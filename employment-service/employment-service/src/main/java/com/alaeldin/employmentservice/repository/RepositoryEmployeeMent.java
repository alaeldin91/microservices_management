package com.alaeldin.employmentservice.repository;

import com.alaeldin.employmentservice.entity.Employement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryEmployeeMent extends JpaRepository<Employement,Long> {
    Employement findByEmail(String email);
}
