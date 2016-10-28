/**
 * 
 */
package com.feng.learn.pattern;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.feng.learn.pattern.strategy.observer.FrontOfficer;
import com.feng.learn.pattern.strategy.observer.Zhang;
import com.feng.learn.pattern.strategy.observer.Zhu;

/**
 * @author feng
 *
 */
public class PatterTest {

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
	public void testObserver() {
		FrontOfficer o = new FrontOfficer();
		o.addListener(new Zhang());
		o.addListener(new Zhu());
		o.bossAtDoor();
	}

}
