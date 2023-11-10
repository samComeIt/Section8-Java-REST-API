package com.rest.webservices.restfulwebservice.jpa;

import com.rest.webservices.restfulwebservice.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
