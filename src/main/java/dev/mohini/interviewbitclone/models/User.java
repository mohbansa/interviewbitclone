package dev.mohini.interviewbitclone.models;

import dev.mohini.interviewbitclone.utils.Constants;
import lombok.Data;

import java.util.UUID;

@Data
public class User {

    private String name;
    private UUID uuid;
    private Constants.Gender gender;

    public User(String name, Constants.Gender gender)
    {
        this.uuid=UUID.randomUUID();
        this.name=name;
        this.gender=gender;
    }
}
