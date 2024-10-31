drop table if exists users;
create table users (
    id integer primary key auto_increment,
    username varchar(255) not null,
    password varchar(255) not null
);

drop table if exists topics;
create table topics (
    id integer primary key auto_increment,
    subject varchar(255) not null,
    body text not null,
    author_id integer not null,
    foreign key(author_id) references users(id)
);

drop table if exists comments;
create table comments (
    id integer primary key auto_increment,
    body text not null,
    author_id integer not null,
    topic_id integer not null,
    foreign key(topic_id) references topics(id),
    foreign key(author_id) references users(id)
);

insert into users (username, password) values ('bob', 'password');
insert into users (username, password) values ('alice', 'password');
insert into users (username, password) values ('charlie', 'password');

insert into topics (subject, body, author_id) values ('First topic', 'This is the first topic', 1);
insert into topics (subject, body, author_id) values ('Second topic', 'This is the second topic', 2);
insert into topics (subject, body, author_id) values ('Third topic', 'This is the third topic', 3);

insert into comments (body, author_id, topic_id) values ('This is the first comment', 1, 1);
insert into comments (body, author_id, topic_id) values ('This is the second comment', 2, 1);
insert into comments (body, author_id, topic_id) values ('This is the third comment', 1, 2);
insert into comments (body, author_id, topic_id) values ('This is the fourth comment', 2, 2);
insert into comments (body, author_id, topic_id) values ('This is the fifth comment', 1, 3);
insert into comments (body, author_id, topic_id) values ('This is the sixth comment', 2, 3);