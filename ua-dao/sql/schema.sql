drop database if exists ua;

create database ua;

use ua;

CREATE TABLE user(
  id bigint not null auto_increment,
  user_name VARCHAR(255) not null,
  email VARCHAR(255) not null,
  phone VARCHAR(20) not null,
  password VARCHAR(255) not null,
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE KEY (email),
  UNIQUE KEY (phone)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET='utf8' comment'用户';