package com.tao.leetcode.string;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LongestPalindrome409 {
	public static void main(String[] args) {
		Character c = 'a';
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('a', 1);
		map.put('b', 2);

		for (Entry<Character, Integer> e : map.entrySet()) {
			e.getValue();
		}

		map.keySet();
	}

	public int longestPalindrome(String s) {
		if (s == null || s.isEmpty())
			return 0;
		char[] char_array = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : char_array) {
			if (map.get(c) == null) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}

		boolean flag_odd = false;
		int result = 0;
		Set<Character> key_set = map.keySet();
		for (Character c : key_set) {
			if (map.get(c) % 2 == 0) {
				result += map.get(c);
			}
			if (map.get(c) % 2 == 1) {
				result += map.get(c) - 1;
				flag_odd = true;
			}
		}

		if (flag_odd) {
			result += 1;
		}

		return result;
	}
}
