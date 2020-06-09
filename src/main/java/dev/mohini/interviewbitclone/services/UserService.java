package dev.mohini.interviewbitclone.services;

import dev.mohini.interviewbitclone.models.User;
import dev.mohini.interviewbitclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {


    UserRepository userRepository;

    @Autowired
    UserService(@Qualifier("postgres") UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }

    public User createUser(User user)
    {
        return userRepository.createUser(user);
    }

    public User getUserById(UUID id)
    {
        Optional<User> foundUser= userRepository.getUserById(id);
        return foundUser.isEmpty()?null:foundUser.get();
    }
}
