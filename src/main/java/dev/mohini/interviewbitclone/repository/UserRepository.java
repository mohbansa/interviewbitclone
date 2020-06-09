package dev.mohini.interviewbitclone.repository;

import dev.mohini.interviewbitclone.models.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository  {

    public User createUser(User user);

    public Optional<User> getUserById(UUID id);
}
