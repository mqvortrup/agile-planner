/*
 * Copyright (c) 2017. Michael Qvortrup
 */

package com.qm.planner.server.spring;

/**
 * Created by michael on 07.07.17.
 */

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/planner")
public class PlannerController {

    @RequestMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}