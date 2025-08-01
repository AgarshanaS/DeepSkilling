package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.Country;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryService {
     public Country getCountry(String code) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml")) {
            List<Country> countryList = (List<Country>) context.getBean("countryList");

            // Case-insensitive match using lambda
            return countryList.stream()
                    .filter(country -> country.getCode().equalsIgnoreCase(code))
                    .findFirst()
                    .orElse(null);
        }
    }
}
