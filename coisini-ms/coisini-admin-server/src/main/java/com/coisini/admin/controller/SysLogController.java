package com.coisini.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coisini.admin.entity.SysLog;
import com.coisini.admin.service.SysLogService;
import com.coisini.core.http.HttpResult;
import com.coisini.core.page.PageRequest;

/**
 * 操作日志控制器
 * @author coisini
 * @date August 13, 2019
 */
@RestController
@RequestMapping("/log")
public class SysLogController {

	@Autowired
	private SysLogService sysLogService;

	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysLogService.findPage(pageRequest));
	}
	
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<SysLog> records) {
		return HttpResult.ok(sysLogService.delete(records));
	}
}
