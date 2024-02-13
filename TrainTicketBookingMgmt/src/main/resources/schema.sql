DROP TABLE IF EXISTS train_ticket_booking ;  
CREATE TABLE train_ticket_booking (  
id INT AUTO_INCREMENT  PRIMARY KEY,  
t_user VARCHAR(50) NOT NULL,  
t_from VARCHAR(50) NOT NULL,
t_to VARCHAR(50) NOT NULL,
price_paid double precision
);

DROP TABLE IF EXISTS train_user;  
CREATE TABLE train_user (  
id INT AUTO_INCREMENT  PRIMARY KEY,  
first_name VARCHAR(50) NOT NULL,  
last_name VARCHAR(50) NOT NULL,
email_address VARCHAR(50) NOT NULL
);  