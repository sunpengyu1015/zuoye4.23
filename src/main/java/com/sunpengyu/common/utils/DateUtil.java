package com.sunpengyu.common.utils;

import java.util.Date;

public class DateUtil {

	/**
	 * 
	 * @Title: random 
	 * @Description: 随机产生一个min和max之间的日期
	 * @param min
	 * @param max
	 * @return
	 * @return: Date
	 */
	public static Date random(Date min,Date max) {
		
		long t1 = min.getTime();
		
		long t2 = max.getTime();
		
		long t = 	(long) (Math.random() * (t2-t1) + t1);
		
		
		return new Date(t);
	}
	
}
