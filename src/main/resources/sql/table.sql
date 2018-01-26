/*
MySQL Backup
Source Server Version: 5.7.16
Source Database: qcs
Date: 2018/1/26 23:11:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
--  Table structure for `qcs_car_film`
-- ----------------------------
DROP TABLE IF EXISTS `qcs_car_film`;
CREATE TABLE `qcs_car_film` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `number_plate` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '车牌号',
  `model` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '装贴型号',
  `position` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '装贴部位',
  `process_date` datetime DEFAULT NULL COMMENT '装贴日期',
  `quality_assurance_card_no` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '品质保证卡号',
  `process_company` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '装贴单位',
  `create_user_id` bigint(20) DEFAULT NULL COMMENT '创建用户',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_user_id` bigint(20) DEFAULT NULL COMMENT '最新修改用户',
  `update_time` datetime DEFAULT NULL COMMENT '最新修改时间',
  PRIMARY KEY (`id`),
  KEY `quality_assurance_card_no_index` (`quality_assurance_card_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='车膜列表';

-- ----------------------------
--  Records 
-- ----------------------------
