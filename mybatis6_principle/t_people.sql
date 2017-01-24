use db_mybatis;
create table t_people(
	id int primary key auto_increment,
	people_name varchar(30) not null,
	sex int not null,
	note varchar(30) not null
)Engine=InnoDB charset=utf8 collate utf8_general_ci;