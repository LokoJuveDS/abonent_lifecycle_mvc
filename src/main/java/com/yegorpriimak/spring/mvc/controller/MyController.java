package com.yegorpriimak.spring.mvc.controller;

import com.yegorpriimak.spring.mvc.entity.Subscriber;
import com.yegorpriimak.spring.mvc.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
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

    @RequestMapping("/addNewSubscriber")
    public String addNewSubscriber(Model model) {
        Subscriber subscriber = new Subscriber();
        model.addAttribute("subscriber", subscriber);
        return "subscriber-info";
    }

    @RequestMapping("/saveSubscriber")
    public String saveSubscriber(@Valid @ModelAttribute("subscriber") Subscriber subscriber, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "subscriber-info";
        } else {
            subscriberService.saveSubscriber(subscriber);
            return "redirect:/";
        }
    }

    @RequestMapping("/refillBalance")
    public String refillBalance(@RequestParam("subId") int id, Model model) {
        Subscriber subscriber = subscriberService.getSubscriber(id);
        model.addAttribute("subscriber", subscriber);
        return "refill-balance";
    }

    @RequestMapping("/updateInfo")
    public String updateSubscriber(@RequestParam("subId") int id, Model model) {
        Subscriber subscriber = subscriberService.getSubscriber(id);
        model.addAttribute("subscriber", subscriber);
        return "subscriber-info";
    }

    @RequestMapping("/deleteSubscriber")
    public String deleteSubscriber(@RequestParam("subId") int id) {
        subscriberService.deleteSubscriber(id);
        return "redirect:/";
    }
}
