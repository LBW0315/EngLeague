CREATE TABLE IF NOT EXISTS word (
     id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
     word VARCHAR(255) NOT NULL,
     schoolyear INT NOT NULL,  
     unit VARCHAR(255) NOT NULL,
     mean VARCHAR(255) NOT NULL
 );