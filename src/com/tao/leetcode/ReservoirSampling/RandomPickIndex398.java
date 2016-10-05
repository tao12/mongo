package com.tao.leetcode.ReservoirSampling;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPickIndex398 {
	public static void main(String[] args) {
		Random r=new Random();
		for(int i=0;i<5;i++){
			System.out.println(r.nextInt());
		}
		for(int i=0;i<5;i++){
			System.out.println(r.nextInt(5));
		}
	}
	
	private final int[] nums;
    Random r=new Random();
    public RandomPickIndex398(int[] nums) {
        this.nums=nums;
    }
    
    public int pick(int target) {
        List<Integer> pool=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                pool.add(i);
        }
        return pool.get(r.nextInt(pool.size()));
    }
}
