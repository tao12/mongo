//package com.tao.leetcode.binarysearch;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class IntersactionOfTwoArrays349 {
//	// 一个数组排序，遍历另一个数组，在排序数组中二分查找，用flag记录是否被使用过，如果使用过，先向前找，找不到的时候再向后找
//	public int[] intersect(int[] nums1, int[] nums2) {
//	        List list = new ArrayList();
//	        if(nums1 == null || nums2 == null) {
//	            return null;
//	        }
//	        Arrays.sort(nums1);
//	        boolean[] flag = new boolean[nums1.length];
//	        for(int i=0; i
//	//由于flag数组的作用域只在此函数中，因此二分法的时候返回在nums1中找到数的位置，通过loc设置flag
//	            int loc = binarySearch(nums1, nums2[i], flag);
//	            if(loc != -1) {
//	                list.add(nums2[i]);
//	                flag[loc] = true;
//	            }
//	        }
//
//	int[] result = new int[list.size()];for(
//	int i = 0;i result[i]=list.get(i);
//
//	}return result;}
//
//	private int binarySearch(int[] nums1, int target, boolean[] flag) {
//		int start = 0;
//		int end = nums1.length - 1;
//		while (start <= end) {
//			int mid = (start + end) / 2;
//			if (nums1[mid] == target) {
//				if (flag[mid] == false) {
//					return mid;
//				} else {
//					int cur = mid;
//					while (cur - 1 >= start && nums1[cur - 1] == nums1[mid]) {
//						if (flag[cur - 1]) {
//							cur--;
//						} else {
//							return cur - 1;
//						}
//					}
//					cur = mid;
//					while (cur + 1 <= end && nums1[cur + 1] == nums1[mid]) {
//						if (flag[cur + 1]) {
//							cur++;
//						} else {
//							return cur + 1;
//						}
//					}
//					return -1;
//				}
//			} else if (nums1[mid] > target) {
//				end = mid - 1;
//			} else {
//				start = mid + 1;
//			}
//		}
//		return -1;
//	}
//}
