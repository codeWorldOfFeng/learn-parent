/**
 * 
 */
package com.feng.learn.argorithm;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * @author feng
 *
 */
public class ArgorithmTest {

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

	public void bubbleUpArgorithm(int[] a) {
		int ptm;
		for (int i = 0; i < a.length; i++) {
			ptm = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] > a[ptm]) {
					ptm = j;
				}
			}
			swap(a, i, ptm);
			System.out.println(Arrays.asList(a));
		}
	}

	/**
	 * @param a
	 * @param i
	 * @param ptm
	 */
	private void swap(int[] a, int i, int ptm) {
		if (i == ptm)
			return;
		int tmp = a[i];
		a[i] = a[ptm];
		a[ptm] = tmp;
	}

	@org.junit.Test
	public void test() {
		int[] a = { 1, 5, 9, 6, 11, 2, 1000, 777 };
		bubbleUpArgorithm(a);
		System.out.println(Arrays.asList(a));
	}

}
