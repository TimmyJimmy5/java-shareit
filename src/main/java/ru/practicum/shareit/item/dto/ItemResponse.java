package ru.practicum.shareit.item.dto;

import ru.practicum.shareit.booking.dto.BookingResponseDto;
import ru.practicum.shareit.request.dto.ItemRequestResponse;
import ru.practicum.shareit.user.dto.UserResponse;

import java.util.List;

public record ItemResponse(
        Long id,
        String name,
        String description,
        Boolean available,
        UserResponse owner,
        BookingResponseDto lastBooking,
        BookingResponseDto nextBooking,
        List<CommentResponse> comments,
        ItemRequestResponse itemRequest,
        Integer rentCount
) {
}
