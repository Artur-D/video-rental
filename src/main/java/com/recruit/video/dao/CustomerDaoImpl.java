package com.recruit.video.dao;

import com.recruit.video.model.Customer;
import com.recruit.video.model.Movie;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public Customer findById(int id) {
        return (Customer) getSession().get(Customer.class, id);
    }

    @Override
    public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
