package com.coisini.common.utils;

/**
 * 字符串工具类
 * @author coisini
 * @date August 24, 2019
 */
public class StringUtils {

	/**
	 * 判空操作
	 * @param value
	 * @return
	 */
	public static boolean isBlank(String value) {
		return value == null || "".equals(value) || "null".equals(value) || "undefined".equals(value);
	}

}
