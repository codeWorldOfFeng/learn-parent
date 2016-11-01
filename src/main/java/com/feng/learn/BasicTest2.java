package com.feng.learn;

import static org.junit.Assert.fail;

import java.io.UnsupportedEncodingException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author feng
 *
 */
public class BasicTest2 {

	@Test
	public void testStrEncoding() throws UnsupportedEncodingException {
		String str = "春节";
		byte[] bs = str.getBytes("utf-8");
		String str2 = new String(bs, "gbk");
		System.out.println(str2);
		System.out.println(toHex(bs));
		bs = str.getBytes("gbk");
		System.out.println(toHex(bs));
	}

	public String toHex(byte[] a) {
		StringBuilder s = new StringBuilder();
		for (byte b : a) {
			String str = Integer.toHexString(b & 0xFF);
			if ((b & 0xF0) == 0) {
				s.append('0').append(str);
			} else {
				s.append(str);
			}
			s.append(' ');
		}
		return s.substring(0, s.length() - 1).toUpperCase();
	}

	/**
	 * 伪随机算法 "线性求余"
	 */
	//@Test
	public void testRandom() {
		RandomCreator random = new RandomCreator();
		for (int i = 0; i++ < 100;) {
			System.out.println(random.next());
		}

		System.out.println();
		random.setSeed(17);
		for (int i = 0; i++ < 10;) {
			System.out.println(random.next());
		}
		System.out.println();
		random.setSeed(17);
		for (int i = 0; i++ < 10;) {
			System.out.println(random.next());
		}
	}

	static class RandomCreator {
		private int seed = (int) System.currentTimeMillis();
		private int lastRet;

		public void setSeed(int seed) {
			this.seed = seed;
			this.lastRet = 0;
		}

		public int next() {
			if (lastRet == 0) {
				lastRet = seed;
			} else {
				lastRet = (lastRet * 31 + 17) % 65535;
			}

			return lastRet;
		}
	}

	/**
	 * 测试字符串中"\"
	 * 
	 */
	//@Test
	public void testStringReplace() {
		String str = "Hel\\o world";
		str = str.replaceAll("\\\\", "/");
		System.out.println(str);
	}

	/**
	 * 测试final类型变量替换
	 * 
	 */
	//@Test
	public void test1() {
		// 这里相当于System.out.println(10);
		// 编译器会把所有FinalA.CONST进行替换
		System.out.println(FinalB.CONST);

	}

	static class FinalA {
		// 经过编译器编译后，下面俩个变量并不存在。
		static final int CONST = 10;
		final int CONSTB = 20;
		static {
			System.out.println("FinalA class init..");
		}

		{
			System.out.println("FinalA Object init..");
		}
	}

	static class FinalB extends FinalA {
		static {
			System.out.println("FinalB class init..");
		}
		{
			System.out.println("FinalB Object init..");
		}
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	//@Test
	public void test() {
		fail("Not yet implemented");
	}

}
