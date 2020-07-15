package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class SearchFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findCompanies(final String letters) throws SearchFacadeException {
        LOGGER.info("Searching companies by partname");
        List<Company> companies = companyDao.searchCompanyByPartname(letters);
        int companiesAmount = companies.size();
        if (companiesAmount == 0) {
            LOGGER.error(SearchFacadeException.ERR_COMPANY_NOT_FOUND);
            throw new SearchFacadeException(SearchFacadeException.ERR_COMPANY_NOT_FOUND);
        }
        return companies;
    }

    public List<Employee> findEmployees(final String letters) throws SearchFacadeException {
        LOGGER.info("Searching employees by partname");
        List<Employee> employees = employeeDao.findByFewLetters("%" + letters + "%");
        int employeesAmount = employees.size();
        if (employeesAmount == 0) {
            LOGGER.error(SearchFacadeException.ERR_EMPLOYEE_NOT_FOUND);
            throw new SearchFacadeException(SearchFacadeException.ERR_EMPLOYEE_NOT_FOUND);
        }

        return employees;
    }
}