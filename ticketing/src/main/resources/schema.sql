DROP Table IF EXISTS Theater_Hall;  
CREATE TABLE Theater_Hall (  
theater_id varchar(8)  PRIMARY KEY,  
theater_name VARCHAR(50) NOT NULL,  
type varchar (8) NOT NULL,
number_Of_Screens INT not null,
total_Capacity INT not null
);  

DROP Table IF EXISTS screen_info;  
CREATE TABLE Screen_info (  
Screen_id VARCHAR(50)  PRIMARY KEY,  
Screen_name VARCHAR(50) NOT NULL,  
theater_id varchar(8) NOT NULL FOREIGN KEY REFERENCES Theater_Hall,
capacity INT not null);

DROP Table IF EXISTS MOVIE_DETAILS;  
CREATE TABLE MOVIE_DETAILS (  
MOVIE_id VARCHAR(50)  PRIMARY KEY,  
MOVIE_name VARCHAR(50) NOT NULL, 
MOVIE_CAST varchar(50) not null, 
LANGUAGE varchar(50) NOT NULLl,
GENERE varchar(50));