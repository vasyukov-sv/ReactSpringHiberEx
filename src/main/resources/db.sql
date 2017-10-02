-- --------------------------------------------------------
-- Хост:                         localhost
-- Версия сервера:               5.0.67-community-nt - MySQL Community Edition (GPL)
-- Операционная система:         Win32
-- HeidiSQL Версия:              9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Дамп структуры базы данных usersexample
CREATE DATABASE IF NOT EXISTS `usersexample` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `usersexample`;

-- Дамп структуры для таблица usersexample.role
CREATE TABLE IF NOT EXISTS `role` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Дамп структуры для таблица usersexample.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `login` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `role_id` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


