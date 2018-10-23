create table briup_student(
	id number primary key,
	name varchar2(20),
	age number,
	address varchar2(50)
);
create table ss_Li(
	name number,
	age number
);

create table s_Apeople(
	Aid number primary key,
	name varchar2(15)
);

create table s_Bpeople(
	aid number primary key,
	name varchar2(15),
	A_id number references s_Apeople(Aid)
);

create sequence Apeople_seq;
create sequence Bpeople_seq;