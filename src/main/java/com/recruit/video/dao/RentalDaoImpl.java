package com.recruit.video.dao;

import com.recruit.video.model.Rental;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class RentalDaoImpl implements RentalDao {
	
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    @SuppressWarnings("unchecked")
    public Rental findById(int id) {
        return (Rental) getSession().get(Rental.class, id);
    }

    @Override
    public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
