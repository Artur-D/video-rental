CREATE TABLE movie (
  movie_id             SMALLINT     UNSIGNED NOT NULL AUTO_INCREMENT,
  title                VARCHAR(255) NOT NULL,
  description          TEXT         DEFAULT NULL,       -- Up to 64KB
  release_year         YEAR         DEFAULT NULL,       
  rental_price          DECIMAL(4,2) NOT NULL DEFAULT 4.99,  
  length_minutes        SMALLINT     UNSIGNED DEFAULT NULL,  -- 16-bit unsigned int [0, 65535]
  rented                BOOLEAN    DEFAULT FALSE,
  last_update          TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (movie_id),
  KEY index_title (title)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE staff (
  staff_id     TINYINT     UNSIGNED NOT NULL AUTO_INCREMENT,
  first_name   VARCHAR(45) NOT NULL,
  last_name    VARCHAR(45) NOT NULL, 
  PRIMARY KEY  (staff_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE rental (
  rental_id     MEDIUMINT        UNSIGNED NOT NULL AUTO_INCREMENT,
  rental_date   DATETIME   NOT NULL,
  movie_id      MEDIUMINT  UNSIGNED NOT NULL,
  customer_id   SMALLINT   UNSIGNED NOT NULL,
  return_date   DATE   DEFAULT NULL,
  staff_id      TINYINT    UNSIGNED NOT NULL,
  last_update   TIMESTAMP  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (rental_id),
  UNIQUE KEY  (rental_date, movie_id, customer_id),
  KEY idx_fk_inventory_id (movie_id),
  KEY idx_fk_customer_id (customer_id),
  KEY idx_fk_staff_id (staff_id),
  CONSTRAINT fk_rental_staff FOREIGN KEY (staff_id) REFERENCES staff (staff_id)
    ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT fk_rental_customer FOREIGN KEY (customer_id) REFERENCES customer (customer_id)
    ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE customer (
  customer_id  SMALLINT    UNSIGNED NOT NULL AUTO_INCREMENT,
  first_name   VARCHAR(45) NOT NULL,
  last_name    VARCHAR(45) NOT NULL,
  email        VARCHAR(50) DEFAULT NULL,
  join_date     DATE    NOT NULL,
  last_update  TIMESTAMP   DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY  (customer_id),
  KEY idx_last_name (last_name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;