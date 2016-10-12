/**
 * 
 */
package com.feng.learn.reflection;

import com.feng.learn.Utils;

/**
 * @author feng
 *
 */
public class Case {

	/**
	 * 只加载类，不初始化类
	 */
	public void loadNotInit() {
		Class<?> personClazz = Person.class;
		Utils.printClazz(personClazz);
	}

	public void getClassOfClass() {
		Class<?> clazz = Person.class;
		Utils.printClazz(clazz);
		clazz = clazz.getClass();
		Utils.printClazz(clazz);

		clazz = clazz.getClass();
		Utils.printClazz(clazz);

		clazz = clazz.getClass();
		Utils.printClazz(clazz);
	}
}
