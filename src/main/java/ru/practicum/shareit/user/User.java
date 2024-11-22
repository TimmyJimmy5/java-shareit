package ru.practicum.shareit.user;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.practicum.shareit.base.BaseEntity;

/**
 * TODO Sprint add-controllers.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class User extends BaseEntity {
    private Long id;
    private String name;
    private String email;
}
