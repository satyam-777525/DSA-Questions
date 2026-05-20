# Write your MySQL query statement below
select w2.unique_id,w1.name from Employees as w1 left join EmployeeUNI w2 on w1.id=w2.id;