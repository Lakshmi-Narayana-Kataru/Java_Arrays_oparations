package com.learning.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Duplicates {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,2,1,8,7,6,6,6,5,4,5,3};
		int size = arr.length;
		size = removeduplicates(arr,size);
		
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static int removeduplicates(int[] arr, int size) {
		// TODO Auto-generated method stub
		if(size ==0 || size ==1) {
			return size;
		}
		
		Arrays.sort(arr);
		int[] temp = new int[size];
		int j =0;
		for(int i =0;i<size-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[size-1];
		for(int i =0;i<j;i++) {
			arr[i]=temp[i];
		}
		
		return j;
	}

}
