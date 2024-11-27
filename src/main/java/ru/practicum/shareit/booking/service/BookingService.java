package ru.practicum.shareit.booking.service;

import ru.practicum.shareit.booking.dto.BookingDto;
import ru.practicum.shareit.booking.dto.BookingResponseDto;
import ru.practicum.shareit.booking.model.BookingState;

import java.util.List;

public interface BookingService {
    BookingResponseDto getForUser(Long id, Long userId);

    BookingResponseDto create(Long userId, BookingDto request);

    BookingResponseDto patch(Long id, Long userId, BookingDto request);

    void delete(Long id, Long userId);

    BookingResponseDto acceptBooking(Long id, Long userId, Boolean isAccept);

    List<BookingResponseDto> getAllForBooker(Long bookerId, BookingState state);

    List<BookingResponseDto> getAllForOwner(Long ownerId, BookingState state);
}
