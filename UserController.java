package com.example.resttest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

    @RestController
    public class UserController {

        @GetMapping("/getFacts")
        public int getFact(@RequestParam(value = "number", defaultValue = "0") int number) {
            User mynum(number);
            for (int i = 2; i <= mynum ; i++) {
                return calculateFact();
            }
        }

    }
