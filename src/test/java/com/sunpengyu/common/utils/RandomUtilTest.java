package com.sunpengyu.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
			System.out.println(RandomUtil.random(1, 3));
	}

	@Test
	public void testSubRandom() {

		int[] random = RandomUtil.subRandom(0, 10, 3);
		for (int i : random) {
			System.out.println(i);
		}

	}

	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testRandomString() {
		String randomString = RandomUtil.randomString(4);
		System.out.println(randomString);
	}

}
