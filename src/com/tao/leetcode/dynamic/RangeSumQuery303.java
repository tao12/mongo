package com.tao.leetcode.dynamic;

//数组题注意下表越界啊！！！！！！！！！
public class RangeSumQuery303 {
	public class NumArray {
		private int[] sum;

		public NumArray(int[] nums) {
			if (nums.length == 0)
				return;
			sum = new int[nums.length];
			sum[0] = nums[0];
			for (int i = 1; i < nums.length; i++) {
				sum[i] = sum[i - 1] + nums[i];
			}
		}

		public int sumRange(int i, int j) {
			if (i < 0 || j < 0 || i > j || sum.length == 0)
				return 0;
			return i == 0 ? sum[j] : sum[j] - sum[i - 1];
		}
	}

	// Your NumArray object will be instantiated and called as such:
	// NumArray numArray = new NumArray(nums);
	// numArray.sumRange(0, 1);
	// numArray.sumRange(1, 2);
}
