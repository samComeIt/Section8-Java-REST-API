package com.rest.webservices.restfulwebservice.jpa;

import com.rest.webservices.restfulwebservice.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
