/**
 * 
 */
package com.feng.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author feng
 *
 */
public class BasicTest {

	/** List 删除元素 */
	@Test
	public void test() {
		List<String> list = new ArrayList<String>(8);
		String[] datas = { "a", "b", "c", "d", "e", "f" };
		List<String> constantList = Arrays.asList("a", "b", "c", "d", "e", "f");
		list.addAll(constantList);
		for (int i = 0; i < list.size(); i++) {
			if (i % 2 == 0) {
				list.remove(i);
			}
			System.out.println(list);
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

}
