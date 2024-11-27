package ru.practicum.shareit.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.practicum.shareit.request.dto.ItemRequestDto;
import ru.practicum.shareit.request.dto.ItemRequestResponse;
import ru.practicum.shareit.request.service.ItemRequestService;

import java.util.List;

/**
 * TODO Sprint add-item-requests.
 */
@RestController
@RequestMapping(path = "/requests")
@RequiredArgsConstructor
public class ItemRequestController {
    private final ItemRequestService itemRequestService;

    @GetMapping("/{id}")
    public ItemRequestResponse get(@PathVariable Long id) {
        return itemRequestService.get(id);
    }

    @GetMapping
    public List<ItemRequestResponse> getAll() {
        return itemRequestService.getAll();
    }

    @PostMapping
    public ItemRequestResponse create(@NotNull @Positive @RequestHeader("X-Sharer-User-Id") Long userId,
                                      ItemRequestDto request) {
        return itemRequestService.create(userId, request);
    }

    @PatchMapping
    public ItemRequestResponse patch(@NotNull @Positive @RequestHeader("X-Sharer-User-Id") Long userId,
                                     ItemRequestDto request) {
        return itemRequestService.patch(userId, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull @Positive @RequestHeader("X-Sharer-User-Id") Long userId,
                       @PathVariable Long id) {
        itemRequestService.delete(userId, id);
    }
}
