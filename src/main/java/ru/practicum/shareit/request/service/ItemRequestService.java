package ru.practicum.shareit.request.service;

import ru.practicum.shareit.request.dto.ItemRequestDto;
import ru.practicum.shareit.request.dto.ItemRequestResponse;

import java.util.List;

public interface ItemRequestService {
    ItemRequestResponse get(Long id);

    List<ItemRequestResponse> getAll();

    ItemRequestResponse create(Long userId, ItemRequestDto request);

    ItemRequestResponse patch(Long id, ItemRequestDto request);

    void delete(Long userId, Long id);
}
