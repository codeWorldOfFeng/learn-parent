/**
 * 
 */
package com.feng.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author feng
 *
 */
public class Utils {
	private static final Logger logger = LoggerFactory.getLogger("Utils");

	public static void printClazz(Class<?> clazz) {
		logger.debug("clazz.getName(): {}", clazz.getName());
		logger.debug("clazz.getCanonicalName(): {}", clazz.getCanonicalName());
		logger.debug("clazz.getSimpleName(): {}", clazz.getSimpleName());

		logger.debug("clazz.toString(): {}", clazz.toString());

		logger.debug("clazz.isInterface(): {}", clazz.isInterface());

		clazz.isArray();
		clazz.getClassLoader();

	}
}
