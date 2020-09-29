USE db;
CREATE TABLE author(
	id int PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INTEGER, 
    country Varchar(20)
);
CREATE TABLE book(
	id int PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    author_id INTEGER,
    FOREIGN KEY (authorId) REFERENCES author(id)
);