package com.shreya.Kth.AssistedProject;

public class Main {
	public static void main(String[] args) {
		KthSmallest ob = new KthSmallest(); 
        int arr[] = {13, 2, 4, 6, 3, 18, 25}; 
        int n = arr.length,k = 3; 
        System.out.println("K'th smallest element is "+ ob.kthSmallest(arr, 0, n-1, k)); 
    }
}




