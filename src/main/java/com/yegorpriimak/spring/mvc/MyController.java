package com.yegorpriimak.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/")
    public String returnFirstView() {
        return "first-view";
    }
}
