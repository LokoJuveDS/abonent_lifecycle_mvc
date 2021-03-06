package com.yegorpriimak.spring.mvc.dao;

import com.yegorpriimak.spring.mvc.entity.Subscriber;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository //для поиска по @Component
public class SubscribersDAOImpl implements SubscriberDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override

    public List<Subscriber> getAllSubscribers() {

        Session session = sessionFactory.getCurrentSession();
        List<Subscriber> allSubscribers = session.createQuery("from Subscriber", Subscriber.class).getResultList();
        return allSubscribers;
    }

    @Override
    public void saveSubscriber(Subscriber subscriber) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(subscriber);
    }

    @Override
    public Subscriber getSubscriber(int id) {
        Session session = sessionFactory.getCurrentSession();
        Subscriber subscriber = session.get(Subscriber.class, id);
        return subscriber;
    }

    @Override
    public void deleteSubscriber(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Subscriber> query = session.createQuery("delete from Subscriber where id =:subscriberId");
        query.setParameter("subscriberId", id);
        query.executeUpdate();
    }
}
