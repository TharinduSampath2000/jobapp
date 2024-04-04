package com.firstspring.jobapp.repositories;

import com.firstspring.jobapp.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
