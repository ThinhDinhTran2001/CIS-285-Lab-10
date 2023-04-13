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
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
    }
    
    public void testNegative(){
        
        /** Test data contains negative values only **/
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
