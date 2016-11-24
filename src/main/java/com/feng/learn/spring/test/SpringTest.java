/**
 * 
 */
package com.feng.learn.spring.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.feng.learn.spring.model.Person;
import com.feng.learn.spring.service.MeetingService;

/**
 * @author feng
 *
 */
public class SpringTest {

	static ApplicationContext ctx;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx = new ClassPathXmlApplicationContext("application-context.xml");
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
	//spring-test-bean.xml
	public void test() {
		Person p = ctx.getBean("person", Person.class);
		System.out.println(p);
		com.feng.learn.singleton.Person p1 = ctx.getBean("sPerson", com.feng.learn.singleton.Person.class);
		com.feng.learn.singleton.Person p2 = ctx.getBean("sPerson2", com.feng.learn.singleton.Person.class);
		System.out.println(p1 == p2);
	}

	//@Test
	//spring-test-bean.xml
	public void testInjection() {
		Person p1 = ctx.getBean("person2", Person.class), p2 = ctx.getBean("person3", Person.class),
				p3 = ctx.getBean("person4", Person.class), p4 = ctx.getBean("person5", Person.class),
				p6 = ctx.getBean("person6", Person.class), p7 = ctx.getBean("person7", Person.class);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p6);
		System.out.println("------------");
		Map<String, Person> persons = ctx.getBeansOfType(Person.class);
		Iterator<Entry<String, Person>> itr = persons.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<String, Person> e = itr.next();
			System.out.println(e.getKey() + ": " + e.getValue());
		}
	}

	@SuppressWarnings("unused")
	@Test
	public void testPackageScan() {
		Map<String, MeetingService> services = ctx.getBeansOfType(MeetingService.class);
		for (Entry<String, MeetingService> e : services.entrySet()) {
			MeetingService m = e.getValue();
			System.out.println(e.getKey() + " --> " + m);
		}

	}

}
