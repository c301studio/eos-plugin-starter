CREATE TABLE `table`
(
    `id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '编号',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8
  ROW_FORMAT = COMPACT COMMENT ='测试表';
