package ru.practicum.shareit.item.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.practicum.shareit.base.BaseEntity;
import ru.practicum.shareit.request.model.ItemRequest;
import ru.practicum.shareit.user.User;

/**
 * TODO Sprint add-controllers.
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Builder
public class Item extends BaseEntity {
    private Long id;
    private String name;
    private String description;
    private Boolean available;
    private User owner;
    private ItemRequest itemRequest;
    private Integer rentCount;
}
