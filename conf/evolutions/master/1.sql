# --- !Ups

create table hammer_women (
  athlete_id                    bigint auto_increment not null,
  mark                          double,
  athlete_name                  varchar(255),
  constraint pk_hammer_women primary key (athlete_id)
);