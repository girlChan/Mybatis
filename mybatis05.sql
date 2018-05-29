/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50637
Source Host           : localhost:3306
Source Database       : mybatis05

Target Server Type    : MYSQL
Target Server Version : 50637
File Encoding         : 65001

Date: 2018-05-29 19:57:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `TID` int(11) NOT NULL AUTO_INCREMENT,
  `TNAME` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `TAGE` int(11) DEFAULT NULL,
  `SCORE` double DEFAULT NULL,
  PRIMARY KEY (`TID`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('20', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('21', '白芷', '10', '100');
INSERT INTO `student` VALUES ('23', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('24', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('25', '李四', '12', '99.3');
INSERT INTO `student` VALUES ('52', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('53', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('54', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('55', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('56', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('57', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('58', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('59', '梨花', '12', '99.3');
INSERT INTO `student` VALUES ('60', '梨花', '12', '99.3');
