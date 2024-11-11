package ru.practicum.shareit.utility;

import jakarta.validation.Constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = CheckId.class)
public @interface MinId {
    String message() default "ID не может быть меньше {value}";
    Class<?>[] groups() default {};
    Class<?>[] payload() default {};
    String value() default "1";
}
