package com.recruit.video.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "rental")
public class Rental {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "rental_id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "rental_date")
	private Date rentalDate;

	@OneToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;

	@OneToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@Column(name = "return_date")
	private Date returnDate;

	@OneToOne
	@JoinColumn(name = "staff_id")
	private Staff staff;

	@Column(name = "last_update")
	private Date lastUpdate;

	public Integer getId() {
		return id;
	}

	public Date getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
