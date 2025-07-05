package com.cognizant.orm_learn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.EmployeeService;

@SpringBootApplication
@EntityScan("com.cognizant.orm_learn.model") 
public class OrmLearnApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    @Autowired
    private CountryService countryService;

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    private void testGetAllCountries() {
        LOGGER.info("Start");

        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);

        LOGGER.info("End");
    }

    @Override
    public void run(String... args) throws Exception {
        testGetAllCountries(); // Optional: call this from run

        Employee emp = new Employee("Agarshana", "IT", 750);
        employeeService.addEmployee(emp);
        System.out.println("Employee added successfully.");
    }
}
