DROP TABLE IF EXISTS train_ticket_booking;  
create table train_ticket_booking (id integer PRIMARY KEY,user VARCHAR(50) NOT NULL, from VARCHAR(50) NOT NULL, pricePaid  DOUBLE PRECISION);

DROP TABLE IF EXISTS train_user;  
create table train_user (  id integer  PRIMARY KEY,  firstName VARCHAR(50) NOT NULL,  lastName VARCHAR(50) NOT NULL,  emailAddress VARCHAR(50) NOT NULL); 