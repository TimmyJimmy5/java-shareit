package ru.practicum.shareit.user.repository;

import org.springframework.stereotype.Repository;
import ru.practicum.shareit.base.BaseRepositoryImpl;
import ru.practicum.shareit.user.User;

@Repository
public class UserRepositoryImpl extends BaseRepositoryImpl<User> implements UserRepository {
}
