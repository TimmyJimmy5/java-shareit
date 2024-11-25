package ru.practicum.shareit.booking.service;

import ru.practicum.shareit.booking.dto.BookingDto;
import ru.practicum.shareit.booking.dto.BookingResponse;
import ru.practicum.shareit.booking.model.BookingState;

import java.util.List;

public interface BookingService {
    BookingResponse getForUser(Long id, Long userId);

    BookingResponse create(Long userId, BookingDto request);

    BookingResponse patch(Long id, Long userId, BookingDto request);

    void delete(Long id, Long userId);

    BookingResponse acceptBooking(Long id, Long userId, Boolean isAccept);

    List<BookingResponse> getAllForBooker(Long bookerId, BookingState state);

    List<BookingResponse> getAllForOwner(Long ownerId, BookingState state);
}
