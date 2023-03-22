create table if not exists ddl.CUSTOMERS
(
    id           int ,
    name         varchar(100) not null,
    surname      varchar(100) not null,
    age          int          not null,
    phone_number varchar(50)  not null

);

insert into ddl.CUSTOMERS(name, surname, age, phone_number)
values ('alexey', 'Ivanov', 11, '89101111111');

insert into ddl.CUSTOMERS(name, surname, age, phone_number)
values ('Petr', 'Petrov', 22, '89202222222');

insert into ddl.CUSTOMERS(name, surname, age, phone_number)
values ('Alexey', 'Ivanov', 33, '89303333333');

insert into ddl.CUSTOMERS(name, surname, age, phone_number)
values ('Maxim', 'Orlov', 44, '89404444444');

create table if not exists ddl.ORDERS
(
    id           int ,
    date         date         not null,
    customer_id  int          not null,
    product_name varchar(100) not null,
    amount       int          not null
);

insert into ddl.ORDERS(date, customer_id, product_name, amount)
values ('10.10.2022', 1, 'milk', 100);

insert into ddl.ORDERS(date, customer_id, product_name, amount)
values ('01.01.2022', 2, 'bread', 200);

insert into ddl.ORDERS(date, customer_id, product_name, amount)
values ('03.01.2022', 3, 'apples', 300);

insert into ddl.ORDERS(date, customer_id, product_name, amount)
values ('01.07.2022', 4, 'bread', 400);

