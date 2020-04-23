package com.sunpengyu.common.utils;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		
		for (int i = 0; i < 10000; i++) {
			
			Person p = new Person();
			
			p.setName(StringUtil.generateChineseName());
			
			p.setAge(RandomUtil.random(0, 120));
			
			p.setAbout(StringUtil.randomChineseString(140));
			
			Calendar c = Calendar.getInstance();
			c.set(2020, 1,1);
			p.setCreated(DateUtil.random(c.getTime(), new Date()));
			
			System.out.println(i+1+" "+p);
		}
	}

}
