CREATE TABLE IF NOT EXISTS employee (
        employeeid int(5) NOT NULL AUTO_INCREMENT,
        country varchar(255),
        designation varchar(255),
        division smallint,
        firstname varchar(255),
        lastname varchar(255),
        phoneno varchar(255),
        primary key (employeeid)
    )ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `company`.`employee` (`country`, `designation`, `division`, `firstname`, `lastname`, `phoneno`) VALUES ('USA', 'Senior Software Engineer', 'Enterprize Digintal', 'Gana', 'Samantula'), 


CREATE TABLE IF NOT EXISTS `articles` (
  `article_id` int(5) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `category` varchar(100) NOT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;


INSERT INTO `articles` (`article_id`, `title`, `category`) VALUES
	(1, 'Java Concurrency', 'Java'),
	(2, 'Hibernate HQL ', 'Hibernate'),
	(3, 'Spring MVC with Hibernate', 'Spring');


CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `full_name` varchar(100) NOT NULL,
  `role` varchar(50) NOT NULL,
  `country` varchar(100) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `users` (`username`, `password`, `full_name`, `role`, `country`, `enabled`) VALUES
	('gana', '$2a$10$L3FSrcqS/ED6Idc06/q4V.qDBIg3IuORlarv.LF6ApHL6JSC23ICO', 'Gana Samantula', 'ROLE_ADMIN', 'India', 1),
	('guna', '$2a$10$6CmcqI0IcpCXNkxxSaWKn.UiffAIeOBQYTKFs.hthWw.HDxL8adm.', 'Guna Samantula', 'ROLE_USER', 'India', 1);