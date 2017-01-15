package com.aquariusmaster;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("/jquery")
    String jquery() {
        return "jquery";
    }

    @RequestMapping("/main")
    String main() {
        return "main";
    }

    @RequestMapping("/rest")
    @ResponseBody
    String rest(){
        return "This is response return";
    }

    @RequestMapping("/getrest")
    String getRest() {
        return "getrest";
    }
}
