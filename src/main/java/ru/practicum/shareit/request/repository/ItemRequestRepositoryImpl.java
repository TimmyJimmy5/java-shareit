package ru.practicum.shareit.request.repository;

import org.springframework.stereotype.Repository;
import ru.practicum.shareit.base.BaseRepositoryImpl;
import ru.practicum.shareit.request.model.ItemRequest;

@Repository
public class ItemRequestRepositoryImpl extends BaseRepositoryImpl<ItemRequest> implements ItemRequestRepository {
}
