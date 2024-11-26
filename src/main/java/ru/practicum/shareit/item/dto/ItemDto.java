package ru.practicum.shareit.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import ru.practicum.shareit.request.dto.ItemRequestDto;
import ru.practicum.shareit.user.dto.UserDto;
import ru.practicum.shareit.utility.MinId;

/**
 * TODO Sprint add-controllers.
 */
@Data
public class ItemDto {
    @MinId
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @NotNull
    private Boolean available;
    private UserDto owner;
    private ItemRequestDto itemRequestDto;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer rentCount;
}
