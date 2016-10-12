package com.feng.learn.reflection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {
	private String name;
	private String sex;
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	static {
		System.out.println("Person.class init..");
	}

	{
		System.out.println("Person instance init..");
	}

	/**
	 * return the name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * name the name to set
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * return the sex
	 * 
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * sex the sex to set
	 * 
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

}
