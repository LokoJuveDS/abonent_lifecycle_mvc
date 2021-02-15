package com.yegorpriimak.spring.mvc.controller;

import com.yegorpriimak.spring.mvc.dao.SubscriberDAO;
import com.yegorpriimak.spring.mvc.entity.Subscriber;
import com.yegorpriimak.spring.mvc.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private SubscriberService subscriberService;

    @RequestMapping("/")
    public String showAllSubscribers(Model model) {
        List<Subscriber> allSubscribers = subscriberService.getAllSubscribers();
        model.addAttribute("allSubs", allSubscribers);
        return "all-subscribers";
    }
}
