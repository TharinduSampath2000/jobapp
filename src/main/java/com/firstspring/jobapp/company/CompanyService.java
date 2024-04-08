package com.firstspring.jobapp.company;

import com.firstspring.jobapp.company.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    void createCompany(Company company);
    Company getCompanyById(Long id);
    boolean deleteCompanyById(Long id);
    boolean updateCompany(Company company, Long id);
}
