create table products (
    id varchar primary key unique not null,
    name varchar(100) unique not null,
    price numeric(10,2)
);