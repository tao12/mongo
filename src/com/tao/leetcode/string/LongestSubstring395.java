package com.tao.leetcode.string;

public class LongestSubstring395 {
	public static void main(String[] args) {
//		int i='a';
//		System.out.println(i);
//		StringBuilder sb=new StringBuilder();
//		System.out.println(sb.length());
//		String s="aaabbcccddddaaede";
//		String reg="a|c";
//		String[] array=s.split(reg);
//		System.out.println(array.toString());
//		System.out.println(array.length);
		
		String s="weitong";
		int k=2;
		int i='a';
		char c=(char)i;
		System.out.println(c);
		int result=longestSubstring(s, k);
		System.out.println(result);
	}
	
	public static int longestSubstring(String s, int k) {
        if(s==null || s.isEmpty()) return 0;
        int[] mask=new int[128];
        for(int i=0;i<s.length();i++) mask[s.charAt(i)]++;
        
        StringBuilder reg=new StringBuilder();
        boolean first=true;
        for(int j='a';j<='z';j++){
            if(mask[j] != 0 && mask[j]<k){
                if(first){
                    reg.append((char)j);
                    first=false;
                }else{
                    reg.append('|');
                    reg.append((char)j);
                }
            }
        }
        System.out.println(reg.toString());
        if(reg.length()!=0){
            String[] array=s.split(reg.toString());
            int max=0;
            for(int i=0;i<array.length;i++){
                max=Math.max(max,longestSubstring(array[i],k));
            }
            return max;
        }
        
        return s.length();
    }
}
