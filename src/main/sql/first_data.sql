insert into movie(movie_id, title, description) values
    (1, "film", "film o niczym"),
    (2, "film 2", "film o czyms"),
    (3, "film 3", "test");
    
insert into staff(staff_id, first_name, last_name) values
	(1, "john", "carmack"),
	(2, "johnny", "bravo"),
	(3, "anne", "kowalski");

insert into customer(customer_id, first_name, last_name, join_date) values
    (1, "adam", "b", '2013-12-01'),
    (2, "bartosz", "c", '2013-12-11'),
    (3, "cezary", "d", '2013-12-22');

insert into rental(rental_id, rental_date, movie_id, customer_id, staff_id, return_date) values
    (1, '2014-03-01', 3, 1, 1, '2014-12-01'),
    (2, '2014-04-01', 2, 2, 1, '2015-02-11'),
    (3, '2014-05-01', 1, 1, 2, '2014-09-22');