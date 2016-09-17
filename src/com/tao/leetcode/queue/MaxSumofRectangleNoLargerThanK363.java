package com.tao.leetcode.queue;

import java.util.TreeSet;

public class MaxSumofRectangleNoLargerThanK363 {

	public static void main(String[] args) {
		int[] array = { 31, -41, 59, 26, -53, 58, 97, -93, -23, 84 };
		int k = 188;
		int result = maxSubArray(array, k);
		System.out.println(result);

		// TreeSet<Integer> set=new TreeSet<>();
		// for(Integer i:array){
		// set.add(i);
		// }
		//
		// System.out.println(set.ceiling(32));
	}

	public static int maxSubArray(int[] array, int k) {
		if (array.length == 0)
			return 0;

		TreeSet<Integer> set = new TreeSet<>();
		int currSum = 0;
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			currSum += array[i];
			Integer num = set.ceiling(currSum - k);
			System.out.println("num:"+num);
			if (num != null) {
				result = Math.max(result, currSum - num);
			}
			set.add(currSum);
		}
		return result;
	}
}
