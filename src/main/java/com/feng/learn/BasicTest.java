/**
 * 
 */
package com.feng.learn;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author feng
 *
 */
public class BasicTest {

	static class A {
		static void print(List<String> list) {
			for (Object o : list) {
				System.out.println(o);
			}
		}
	}

	/** List 删除元素 */
	@Test
	@Ignore
	public void test() {
		List<String> list = new ArrayList<String>(8);
		String[] datas = { "a", "b", "c", "d", "e", "f" };
		A.print(list);
		List<String> constantList = Arrays.asList("a", "b", "c", "d", "e", "f");
		list.addAll(constantList);
		for (int i = 0; i < list.size(); i++) {
			if (i % 2 == 0) {
				list.remove(i);
			}
			System.out.println(list);
		}
	}

	//@Test
	public void testAutoBox() {
		Integer i1 = 100, i2 = 100, i3 = 150, i4 = 150;
		System.out.println(i1 == i2);
		System.out.println(i3 == i4);

	}

	//@Test
	public void test22() {
		Object o = null;
		System.out.println(null != o && o.equals(getClass()));
	}

	//@Test
	public void testString() {
		String s1 = "Programming";
		String s2 = new String("Programming");
		String s3 = "Program" + "ming";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s2.intern());
	}

	//@Test
	public void testClassLoader() {
		ClassLoader cl = getClass().getClassLoader();
		System.out.println(cl);
		System.out.println(cl.getParent());
		System.out.println(cl.getParent().getParent());
	}

	@Test
	public void testInterface() {
		//Ia.i = 9;
		System.out.println(Ib.i2);
		System.out.println(Ib.i);
	}

	public void testStr() throws UnsupportedEncodingException {
		String s1 = "你好";
		byte[] b1 = s1.getBytes("GB2312");
		String s2 = new String(b1, "ISO-8859-1");
		byte[] b2 = s2.getBytes();
		System.out.println(s2);
	}

	//@Test
	public void testInstanceOf() {
		System.out.println(null instanceof Object);
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

interface Ia {
	int i = 10;
}

interface Ib extends Ia {
	int i2 = 9;
}
