create table users(
    id varchar primary key unique not null,
    login varchar(30) unique not null,
    password varchar not null,
    role varchar(30) not null
);