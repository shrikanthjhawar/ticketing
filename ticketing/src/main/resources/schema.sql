DROP Table IF EXISTS Theater_Hall;  
CREATE TABLE Theater_Hall (  
id INT AUTO_INCREMENT  PRIMARY KEY,  
name VARCHAR(50) NOT NULL,  
type varchar (8) NOT NULL,
number_Of_Screens INT not null,
total_Capacity INT not null
);  

DROP Table IF EXISTS screen_info;  
CREATE TABLE Screen_info (  
Screen_id VARCHAR(50)  PRIMARY KEY,  
Screen_name VARCHAR(50) NOT NULL,  
theater_id int NOT NULL FOREIGN KEY REFERENCES Theater_Hall,
capacity INT not null);