/**
 * 
 */
package com.feng.learn.init;

/**
 * @author feng
 *
 */
public class Student extends Person {
	static {
		System.out.println("Student.static block");
	}

	{
		System.out.println("Student block");
	}
}
