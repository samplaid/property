-- use property_search_engine;

drop table if exists PUBLIC.CODE_LABELS;
create table PUBLIC.CODE_LABELS (
	code varchar(50) not null, 
	value varchar(50) not null, 
	label varchar(100) not null,
	primary key (code, value)
);