package com.tao.leetcode.queue;

import java.util.TreeSet;

public class MaxSubarrayLessThanK {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 0, -1 }, { 0, -2, 3 } };
		int k = 2;
		int result = maxSumSubmatrix(matrix, k);
		System.out.println(result);
	}

	public static int maxSumSubmatrix(int[][] matrix, int k) {
		// 2D Kadane's algorithm + 1D maxSum problem with sum limit k
		// 2D subarray sum solution

		// boundary check
		if (matrix.length == 0)
			return 0;

		int m = matrix.length, n = matrix[0].length;
		int result = Integer.MIN_VALUE;

		// outer loop should use smaller axis
		// now we assume we have more rows than cols, therefore outer loop will
		// be based on cols
		for (int left = 0; left < n; left++) {
			// array that accumulate sums for each row from left to right
			int[] sums = new int[m];
			for (int right = left; right < n; right++) {
				// update sums[] to include values in curr right col
				for (int i = 0; i < m; i++) {
					sums[i] += matrix[i][right];
				}
				
				System.out.print("sums:");
				for(int i=0;i<sums.length;i++){
					System.out.print(sums[i]+",");
				}
				System.out.println();

				// we use TreeSet to help us find the rectangle with maxSum <= k
				// with O(logN) time
				TreeSet<Integer> set = new TreeSet<Integer>();
				// add 0 to cover the single row case
				set.add(0);
				int currSum = 0;

				for (int sum : sums) {
					currSum += sum;
					// we use sum subtraction (curSum - sum) to get the subarray
					// with sum <= k
					// therefore we need to look for the smallest sum >= currSum
					// - k
					System.out.println("current sum:"+currSum);
					System.out.println("set:"+set.toString());
					
					Integer num = set.ceiling(currSum - k);
					System.out.println("ceiling num:"+num);
					if (num != null)
						result = Math.max(result, currSum - num);
					System.out.println("result:"+result);
					set.add(currSum);
				}
			}
		}

		return result;
	}
}
