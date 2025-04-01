

CREATE TABLE authors (
    author_id INT auto_increment NOT NULL,
    name VARCHAR(255) NOT NULL,
    birth_year INT NOT NULL,
    country VARCHAR(255) NOT NULL,
    PRIMARY KEY (author_id)
);

CREATE TABLE members(
    member_id INT auto_increment NOT NULL,
    name VARCHAR(255) NOT NULL,
    join_date DATE NOT NULL,
    PRIMARY KEY (member_id)
);



CREATE TABLE genres (
    genre_id INT auto_increment NOT NULL,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (genre_id)
);

CREATE TABLE books
(
    book_id          INT auto_increment NOT NULL,
    title            VARCHAR(255),
    author_id        INT,
    genre_id         INT NOT NULL,
    publication_year INT NOT NULL,
    PRIMARY KEY (book_id),
    FOREIGN KEY (author_id) REFERENCES authors(author_id),
    FOREIGN KEY (genre_id) REFERENCES genres(genre_id)

);

CREATE TABLE loans (
    loan_id INT auto_increment NOT NULL,
    book_id INT NOT NULL,
    member_id INT NOT NULL,
    loan_date DATE NOT NULL,
    return_date DATE,
    PRIMARY KEY (loan_id),
    FOREIGN KEY (book_id) REFERENCES books(book_id),
    FOREIGN KEY (member_id) REFERENCES members(member_id)
);


INSERT INTO genres VALUES (1,'Fiction');
INSERT INTO genres VALUES (2,'Mystery');
INSERT INTO genres VALUES (3, 'Dystopian');
INSERT INTO genres VALUES (4, 'Romance');
INSERT INTO genres VALUES (5, 'Coming of Age');

INSERT INTO authors VALUES (1, 'F. Scott Fitzgerald',1896,'USA');
INSERT INTO authors VALUES (2, 'Harper Lee',1926,'USA');
INSERT INTO authors VALUES (3, 'George Orwell',1903,'UK');
INSERT INTO authors VALUES (4, 'Jane Austen',1775,'UK');
INSERT INTO authors VALUES (5, 'J.D. Salinger', 1919,'USA');


INSERT INTO books VALUES (1, 'The Great Gatsby', 1,1,1925   );
INSERT INTO books VALUES (2,'To Kill a Mockingbird', 2, 2, 1960);
INSERT INTO books VALUES (3, '1984', 3,3,1949);
INSERT INTO books VALUES (4,'Pride and Prejudice', 4,4,1813);
INSERT INTO books VALUES (5,'The Catcher in the Rye', 5, 5, 1951);


INSERT INTO members VALUES (1, 'Alice Smith', '2020-01-01');
INSERT INTO members VALUES (2, 'Bob Johnson', '2020-01-15');
INSERT INTO members VALUES (3, 'Charlie Brown', '2020-02-01');

INSERT INTO loans VALUES (1,1,1, '2020-01-01','2020-01-15');
INSERT INTO loans VALUES (2,2,2,'2020-01-15','2020-02-01');
INSERT INTO loans VALUES (3,3,3,'2020-02-01',NULL);


