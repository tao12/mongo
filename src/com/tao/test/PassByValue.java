package com.tao.test;

import java.util.ArrayList;
import java.util.List;

public class PassByValue {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);

		PassByValue pbv = new PassByValue();
		pbv.test(list);

		for (Integer i : list) {
			System.out.println(i);
		}
	}

	public void test(List<Integer> list) {
		list.add(2);
	}
}
