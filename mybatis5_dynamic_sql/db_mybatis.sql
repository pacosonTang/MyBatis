/*
Navicat MySQL Data Transfer

Source Server         : localhost-mybatis
Source Server Version : 50168
Source Host           : localhost:3306
Source Database       : db_mybatis

Target Server Type    : MYSQL
Target Server Version : 50168
File Encoding         : 65001

Date: 2017-01-23 18:45:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_author`
-- ----------------------------
DROP TABLE IF EXISTS `t_author`;
CREATE TABLE `t_author` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_author
-- ----------------------------
INSERT INTO `t_author` VALUES ('1', 'zhangsan');
INSERT INTO `t_author` VALUES ('2', 'lisi');
INSERT INTO `t_author` VALUES ('3', 'wangwu');

-- ----------------------------
-- Table structure for `t_people`
-- ----------------------------
DROP TABLE IF EXISTS `t_people`;
CREATE TABLE `t_people` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `people_name` varchar(30) NOT NULL,
  `sex` varchar(7) DEFAULT NULL,
  `note` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_people
-- ----------------------------
INSERT INTO `t_people` VALUES ('31', 'man0', 'MALE', 'hello world.0');
INSERT INTO `t_people` VALUES ('32', 'woman1', 'FEMALE', 'hello world.1');
INSERT INTO `t_people` VALUES ('33', 'man2', 'MALE', 'hello world.2');
INSERT INTO `t_people` VALUES ('34', 'woman3', 'FEMALE', 'hello world.3');
INSERT INTO `t_people` VALUES ('35', 'man4', 'MALE', 'hello world.4');
INSERT INTO `t_people` VALUES ('36', 'woman5', 'FEMALE', 'hello world.5');
INSERT INTO `t_people` VALUES ('37', 'man6', 'MALE', 'hello world.6');
INSERT INTO `t_people` VALUES ('38', 'woman7', 'FEMALE', 'hello world.7');
INSERT INTO `t_people` VALUES ('39', 'man8', 'MALE', 'hello world.8');
INSERT INTO `t_people` VALUES ('40', 'woman9', 'FEMALE', 'hello world.9');
INSERT INTO `t_people` VALUES ('41', 'woman11', '2', 'hello world.11');
INSERT INTO `t_people` VALUES ('42', 'man12', '1', 'hello world.12');
INSERT INTO `t_people` VALUES ('43', 'man100', '1', 'hello world.100');
INSERT INTO `t_people` VALUES ('44', 'woman101', '2', 'hello world.101');
INSERT INTO `t_people` VALUES ('45', 'man1000', '1', 'hello world.1000');
INSERT INTO `t_people` VALUES ('46', 'woman1001', '2', 'hello world.1001');
INSERT INTO `t_people` VALUES ('47', 'man10000', '1', 'hello world.10000');
INSERT INTO `t_people` VALUES ('48', 'woman10001', '2', 'hello world.10001');
INSERT INTO `t_people` VALUES ('49', 'man10000', '1', 'hello world.10000');
INSERT INTO `t_people` VALUES ('50', 'woman10001', '2', 'hello world.10001');

-- ----------------------------
-- Table structure for `t_post`
-- ----------------------------
DROP TABLE IF EXISTS `t_post`;
CREATE TABLE `t_post` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `content` text NOT NULL,
  `author_id` int(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `author_id` (`author_id`),
  CONSTRAINT `t_post_ibfk_1` FOREIGN KEY (`author_id`) REFERENCES `t_author` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_post
-- ----------------------------
INSERT INTO `t_post` VALUES ('1', 'im a student', 'lalallalalalal,content', '1');
INSERT INTO `t_post` VALUES ('2', 'im a gir', 'bbbbbbbbbb,content', '2');
INSERT INTO `t_post` VALUES ('3', 'im a boy from dazhou', 'dazhou ,content', '2');

-- ----------------------------
-- Table structure for `t_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(30) NOT NULL,
  `note` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('14', 'tangrong', 'student');
INSERT INTO `t_role` VALUES ('15', 'huangqiang', 'pm');
INSERT INTO `t_role` VALUES ('16', 'huangbo', 'actor');
INSERT INTO `t_role` VALUES ('17', 'Liu0', 'note0');
INSERT INTO `t_role` VALUES ('18', 'Liu1', 'note1');
INSERT INTO `t_role` VALUES ('19', 'Liu2', 'note2');
INSERT INTO `t_role` VALUES ('20', 'Liu3', 'note3');
INSERT INTO `t_role` VALUES ('21', 'Liu4', 'note4');
INSERT INTO `t_role` VALUES ('22', 'Liu5', 'note5');
INSERT INTO `t_role` VALUES ('23', 'Liu6', 'note6');
INSERT INTO `t_role` VALUES ('24', 'Liu7', 'note7');
INSERT INTO `t_role` VALUES ('25', 'Liu8', 'note8');
INSERT INTO `t_role` VALUES ('26', 'Liu9', 'note9');
INSERT INTO `t_role` VALUES ('27', 'Dehua Liu', 'super star');
INSERT INTO `t_role` VALUES ('28', 'Binbin Fan', 'super star');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) NOT NULL,
  `sex` int(11) NOT NULL,
  `note` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('3', 'trong', '0', 'hello world.');
INSERT INTO `t_user` VALUES ('4', 'xiaofang0', '0', 'hello world.0');
INSERT INTO `t_user` VALUES ('5', 'sun1', '1', 'hello world.1');
INSERT INTO `t_user` VALUES ('6', 'xiaofang2', '0', 'hello world.2');
INSERT INTO `t_user` VALUES ('7', 'sun3', '1', 'hello world.3');
INSERT INTO `t_user` VALUES ('8', 'xiaofang4', '0', 'hello world.4');
INSERT INTO `t_user` VALUES ('9', 'sun5', '1', 'hello world.5');
INSERT INTO `t_user` VALUES ('11', 'sun7', '1', 'hello world.7');
INSERT INTO `t_user` VALUES ('12', 'xiaofang8', '0', 'hello world.8');
INSERT INTO `t_user` VALUES ('13', 'sun9', '1', 'hello world.9');
