package dev.mohini.interviewbitclone.repository;

import dev.mohini.interviewbitclone.models.User;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("inMemory")
public class UserRepositoryImpl implements UserRepository {
    List<User> userDatabase=new ArrayList<>();
    @Override
    public User createUser(User user) {
        User createdUser=new User(user.getName(), user.getGender());
        userDatabase.add(createdUser);
        return createdUser;
    }

    @Override
    public Optional<User> getUserById(UUID id) {

       return userDatabase.stream().filter(user -> user.getUuid().equals(id)).findFirst();

    }
}
