package com.redhat.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    //@RequestMapping(value="/hello", method = RequestMethod.GET, produces = { "application/json" })
    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String hello() {
        return "{'greetings':'Hello world!'}";
    }
}
