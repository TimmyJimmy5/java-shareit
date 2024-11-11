package ru.practicum.shareit.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import ru.practicum.shareit.utility.MinId;

@Data
@Builder
public class UserDto {
    @MinId
    private Long id;
    @NotNull
    private String name;
    @Email
    @NotNull
    private String email;
}
