package com.sunpengyu.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testRandom() {
		
		Calendar c = Calendar.getInstance();
		c.set(2020,1,1);
		
		
		Date date = DateUtil.random(c.getTime(), new Date());
		SimpleDateFormat fm = new SimpleDateFormat();
		String format = fm.format(date);
		System.out.println(format);
		
		
	}

}
