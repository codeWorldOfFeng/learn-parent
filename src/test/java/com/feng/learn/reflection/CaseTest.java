/**
 * 
 */
package com.feng.learn.reflection;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author feng
 *
 */
public class CaseTest {

	private static Case cs;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cs = new Case();
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

	/**
	 * Test method for {@link com.feng.learn.reflection.Case#loadNotInit()}.
	 */
	@Test
	public void testLoadNotInit() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.feng.learn.reflection.Case#getClassOfClass()}.
	 */
	@Test
	public void testGetClassOfClass() {
		cs.getClassOfClass();
		fail("Not yet implemented");
	}

}
