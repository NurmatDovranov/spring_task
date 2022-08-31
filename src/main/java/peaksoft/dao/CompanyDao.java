package peaksoft.dao;

import peaksoft.entity.Company;
import peaksoft.entity.Student;

import java.util.List;

public interface CompanyDao {

    void saveCompany(Company company);

    void updateCompany(Long id, Company company);

    List<Company> getAllCompanies();

    Company getCompanyById(Long id);

    void deleteCompanyById(Long id);

    List<Student> countOfStudents();
}
