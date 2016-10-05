package com.tao.leetcode.bitmanipulation;

import java.util.HashMap;

public class ConvertaNumbertoHexadecimal405 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("a");
		sb.append("b");
		sb.reverse();
	}

	public String toHex(int num) {
		if (num == 0)
			return "0";

		HashMap<Integer, String> map = new HashMap<>();
		map.put(0, "0");
		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "3");
		map.put(4, "4");
		map.put(5, "5");
		map.put(6, "6");
		map.put(7, "7");
		map.put(8, "8");
		map.put(9, "9");
		map.put(10, "a");
		map.put(11, "b");
		map.put(12, "c");
		map.put(13, "d");
		map.put(14, "e");
		map.put(15, "f");

		StringBuilder sb = new StringBuilder();
		int i = 8;
		while (i > 0) {
			int temp = num & 15;
			sb.append(map.get(temp));
			num = num >> 4;
			i--;
		}

		sb.reverse();

		while (sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}

		return sb.toString();
	}
}
