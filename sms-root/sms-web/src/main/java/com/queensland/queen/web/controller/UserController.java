package com.queensland.queen.web.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    @ResponseBody
    public String test(@RequestParam String name) {
        return "hi, " + name;
    }
}
