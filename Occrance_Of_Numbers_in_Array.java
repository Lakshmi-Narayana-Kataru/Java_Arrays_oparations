package com.learning.practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class Occrance_Of_Numbers_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> occr = new HashMap<>();
		int[] arr = {1,2,3,4,3,2,1,1,1,2,2,3,3,8,8};
		int size = arr.length;
		for(int i =0;i<size;i++) {
			int a = arr[i];
			int count =0;
			for(int j=0;j<size;j++) {
				if(a ==arr[j]) {
					count++;
				}
			}
			occr.put(a, count);
		}
		for(Entry<Integer, Integer> entry: occr.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

	}

}
