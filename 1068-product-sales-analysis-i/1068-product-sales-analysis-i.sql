# Write your MySQL query statement below
select w2.product_name,w1.year,w1.price from sales as w1 inner join product as w2 on w1.product_id=w2.product_id;