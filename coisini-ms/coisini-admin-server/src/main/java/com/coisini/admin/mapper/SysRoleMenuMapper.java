package com.coisini.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.coisini.admin.entity.SysRoleMenu;

public interface SysRoleMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);

    SysRoleMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoleMenu record);

    int updateByPrimaryKey(SysRoleMenu record);

	List<SysRoleMenu> findRoleMenus(@Param(value="roleId") Long roleId);
	
	List<SysRoleMenu> findAll();

	int deleteByRoleId(@Param(value="roleId") Long roleId);
}