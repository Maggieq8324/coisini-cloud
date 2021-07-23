package com.coisini.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coisini.admin.mapper.SysLoginLogMapper;
import com.coisini.admin.entity.SysLoginLog;
import com.coisini.admin.service.SysLoginLogService;
import com.coisini.core.page.MybatisPageHelper;
import com.coisini.core.page.PageRequest;
import com.coisini.core.page.PageResult;

@Service
public class SysLoginLogServiceImpl  implements SysLoginLogService {

	@Autowired
	private SysLoginLogMapper sysLoginLogMapper;

	@Override
	public int save(SysLoginLog record) {
		if(record.getId() == null || record.getId() == 0) {
			return sysLoginLogMapper.insertSelective(record);
		}
		return sysLoginLogMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int delete(SysLoginLog record) {
		return sysLoginLogMapper.deleteByPrimaryKey(record.getId());
	}

	@Override
	public int delete(List<SysLoginLog> records) {
		for(SysLoginLog record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public SysLoginLog findById(Long id) {
		return sysLoginLogMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		Object userName = pageRequest.getParam("userName");
		if(userName != null) {
			return MybatisPageHelper.findPage(pageRequest, sysLoginLogMapper, "findPageByUserName", userName);
		}
		Object status = pageRequest.getParam("status");
		if(status != null) {
			return MybatisPageHelper.findPage(pageRequest, sysLoginLogMapper, "findPageByStatus", status);
		}
		return MybatisPageHelper.findPage(pageRequest, sysLoginLogMapper);
	}
	
}
