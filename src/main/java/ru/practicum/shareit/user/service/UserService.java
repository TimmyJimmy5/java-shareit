package ru.practicum.shareit.user.service;

import ru.practicum.shareit.user.dto.UserDto;

public interface UserService {
    UserDto get(Long id);

    UserDto create(UserDto request);

    UserDto patch(Long id, UserDto request);

    void delete(Long id);
}
