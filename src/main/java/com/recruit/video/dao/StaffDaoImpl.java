package com.recruit.video.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.recruit.video.model.Staff;

public class StaffDaoImpl implements StaffDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    @SuppressWarnings("unchecked")
    public Staff findById(int id) {
        return (Staff) getSession().get(Staff.class, id);
    }

    @Override
    public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
