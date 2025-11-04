-- Schema for Hospital Management System (MySQL)
-- Note: The database (hospital_db) must exist for this to run via Spring Boot.

CREATE TABLE IF NOT EXISTS patients (
  id BIGINT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(100) NOT NULL,
  last_name VARCHAR(100) NOT NULL,
  age INT NOT NULL,
  gender VARCHAR(20) NOT NULL,
  contact_number VARCHAR(20) NOT NULL,
  diagnosis VARCHAR(255) NOT NULL,
  admission_date DATE NOT NULL,
  PRIMARY KEY (id)
);


