DROP TABLE IF EXISTS train_ticket_booking;  
create table train_ticket_booking (id integer PRIMARY KEY,t_user VARCHAR(50) NOT NULL, t_from VARCHAR(50) NOT NULL, , t_to VARCHAR(50) NOT NULL, price_paid  DOUBLE PRECISION);

DROP TABLE IF EXISTS train_user;  
create table train_user (  id integer  PRIMARY KEY,  first_name VARCHAR(50) NOT NULL,  last_name VARCHAR(50) NOT NULL,  email_address VARCHAR(50) NOT NULL);