package dev.mohini.interviewbitclone.controllers;

import dev.mohini.interviewbitclone.dto.ResponseDTO;
import dev.mohini.interviewbitclone.models.User;
import dev.mohini.interviewbitclone.services.UserService;
import dev.mohini.interviewbitclone.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.UUID;

@RestController
@RequestMapping(Constants.USERS_END_POINT)
public class UserController {

    @Autowired
    UserService userService;


   @PostMapping
    public User createUser(@RequestBody User user)
    {
      return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public ResponseDTO<User> getUserById(@PathVariable(name="id") UUID id)
    {
        User serviceResponse= userService.getUserById(id);
        if(serviceResponse==null)
            return new ResponseDTO(HttpStatus.NOT_FOUND,serviceResponse);
        return new ResponseDTO(HttpStatus.FOUND, serviceResponse);
    }
}
