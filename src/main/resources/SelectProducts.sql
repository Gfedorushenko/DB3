SELECT product_name from ddl.ORDERS where customer_id in (
    SELECT id from ddl.CUSTOMERS where name like ?);