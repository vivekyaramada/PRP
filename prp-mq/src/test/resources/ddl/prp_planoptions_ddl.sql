CREATE TABLE `prp_planoptions` (
  `plan_appl_id` int(11) NOT NULL,
  `plan_group_number` varchar(20) NOT NULL,
  `plan_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `plan_subm_method` varchar(1) NOT NULL,
  `plan_resp_method` varchar(1) NOT NULL,
  `plan_notif_method` varchar(1) NOT NULL,
  `plan_ndm_vendor` varchar(10) NOT NULL,
  `plan_vdsa_plan_num` varchar(4) DEFAULT NULL,
  `plan_vdsa_mir_id` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`plan_appl_id`,`plan_group_number`),
  CONSTRAINT `fk_appl_id` FOREIGN KEY (`plan_appl_id`) REFERENCES `prp_aplctn` (`APPL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
