package com.yegorpriimak.spring.mvc.dao;

import com.yegorpriimak.spring.mvc.entity.Subscriber;

import java.util.List;

public interface SubscriberDAO {
    public List<Subscriber> getAllSubscribers();

    public void saveSubscriber(Subscriber subscriber);
}
