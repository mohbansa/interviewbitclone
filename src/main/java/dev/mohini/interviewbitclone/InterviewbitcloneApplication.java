package dev.mohini.interviewbitclone;

import dev.mohini.interviewbitclone.models.User;
import dev.mohini.interviewbitclone.utils.Constants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewbitcloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewbitcloneApplication.class, args);

        User user=new User("Mohini", Constants.Gender.FEMALE);




    }

}
