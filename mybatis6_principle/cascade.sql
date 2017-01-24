use db_mybatis;

drop table if exists t_student;
drop table if exists t_card;

create table t_card( -- 学生卡表
	id int(20) primary key auto_increment,
	password varchar(20) not null,
	surplus numeric(4,2)
)Engine=InnoDB charset utf8 collate utf8_general_ci; 

create table t_student( -- 学生表
	id int(20) primary key auto_increment,
	name varchar(60) not null,
	card_id int(20) unique not null,
	foreign key(card_id) references t_card(id) 
)Engine=InnoDB charset utf8 collate utf8_general_ci;