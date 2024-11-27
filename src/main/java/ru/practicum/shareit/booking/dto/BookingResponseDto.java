package ru.practicum.shareit.booking.dto;

import lombok.Builder;
import ru.practicum.shareit.booking.model.BookingState;
import ru.practicum.shareit.booking.model.BookingStatus;
import ru.practicum.shareit.item.dto.ItemResponse;
import ru.practicum.shareit.user.dto.UserResponse;

import java.time.LocalDateTime;

@Builder
public record BookingResponseDto(
        Long id,
        LocalDateTime start,
        LocalDateTime end,
        ItemResponse item,
        UserResponse booker,
        BookingStatus status,
        BookingState state
) {
}
