package ru.practicum.shareit.booking;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.practicum.shareit.booking.dto.BookingDTO;
import ru.practicum.shareit.booking.dto.BookingResponse;
import ru.practicum.shareit.booking.model.BookingState;
import ru.practicum.shareit.booking.service.BookingService;

import java.time.LocalDateTime;
import java.util.List;

/**
 * TODO Sprint add-bookings.
 */
@RestController
@RequestMapping(path = "/bookings")
@RequiredArgsConstructor
public class BookingController {
    private final BookingService bookingService;

    @GetMapping("/{id}")
    public BookingResponse getForUser(@PathVariable Long id,
                                      @NotNull @Positive @RequestHeader("X-Sharer-User-Id") Long userId) {
        return bookingService.getForUser(id, userId);
    }

    @GetMapping
    public List<BookingResponse> getAllForBooker(@NotNull @Positive @RequestHeader("X-Sharer-User-Id") Long bookerId,
                                                 @RequestParam(
                                                         value = "state",
                                                         required = false,
                                                         defaultValue = "ALL") BookingState state) {
        return bookingService.getAllForBooker(bookerId, state);
    }

    @PostMapping
    public BookingResponse create(@NotNull @Positive @RequestHeader("X-Sharer-User-Id") Long userId,
                                  @Valid @RequestBody BookingDTO request) {
        System.out.println(LocalDateTime.now());
        System.out.println(request.getStart());
        return bookingService.create(userId, request);
    }

    @PatchMapping("/{id}")
    public BookingResponse patch(@PathVariable Long id,
                                 @NotNull @Positive @RequestHeader("X-Sharer-User-Id") Long userId,
                                 @RequestBody(required = false) BookingDTO request,
                                 @RequestParam(value = "approved", required = false) Boolean isAccept) {
        if (isAccept != null) {
            return bookingService.acceptBooking(id, userId, isAccept);
        } else {
            return bookingService.patch(id, userId, request);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id,
                       @NotNull @Positive @RequestHeader("X-Sharer-User-Id") Long userId) {
        bookingService.delete(id, userId);
    }

    @GetMapping("/owner")
    public List<BookingResponse> getAllForOwner(@NotNull @Positive @RequestHeader("X-Sharer-User-Id") Long userId,
                                                @RequestParam(
                                                        value = "state",
                                                        required = false,
                                                        defaultValue = "ALL") BookingState state) {
        return bookingService.getAllForOwner(userId, state);
    }
}
