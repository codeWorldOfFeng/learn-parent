/**
 * 
 */
package com.feng.learn.argorithm;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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

	//@org.junit.Test
	public void test() {
		int[] a = { 1, 5, 9, 6, 11, 2, 1000, 777 };
		//bubbleUpArgorithm(a);
		insertSortAlgorithm(a);
		System.out.println(Arrays.asList(a));
	}

	/**
	 * 直接插入排序 小-》大
	 * @param a
	 */
	public void insertSortAlgorithm(int[] a) {
		if (a.length == 1) {
			return;
		}
		for (int i = 1; i < a.length; i++) {
			if (a[i] >= a[i - 1]) {
				continue;
			}
			int tmp = a[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (a[j] <= tmp) {
					break;
				}
			}
			int point = j + 1;

			if (point < i) {
				/*
				for (int m = i; m > point; m--) {
					a[m] = a[m - 1];
				}
				*/
				System.arraycopy(a, point, a, point + 1, i - point);
				a[point] = tmp;
			}
		}
	}

	public void insertSortAlgorithmBetter(int[] a) {
		int lng = a.length;
		if (lng == 1)
			return;
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				int tmp = a[i];
				int j = i - 1;
				for (; j >= 0 && tmp < a[j]; j--) {
					a[j + 1] = a[j];
				}
				a[j + 1] = tmp;
			}
		}
	}

	//@Test
	public void testInsertSort() {
		int[] a = { 10, 8, 7, 6, 11, 15, 3, 2 };
		//insertSortAlgorithm(a);
		insertSortAlgorithmBetter(a);
	}

	@Test
	public void testQuickSort() {
		int[] a = { 10, 8, 7, 6, 11, 15, 3, 2 };
		quickSort(a, 0, a.length - 1);
		System.out.println(a);
	}

	public void quickSort(int[] a, int start, int end) {
		if (start < end) {
			int divide = partationSort(a, start, end);
			quickSort(a, start, divide - 1);
			quickSort(a, divide + 1, end);
		}
	}

	public int partationSort(int[] a, int low, int high) {
		while (low < high) {
			while (low < high && a[low] < a[high])
				high--;
			swap(a, low, high);
			while (low < high && a[low] < a[high])
				low++;
			swap(a, low, high);
		}
		return low;
	}

}
