package com.example.demo.meetup.patterns.simple_cof.helper;

import lombok.Getter;
import org.springframework.lang.Nullable;

@Getter
public class ValidationResult {
    private final boolean isValid;
    private final String errorMessage;
    private ValidationResult(boolean isValid, @Nullable String errorMessage) {
        this.isValid = isValid;
        this.errorMessage = errorMessage;
    }
    public static ValidationResult valid() {
        return new ValidationResult(true, null);
    }
    public static ValidationResult notValid(String errorMessage) {
        return new ValidationResult(false, errorMessage);
    }
}