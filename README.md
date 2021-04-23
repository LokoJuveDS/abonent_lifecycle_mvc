# abonent_lifecycle_mvc
Проект «Жизненный цикл абонента». backend приложение: Spring MVC и Java. Основная сущность – это абонент, у него, есть имя, фамилия, номер телефона, баланс и статус. Можно совершать звонок или отправлять смс по фиксированным в БД ценам. Есть возможность посмотреть «текущий баланс абонента и статус» и функция пополнения баланса.

# Вспомогательные файлы

+ [скрипт для создания и заполнения базы](#скрипт-для-создания-и-заполнения-базы) ![icon][done]

[done]:done.png

## скрипт для создания и заполнения базы
CREATE DATABASE  my_db;
USE my_db;

CREATE TABLE subscribers (
  id int NOT NULL AUTO_INCREMENT,
  first_name varchar(15) NOT NULL,
  last_name varchar(25) NOT NULL,
  msisdn decimal(11,0) NOT NULL,
  balance decimal(9,2),
  status boolean not null,
  PRIMARY KEY (id)
) ;

INSERT INTO my_db.subscribers (first_name, last_name, msisdn, balance, status)
VALUES
	('Ivan', 'Ivanov', '79811234567', 100.20, 1),
	('Petr', 'Petrov', '79819876543', 0, 0),
	('Sidor', 'Sidorov', '79811973645', -10.20, 0);
