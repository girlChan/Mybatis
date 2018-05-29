/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50637
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50637
File Encoding         : 65001

Date: 2018-05-29 19:57:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for country
-- ----------------------------
DROP TABLE IF EXISTS `country`;
CREATE TABLE `country` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of country
-- ----------------------------
INSERT INTO `country` VALUES ('1', 'ZH');
INSERT INTO `country` VALUES ('2', 'USA');

-- ----------------------------
-- Table structure for minister
-- ----------------------------
DROP TABLE IF EXISTS `minister`;
CREATE TABLE `minister` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `mname` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `countryId` int(11) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of minister
-- ----------------------------
INSERT INTO `minister` VALUES ('1', '上海', '1');
INSERT INTO `minister` VALUES ('2', '北京', '1');
INSERT INTO `minister` VALUES ('3', '昆明', '1');
INSERT INTO `minister` VALUES ('4', '纽约', '2');

-- ----------------------------
-- Table structure for newslabel
-- ----------------------------
DROP TABLE IF EXISTS `newslabel`;
CREATE TABLE `newslabel` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of newslabel
-- ----------------------------
INSERT INTO `newslabel` VALUES ('1', '娱乐新闻', '0');
INSERT INTO `newslabel` VALUES ('2', '体育新闻', '0');
INSERT INTO `newslabel` VALUES ('3', 'NBA', '2');
INSERT INTO `newslabel` VALUES ('4', 'CBA', '2');
INSERT INTO `newslabel` VALUES ('5', '火箭', '3');
INSERT INTO `newslabel` VALUES ('6', '湖人', '3');
INSERT INTO `newslabel` VALUES ('7', '北京', '4');
INSERT INTO `newslabel` VALUES ('8', '浙江', '4');
INSERT INTO `newslabel` VALUES ('9', '青岛', '4');
INSERT INTO `newslabel` VALUES ('10', '港台明星', '1');
INSERT INTO `newslabel` VALUES ('11', '内地影视', '1');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `AGE` int(11) DEFAULT NULL,
  `SCORE` double DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('19', '梨花', '12', '100');
INSERT INTO `student` VALUES ('20', '梨花', '10', '99.3');
INSERT INTO `student` VALUES ('21', '白芷', '10', '100');
INSERT INTO `student` VALUES ('23', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('24', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('25', '李四', '12', '99.3');
INSERT INTO `student` VALUES ('26', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('27', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('28', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('29', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('30', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('31', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('32', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('33', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('34', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('35', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('36', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('37', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('38', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('39', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('40', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('41', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('42', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('43', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('44', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('45', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('46', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('47', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('48', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('49', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('50', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('51', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('53', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('54', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('55', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('56', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('57', '梨花', '12', '99.3');
