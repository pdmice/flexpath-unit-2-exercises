CREATE TABLE authors (
    author_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    birth_year INT NOT NULL,
    country VARCHAR(255) NOT NULL
);

CREATE TABLE genres (
    genre_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE books (
    book_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    author_id INT NOT NULL,
    genre_id INT NOT NULL,
    publication_year INT NOT NULL,
    FOREIGN KEY (author_id) REFERENCES authors(author_id),
    FOREIGN KEY (genre_id) REFERENCES genres(genre_id)
);

CREATE TABLE members (
    member_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    join_date DATE NOT NULL
);

CREATE TABLE loans (
    loan_id INT PRIMARY KEY AUTO_INCREMENT,
    book_id INT NOT NULL,
    member_id INT NOT NULL,
    loan_date DATE NOT NULL,
    return_date DATE,
    FOREIGN KEY (book_id) REFERENCES books(book_id),
    FOREIGN KEY (member_id) REFERENCES members(member_id)
);

INSERT INTO authors (name, birth_year, country) VALUES ('F. Scott Fitzgerald', 1896, 'USA');
INSERT INTO authors (name, birth_year, country) VALUES ('Harper Lee', 1926, 'USA');
INSERT INTO authors (name, birth_year, country) VALUES ('George Orwell', 1903, 'UK');
INSERT INTO authors (name, birth_year, country) VALUES ('Jane Austen', 1775, 'UK');
INSERT INTO authors (name, birth_year, country) VALUES ('J.D. Salinger', 1919, 'USA');

INSERT INTO genres (name) VALUES ('Fiction');
INSERT INTO genres (name) VALUES ('Mystery');
INSERT INTO genres (name) VALUES ('Dystopian');
INSERT INTO genres (name) VALUES ('Romance');
INSERT INTO genres (name) VALUES ('Coming of Age');

INSERT INTO books (title, author_id, genre_id, publication_year) VALUES ('The Great Gatsby', 1, 1, 1925);
INSERT INTO books (title, author_id, genre_id, publication_year) VALUES ('To Kill a Mockingbird', 2, 2, 1960);
INSERT INTO books (title, author_id, genre_id, publication_year) VALUES ('1984', 3, 3, 1949);
INSERT INTO books (title, author_id, genre_id, publication_year) VALUES ('Pride and Prejudice', 4, 4, 1813);
INSERT INTO books (title, author_id, genre_id, publication_year) VALUES ('The Catcher in the Rye', 5, 5, 1951);

INSERT INTO members (name, join_date) VALUES ('Alice Smith', '2020-01-01');
INSERT INTO members (name, join_date) VALUES ('Bob Johnson', '2020-01-15');
INSERT INTO members (name, join_date) VALUES ('Charlie Brown', '2020-02-01');

INSERT INTO loans (book_id, member_id, loan_date, return_date) VALUES (1, 1, '2020-01-01', '2020-01-15');
INSERT INTO loans (book_id, member_id, loan_date, return_date) VALUES (2, 2, '2020-01-15', '2020-02-01');
INSERT INTO loans (book_id, member_id, loan_date, return_date) VALUES (3, 3, '2020-02-01', NULL);
