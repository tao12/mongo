package com.tao.leetcode.backtracking;

import java.util.ArrayList;

public class PermutationEasyToUnderstand {
	public static void main(String[] args) {
		PermutationEasyToUnderstand petu=new PermutationEasyToUnderstand();
		int[] num={1,2,3};
		petu.permute(num);
	}
	
	public ArrayList<ArrayList<Integer>> permute(int[] num) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		permute(num, 0, result);
		return result;
	}

	void permute(int[] num, int start, ArrayList<ArrayList<Integer>> result) {
		
		
		
		if (start >= num.length) {
			System.out.println("add!");
			ArrayList<Integer> item = convertArrayToList(num);
			result.add(item);
		}

		for (int j = start; j <= num.length - 1; j++) {
			System.out.println("j:"+j+" start:"+start);
			swap(num, start, j);
			System.out.println("first swap:");
			for(int i:num){
				System.out.print(i);
			}
			System.out.println();
			permute(num, start + 1, result);
			swap(num, start, j);
			System.out.println("second swap:");
			for(int i:num){
				System.out.print(i);
			}
			System.out.println();
		}
	}

	private ArrayList<Integer> convertArrayToList(int[] num) {
		ArrayList<Integer> item = new ArrayList<Integer>();
		for (int h = 0; h < num.length; h++) {
			item.add(num[h]);
		}
		return item;
	}

	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
