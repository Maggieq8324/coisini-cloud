package com.coisini.admin.service;

import java.util.List;

import com.coisini.admin.entity.SysDept;
import com.coisini.core.service.CurdService;

/**
 * 机构管理
 * @author coisini
 * @date August 13, 2019
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @param userId 
	 * @return
	 */
	List<SysDept> findTree();
}
