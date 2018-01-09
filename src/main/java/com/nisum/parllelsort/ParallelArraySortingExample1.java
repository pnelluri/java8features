package com.nisum.parllelsort;

import java.util.Arrays;

public class ParallelArraySortingExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating an integer array   
        int[] arr = {5,8,1,0,6,9};  
        // Iterating array elements  
       /* for (int i : arr) {  
            System.out.print(i+" ");  
        }  */
        // Sorting array elements parallel  
        Arrays.parallelSort(arr);  
        System.out.println("\nArray elements after sorting");  
        // Iterating array elements  
        for (int i : arr) {  
            System.out.print(i+" ");  
        }  
	}

}
