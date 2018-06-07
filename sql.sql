CREATE TABLE `xbrain_diagnosis`.`equip_error_dic` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `equip_type_dic` BIGINT(20) NOT NULL COMMENT '设备类型',
  `error_module` BIGINT(20) NOT NULL COMMENT '上报模块',
  `error_code` VARCHAR(20) NOT NULL COMMENT '异常编码',
  `error_name` VARCHAR(50) NOT NULL COMMENT '异常名称',
  `error_desc` VARCHAR(200) NOT NULL COMMENT '异常描述',
  `suggestion` VARCHAR(1000) NULL COMMENT '处理建议',
  `is_alarm` TINYINT(1) NOT NULL COMMENT '是否报警',
  `is_display` TINYINT(1) NOT NULL COMMENT '是否显示',
  `create_user` VARCHAR(50) NOT NULL COMMENT '创建人',
  `create_erp` VARCHAR(50) NOT NULL COMMENT '创建人ERP',
  `create_time` DATETIME NOT NULL COMMENT '创建时间',
  `update_user` VARCHAR(50) NULL COMMENT '更新人',
  `update_erp` VARCHAR(50) NULL COMMENT '更新人ERP',
  `update_time` DATETIME NULL COMMENT '更新时间',
  `is_delete` TINYINT(1) NOT NULL COMMENT '删除标记',
  `ts` TIMESTAMP NOT NULL default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  PRIMARY KEY (`id`)
)
COMMENT = '设备异常字典表'
ENGINE=InnoDB DEFAULT CHARSET=utf8;