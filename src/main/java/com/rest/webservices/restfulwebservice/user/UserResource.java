package com.rest.webservices.restfulwebservice.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    private UserDaoService service;

    public UserResource(UserDaoService service)
    {
        this.service = service;
    }

    // GET /users
    @GetMapping("/users")
    public List<User> retrieveAllUsers()
    {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id)
    {
        return service.findOne(id);
    }

    //POST /users
    @PostMapping("/users")
    public void createUser(@RequestBody User user)
    {
        service.save(user);
    }
}
