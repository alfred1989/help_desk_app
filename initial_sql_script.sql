create database users_management;

\c users_management;

create table applications_table
(
	id serial not null
		constraint applications_table_pk
			primary key,
	priority_of_the_request varchar(50),
	user varchar(50),
	description varchar(40)
);


