''/*
	data_source sql
	
	date: 2016-07-06 10:04:23

*/

--TABLE STRUCTURE FOR data_source --
DROP TABLE IF EXISTS data_source;
CREATE TABLE data_source(
	id bigint(19) NOT NULL AUTO_INCREMENT,
	name varchar(50) COLLATE utf8_bin DEFAULT NULL,
	driver_class varchar(255) COLLATE utf8_bin DEFAULT NULL,
	url VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
	user_name VARCHAR(100) COLLATE utf8_bin DEFAULT NULL,
	user_password VARCHAR(100) COLLATE utf8_bin DEFAULT NULL,
	member_id  bigint(19) NOT NULL DEFAULT 0,
	PRIMARY KEY(id),
	UNIQUE KEY(name)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_bin