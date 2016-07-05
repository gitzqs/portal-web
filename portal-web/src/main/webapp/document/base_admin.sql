/*
	portal-web sql
	
	date: 2016-06-23 10:04:23

*/

-- TABLE STRUCTURE FOR sys_member --
DROP TABLE IF EXISTS sys_member;
CREATE TABLE sys_member(
	id bigint(19) NOT NULL AUTO_INCREMENT,
	login_name varchar(50) COLLATE utf8_bin DEFAULT NULL,
	password varchar(255) COLLATE utf8_bin DEFAULT NULL,
	mobile varchar(20) COLLATE utf8_bin DEFAULT NULL,
	PRIMARY KEY (id),
	UNIQUE KEY (login_name)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_bin

--TABLE STRUCTURE FOR sys_url --
DROP TABLE IF EXISTS sys_url;
CREATE TABLE sys_url(
	id bigint(19) NOT NULL AUTO_INCREMENT,
	name varchar(50) COLLATE utf8_bin DEFAULT NULL,
	url varchar(50) COLLATE utf8_bin DEFAULT NULL,
	level int(1) DEFAULT 0,
	high_id bigint(19),
	PRIMARY KEY (id),
	UNIQUE KEY (name)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_bin
DROP TABLE IF EXISTS domain_mapping;
CREATE TABLE domain_mapping(
	id bigint(19) NOT NULL AUTO_INCREMENT,
	name varchar(50) COLLATE utf8_bin DEFAULT NULL,
	customer_id bigint(19) NOT NULL ,
	PRIMARY KEY(id),
	UNIQUE KEY(name)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_bin