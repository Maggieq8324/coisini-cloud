package com.coisini.admin.service;

import java.util.List;

import com.coisini.admin.entity.SysDict;
import com.coisini.core.service.CurdService;

/**
 * 字典管理
 * @author coisini
 * @date August 13, 2019
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}
