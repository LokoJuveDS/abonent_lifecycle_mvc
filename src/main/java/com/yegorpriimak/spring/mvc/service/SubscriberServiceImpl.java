package com.yegorpriimak.spring.mvc.service;

import com.yegorpriimak.spring.mvc.dao.SubscriberDAO;
import com.yegorpriimak.spring.mvc.entity.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service //для поиска по @Component
public class SubscriberServiceImpl implements SubscriberService {

    @Autowired
    private SubscriberDAO subscriberDAO;

    @Override
    @Transactional
    public List<Subscriber> getAllSubscribers() {
        return subscriberDAO.getAllSubscribers();
    }
}
