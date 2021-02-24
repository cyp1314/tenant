### 项目简介

> 使用 `Mybatis-Plus` 提供的所有功能
> 1. 分页
> 2. 租户
> 3. 逻辑删除
> 4. 枚举
> 5. sql 打印
> 6. 数据安全保护
> 7. 动态表名 


### 项目用到的数据库

```mysql
/*
 Navicat Premium Data Transfer

 Source Server         : 本地数据库
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : tenant

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 24/02/2021 16:16:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `age_desc` tinyint(1) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  `deleted` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `deleted`(`deleted`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 1, 'A', '2021-02-24 16:11:27', NULL, 0);
INSERT INTO `student` VALUES (2, 2, 'B', '2021-02-24 16:12:06', '2021-02-24 16:12:06', 0);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `tenant_id` int(11) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  `deleted` int(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `deleted`(`deleted`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '123456', 1, NULL, NULL, 0);

-- ----------------------------
-- Table structure for user_2018
-- ----------------------------
DROP TABLE IF EXISTS `user_2018`;
CREATE TABLE `user_2018`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `tenant_id` int(11) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  `deleted` int(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `deleted`(`deleted`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_2018
-- ----------------------------
INSERT INTO `user_2018` VALUES (1, '2018-1', '123456', 1, NULL, NULL, 0);
INSERT INTO `user_2018` VALUES (2, '2018-2', '', 1, NULL, NULL, 0);
INSERT INTO `user_2018` VALUES (3, '2018-3', NULL, 1, NULL, NULL, 0);
INSERT INTO `user_2018` VALUES (4, '2018-4', NULL, 1, NULL, NULL, 0);
INSERT INTO `user_2018` VALUES (5, '2018-5', NULL, 1, NULL, NULL, 0);
INSERT INTO `user_2018` VALUES (6, '2018-6', NULL, 1, NULL, NULL, 0);

-- ----------------------------
-- Table structure for user_2019
-- ----------------------------
DROP TABLE IF EXISTS `user_2019`;
CREATE TABLE `user_2019`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `tenant_id` int(11) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  `deleted` int(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `deleted`(`deleted`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_2019
-- ----------------------------
INSERT INTO `user_2019` VALUES (1, '2019-1', '123456', 1, NULL, NULL, 0);
INSERT INTO `user_2019` VALUES (2, '2019-2', NULL, 1, NULL, NULL, 0);
INSERT INTO `user_2019` VALUES (3, '2019-3', NULL, 1, NULL, NULL, 0);
INSERT INTO `user_2019` VALUES (4, '2019-4', NULL, 1, NULL, NULL, 0);
INSERT INTO `user_2019` VALUES (5, '2019-5', NULL, 1, NULL, NULL, 0);
INSERT INTO `user_2019` VALUES (6, '2019-6', NULL, 1, NULL, NULL, 0);

SET FOREIGN_KEY_CHECKS = 1;

```