package ru.practicum.shareit.utility;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import ru.practicum.shareit.exception.MinimalIdException;

public class CheckId implements ConstraintValidator<MinId, Long> {
    private Long minimalId;

    @Override
    public void initialize(MinId constraintAnnotation) {
        minimalId = Long.valueOf(constraintAnnotation.value());
    }

    @Override
    public boolean isValid(Long id, ConstraintValidatorContext constraintValidatorContext) {
        if (id != null && id < minimalId) {
            throw new MinimalIdException("ID не может быть меньше 1");
        } else {
            return true;
        }
    }
}
