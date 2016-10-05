package com.tao.leetcode.string;

public class ValidWordAbbreviation408 {
	public static void main(String[] args) {
		ValidWordAbbreviation408 vw = new ValidWordAbbreviation408();
		String word = "apple";
		String abbr = "a3e";
		System.out.println(vw.validWordAbbreviation(word, abbr));
	}

	public boolean validWordAbbreviation(String word, String abbr) {
		if (abbr == null || abbr.isEmpty())
			return false;

		char[] abbr_array = abbr.toCharArray();
		char[] word_array = word.toCharArray();

		int p = 0;
		for (int i = 0; i < abbr_array.length; i++) {
			if (abbr_array[i] >= '0' && abbr_array[i] <= '9') {
				StringBuilder sb = new StringBuilder();
				for (int j = i; j < abbr_array.length; j++) {
					if(abbr_array[j]=='0' && sb.toString().isEmpty()) return false;
					if (abbr_array[j] >= '0' && abbr_array[j] <= '9') {
						sb.append(abbr_array[j]);
						i = j;
					} else {
						break;
					}
				}
				Integer temp_int = Integer.valueOf(sb.toString());
				p += temp_int - 1;
			} else {
				if (p >= word_array.length || abbr_array[i] != word_array[p]) {
					return false;
				}
			}
			if (p >= word_array.length) {
				return false;
			}
			p++;
		}

		return p==word_array.length;
	}
}
