package com.firstspring.jobapp.company;

import com.firstspring.jobapp.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
