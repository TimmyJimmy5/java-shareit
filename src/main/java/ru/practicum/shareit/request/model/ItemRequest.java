package ru.practicum.shareit.request.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.practicum.shareit.base.BaseEntity;
import ru.practicum.shareit.user.User;

import java.time.LocalDateTime;

/**
 * TODO Sprint add-item-requests.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class ItemRequest extends BaseEntity {
    private Long id;
    private String description;
    private User requestor;
    private LocalDateTime created;
}
