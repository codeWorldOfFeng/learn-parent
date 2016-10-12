/**
 * 
 */
package com.feng.learn.init;

/**
 * @author feng
 *
 */
public class Junior extends Student {
	static {
		System.out.println("Junior.static block");
	}

	{
		System.out.println("Junior block");
	}
}
