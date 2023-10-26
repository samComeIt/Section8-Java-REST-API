package com.rest.webservices.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.*;

// REST ASP
@RestController
public class HelloWorldController {

    // /hello-world
    // "Hello World"
//    @RequestMapping(method = RequestMethod.GET, path="/hello-world")
//    public String helloWorld()
//    {
//        return "Hello World";
//    }

    @GetMapping(path="/hello-world")
    public String helloWorld()
    {
        return "Hello World";
    }

    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean()
    {
        return new HelloWorldBean("Hello World Bean");
    }

    @GetMapping(path="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
    {
        //return new HelloWorldBean("Hello World " + name);
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}