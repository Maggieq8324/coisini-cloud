package com.coisini.admin.service;

import java.util.List;

import com.coisini.admin.entity.SysConfig;
import com.coisini.core.service.CurdService;

/**
 * 系统配置管理
 * @author coisini
 * @date August 13, 2019
 */
public interface SysConfigService extends CurdService<SysConfig> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysConfig> findByLable(String lable);
}
