/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void testPositive() {
	    int[] arr = {8, 9, 7, 10, 2};
	    int[] expected = {2, 7, 8, 9, 10};
	    SelectionSort positive = new SelectionSort();
	    positive.basicSelectionSort(arr);
	    assertArrayEquals(expected, arr);
	}

	@Test
	public void testNegative() {
	    int[] arr = {-8, -9, -7, -10, -2};
	    int[] expected = {-10, -9, -8, -7, -2};
	    SelectionSort negative = new SelectionSort();
	    negative.basicSelectionSort(arr);
	    assertArrayEquals(expected, arr);
	}
    
	@Test
	public void testMixed() {
	    int[] arr = {-8, 9, 0, -7, 10, 2};
	    int[] expected = {-8, -7, 0, 2, 9, 10};
	    SelectionSort mixed = new SelectionSort();
	    mixed.basicSelectionSort(arr);
	    assertArrayEquals(expected, arr);
	}

	@Test
	public void testDuplicates() {
	    int[] arr = {8, 8, 7, 10, 2};
	    int[] expected = {2, 7, 8, 8, 10};
	    SelectionSort duplicates = new SelectionSort();
	    duplicates.basicSelectionSort(arr);
	    assertArrayEquals(expected, arr);
	}

}
