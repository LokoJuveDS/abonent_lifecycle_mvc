package com.yegorpriimak.spring.mvc.service;

import com.yegorpriimak.spring.mvc.entity.Subscriber;

import java.util.List;

public interface SubscriberService {
    public List<Subscriber> getAllSubscribers();

    public void saveSubscriber(Subscriber subscriber);

    public Subscriber getSubscriber(int id);

    public void deleteSubscriber(int id);
}
