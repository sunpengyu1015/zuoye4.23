package com.sunpengyu.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String  src = "asdasd";
		System.out.println(StringUtil.hasLength(src));
		
	}

	@Test
	public void testHasText() {
		String  src = " ";
		System.out.println(StringUtil.hasText(src));
	}

	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString(5);
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

}
