/* Write your PL/SQL query statement below */
select name as results
from (
    select a.name, count(mr.user_id) cnt
    from Users a, MovieRating mr
    where a.user_id = mr.user_id
    group by a.name
    order by cnt desc, name)
where ROWNUM = 1

union all

select title as results
from (
    select a.title, avg(mr.rating) rating
    from Movies a, MovieRating mr
    where a.movie_id = mr.movie_id
        and to_char(mr.created_at, 'YYYY-MM') = '2020-02'
    group by a.title
    order by rating desc, a.title)
where ROWNUM = 1;
