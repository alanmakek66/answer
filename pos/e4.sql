create table players(
	play_id integer not null unique,
	group_id integer not null
	
)
create table matches(
	match_id integer not null unique,
	first_player integer not null,
	second_player integer not null,
	first_score integer not null,
	second_score integer not null
	
);

insert into players values(20,2);
insert into players values(30,1);
insert into players values(40,3);
insert into players values(45,1);
insert into players values(50,2);
insert into players values(65,1);
select * from players;

insert into matches values(1,30,45,10,12);

insert into matches values(2,20,50,5,5);
insert into matches values(13,65,45,10,10);
insert into matches values(5,30,65,3,15);
insert into matches values(42,45,65,8,4);

select *from matches;

WITH sum1 AS (
	SELECT p1.group_id, p1.play_id, SUM(m.first_score) AS score1
	FROM players p1
	LEFT JOIN matches m ON p1.play_id = m.first_player
	GROUP BY p1.group_id, p1.play_id
),
sum2 AS (
	SELECT p1.group_id, p1.play_id, SUM(m.second_score) AS score2
	FROM players p1
	LEFT JOIN matches m ON p1.play_id = m.second_player
	GROUP BY p1.group_id, p1.play_id
),
group_scores AS (
	SELECT p1.group_id, p1.play_id, (COALESCE(s1.score1, 0) + COALESCE(s2.score2, 0)) AS total_score
	FROM players p1
	LEFT JOIN sum1 s1 ON p1.group_id = s1.group_id AND p1.play_id = s1.play_id
	LEFT JOIN sum2 s2 ON p1.group_id = s2.group_id AND p1.play_id = s2.play_id
)
SELECT   distinct on (gs.group_id) gs.group_id ,gs.play_id
FROM group_scores gs
WHERE gs.total_score = (
SELECT MAX(total_score)
FROM group_scores
WHERE group_id = gs.group_id
)
ORDER BY gs.group_id , gs.play_id asc ;












