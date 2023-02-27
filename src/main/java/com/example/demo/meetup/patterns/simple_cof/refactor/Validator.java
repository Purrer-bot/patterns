package com.example.demo.meetup.patterns.simple_cof.refactor;

import com.example.demo.meetup.patterns.simple_cof.helper.ValidationResult;

public interface Validator<T> {

    ValidationResult validate(T validationEntity);
}
