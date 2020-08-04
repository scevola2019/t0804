CREATE TABLE IF NOT EXISTS `system_product` (
  `id` int(50) NOT NULL auto_increment,
  `name` varchar(100) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `code` varchar(50) DEFAULT NULL,
  `access` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `system_product` (`id`, `name`, `type`,`code`,`access`) VALUES
	(0098, '电压力锅', '电压力锅', 'CYSB50YCW10DJ-100','5'),
	(0095, 'IH电磁加热只能预约3L迷你电饭煲', '电饭煲', 'SF30HC749','6'),
	(0094, '苏泊尔(SUPOR)电磁炉纤薄滑控匀火爆炒电磁炉', '电磁炉', 'SDHCB8E30-210J','7');