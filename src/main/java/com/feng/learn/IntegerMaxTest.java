/**
 * 
 */
package com.feng.learn;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author feng
 *
 */
public class IntegerMaxTest {

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

	@Test
	public void test() {
		int max = Integer.MAX_VALUE;
		int max2 = 0x7fffffff;
		System.out.println(max2);
		System.out.println(max == max2);
		int max_1 = max + 1;
		System.out.println(max_1);
		System.out.println(max_1 > max);
		int tmp = 1 << 30;
		tmp = tmp / 2;
	}

}
