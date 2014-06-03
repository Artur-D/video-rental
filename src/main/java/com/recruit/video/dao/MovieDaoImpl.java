package com.recruit.video.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.recruit.video.model.Customer;
import com.recruit.video.model.Rental;
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

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private StaffDao staffDao;

    @Override
	@SuppressWarnings("unchecked")
	public List<Movie> getAllMovies() {
		return getSession()
				.createQuery("from Movie").list();
	}

    @Override
    @SuppressWarnings("unchecked")
    public Movie findById(int id) {
        return (Movie) getSession().get(Movie.class, id);
    }

    @Override
    public Serializable rentMovie(int movieId, int customerId, int staffId) {
        Rental rental = new Rental();
        rental.setRentalDate(new Date());
        rental.setMovie(findById(movieId));
        rental.setCustomer(customerDao.findById(customerId));
        rental.setStaff(staffDao.findById(staffId));

        Serializable id = getSession().save(rental);
        return id;
    }

    @Override
    public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

}
