create schema resume;
use resume;

CREATE TABLE `resume`.`persontable` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `fname` VARCHAR(50) NULL,
  `lname` VARCHAR(50) NULL,
  `email` VARCHAR(50) NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `resume`.`jobtable` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `jobtitle` VARCHAR(50) NULL,
  `startdate` DATETIME NULL,
  `enddate` DATETIME NULL,
  `duties` BLOB NULL,
  `company` VARCHAR(50) NULL,
  `personid` INT NULL,
  PRIMARY KEY (`id`));
  
create table jobduties (
 id int auto_increment primary key,
 jobid int, 
 jobduty varchar(50)
);

CREATE TABLE `resume`.`educationtable` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `degree` VARCHAR(50) NULL,
  `institution` VARCHAR(50) NULL,
  `year` INT(10) NULL,
  `personid` INT NULL,
  PRIMARY KEY (`id`));

select * from persontable;
select * from jobtable;