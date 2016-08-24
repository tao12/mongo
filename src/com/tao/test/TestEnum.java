package com.tao.test;

import org.junit.Test;

public enum TestEnum {
	Raw{
		int a;
	
		public void test() {
			System.out.println(a);
		}
	};
	
	@Test
	public void testReplaceString(){
		String name="Jeff ``Max''";
		boolean a=name.contains("``");
		System.out.println("``="+a);
		boolean b=name.contains("''");
		System.out.println("''="+b);
		
		String c=name.replaceAll("``", "\"");
		System.out.println(c);
		String d=name.replaceAll("''", "\"");
		System.out.println(d);
		
		System.out.println(name);
	}
}
