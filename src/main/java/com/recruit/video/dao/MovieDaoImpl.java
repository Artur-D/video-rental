package com.recruit.video.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.recruit.video.model.Movie;

@Repository
@Transactional
public class MovieDaoImpl implements MovieDao {

	@Autowired
	private SessionFactory sessionFactory;

    @Override
	@SuppressWarnings("unchecked")
	public List<Movie> getAllMovies() {
		return getSession()
				.createQuery("from Movie").list();
	}

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

}
