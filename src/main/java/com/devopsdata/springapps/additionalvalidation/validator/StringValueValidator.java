package com.devopsdata.springapps.additionalvalidation.validator;

import com.devopsdata.springapps.additionalvalidation.controller.Data;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class StringValueValidator {

    public void validate(String language, Data data, Errors errors) {
        if (!"de-DE".equals(language)) {
            if (data.getSomeStringValue().length() > 140) {
                errors.reject("someStringValue");
            }
        }
    }
}
