/**
 * 
 */
package com.feng.learn.annotation.thread;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author feng
 *
 */
@Target(ElementType.TYPE)
public @interface ThreadSafe {
	String[] authors();
}
