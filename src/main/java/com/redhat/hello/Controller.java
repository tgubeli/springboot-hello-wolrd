package com.redhat.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/hello", method = RequestMethod.GET, produces = { "application/json" })
    public String hello() {
        return "{'greetings':'Hello world!'}";
    }
}
