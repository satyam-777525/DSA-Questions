# Write your MySQL query statement below
select w1.name ,w2.bonus from Employee as w1 Left join Bonus w2
on w1.empId=w2.empId
where w2.bonus<1000
or w2.bonus Is null;