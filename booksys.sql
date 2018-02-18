/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost
 Source Database       : booksys

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : utf-8

 Date: 02/18/2018 16:14:36 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `book`
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT '0',
  `author` varchar(255) DEFAULT NULL,
  `amount` int(11) DEFAULT '0' COMMENT '库存',
  `pub_house` varchar(255) DEFAULT NULL COMMENT '出版社',
  `cate_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `book`
-- ----------------------------
BEGIN;
INSERT INTO `book` VALUES ('1', '疯狂Java讲义', '79', '李刚', '100', '电子工业出版社', '1'), ('2', '深度学习 [deep learning]', '141', '[美] Ian，Goodfellow', '0', '人民邮电出版社', '1'), ('3', 'Hadoop权威指南：大数据的存储与分析(第4版)', '116', '[美] 汤姆，怀特（Tom White）', '0', '清华大学出版社', '1');
COMMIT;

-- ----------------------------
--  Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `cate_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `category`
-- ----------------------------
BEGIN;
INSERT INTO `category` VALUES ('1', '计算机', '编程、网络、办公自动化、图形图像处理等等'), ('2', '心理学', '介绍心理学相关的知识'), ('3', '社会学', '社会学社会学社会学社会学社会学社会学社会学社会学社会学'), ('4', 'xxx', '社会学社会学社会学社会学社会学社会学社会学社会学社会学社会学社会学社会学组织结构');
COMMIT;

-- ----------------------------
--  Table structure for `inventory`
-- ----------------------------
DROP TABLE IF EXISTS `inventory`;
CREATE TABLE `inventory` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `invent_no` varchar(255) DEFAULT NULL COMMENT '入库编号',
  `operator` varchar(255) DEFAULT NULL COMMENT '入库操作员',
  `insert_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `sale`
-- ----------------------------
DROP TABLE IF EXISTS `sale`;
CREATE TABLE `sale` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `amount` double DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `total_price` double DEFAULT NULL,
  `operator` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
