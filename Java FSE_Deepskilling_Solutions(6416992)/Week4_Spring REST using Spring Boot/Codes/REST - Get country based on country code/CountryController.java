package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    // Endpoint to get the default "India" country bean
    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START - getCountryIndia()");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        LOGGER.info("END   - getCountryIndia()");
        return country;
    }

    // Endpoint to get a country based on country code (case-insensitive)
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.info("START - getCountry() with code: {}", code);
        Country country = countryService.getCountry(code);
        LOGGER.info("END   - getCountry() => {}", country);
        return country;
    }
}
