package com.aquariusmaster;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by andreb on 04.12.16.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    String home() {
        return "forward:index.html";
    }

    @RequestMapping("/start")
    String start() {
        return "start";
    }

    @RequestMapping("/login")
    String login() {
        return "login";
    }
}
