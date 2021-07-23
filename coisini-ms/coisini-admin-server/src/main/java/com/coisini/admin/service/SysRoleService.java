package com.coisini.admin.service;

import java.util.List;

import com.coisini.admin.entity.SysMenu;
import com.coisini.admin.entity.SysRole;
import com.coisini.admin.entity.SysRoleMenu;
import com.coisini.core.service.CurdService;

/**
 * 角色管理
 * @author coisini
 * @date August 13, 2019
 */
public interface SysRoleService extends CurdService<SysRole> {

	/**
	 * 查询全部
	 * @return
	 */
	List<SysRole> findAll();

	/**
	 * 查询角色菜单集合
	 * @return
	 */
	List<SysMenu> findRoleMenus(Long roleId);

	/**
	 * 保存角色菜单
	 * @param records
	 * @return
	 */
	int saveRoleMenus(List<SysRoleMenu> records);

	/**
	 * 根据名称查询
	 * @param name
	 * @return
	 */
	List<SysRole> findByName(String name);

}
