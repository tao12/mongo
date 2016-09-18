package com.tao.leetcode.queue;

import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 0, -1 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 } , { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 }, { 0, -2, 3 },
				{ 0, -2, 3 }};
		int k = 2;
		long start=System.currentTimeMillis();
		int result = maxSumSubmatrix(matrix, k);
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println(result);
		
		long start2=System.currentTimeMillis();
		int result2 = maxSumSubmatrix2(matrix, k);
		long end2=System.currentTimeMillis();
		System.out.println(end2-start2);
		System.out.println(result);
	}

	public static int maxSumSubmatrix(int[][] matrix, int k) {
		int m = matrix.length;
		if (m == 0)
			return 0;
		int n = matrix[0].length;
		if (n == 0)
			return 0;

		int result = Integer.MIN_VALUE;

		for (int i = 0; i < m; i++) {
			int[] sum = new int[n];

			for (int j = i; j < m; j++) {
				int curr = 0;
				TreeSet<Integer> set = new TreeSet<>();
				set.add(0);
				for (int l = 0; l < n; l++) {
					sum[l] += matrix[j][l];
					curr += sum[l];
					Integer num = set.ceiling(curr - k);
					if (num != null) {
						result = Math.max(result, curr - num);
					}
					set.add(curr);
				}
			}
		}

		return result;
	}
	
	public static int maxSumSubmatrix2(int[][] matrix, int k) {
        int m=matrix.length;
        if(m==0) return 0;
        int n=matrix[0].length;
        if(n==0) return 0;
        
        int result=Integer.MIN_VALUE;
        
        for(int i=0;i<m;i++){
            int[] sum=new int[n];
            
            for(int j=i;j<m;j++){
                
                for(int l=0;l<n;l++){
                    sum[l]+=matrix[j][l];
                }
                
                int curr=0;
                TreeSet<Integer> set=new TreeSet<>();
                set.add(0);
                
                for(int p=0;p<n;p++){
                    curr+=sum[p];
                    Integer num=set.ceiling(curr-k);
                    if(num != null){
                        result=Math.max(result, curr-num);
                    }
                    set.add(curr);
                }
            }
        }
        
        return result;
    }
}