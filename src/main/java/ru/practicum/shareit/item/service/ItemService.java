package ru.practicum.shareit.item.service;

import ru.practicum.shareit.item.dto.ItemDto;

import java.util.List;

public interface ItemService {
    ItemDto getOne(Long id);

    ItemDto create(Long userId, ItemDto request);

    ItemDto patch(Long id, Long userId, ItemDto request);

    void delete(Long id, Long userId);

    List<ItemDto> getAllForUser(Long id);

    List<ItemDto> getForSearch(String text);
}
