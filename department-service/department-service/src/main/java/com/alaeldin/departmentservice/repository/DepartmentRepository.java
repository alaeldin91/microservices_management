package com.alaeldin.departmentservice.repository;

import com.alaeldin.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
     Department findByCode(String code);
}
