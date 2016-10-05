package com.tao.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations46 {
	//TODO:没理解这个算法
	public static void main(String[] args) {
		// int[] nums={1,2,3};
		// nums.hashCode();
		// List<Integer> list=new ArrayList<>();
		// list.add(1);
		
		int[] nums={1,2,3};
		Permutations46 perm=new Permutations46();
		List<List<Integer>> result=perm.permute(nums);
		for(List<Integer> l:result){
			for(Integer i:l){
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();

		if (nums == null || nums.length == 0) {
			return res;
		}

		List<Integer> list = new ArrayList<>();
		this.helper(nums, list, res);

		return res;
	}

	private void helper(int[] nums, List<Integer> list, List<List<Integer>> res) {
		if (nums.length == list.size()) {
			res.add(new ArrayList<>(list));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (list.contains(nums[i])) {
				continue;
			}

			list.add(nums[i]);
			this.helper(nums, list, res);
			list.remove(list.size() - 1);
		}
	}
}
