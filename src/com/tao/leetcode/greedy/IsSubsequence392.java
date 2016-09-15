package com.tao.leetcode.greedy;

public class IsSubsequence392 {
	public static void main(String[] args) {
		String s="abc";
		String t="ahbgdc";
		System.out.println(isSubsequence(s, t));
	}
	public static boolean isSubsequence(String s, String t) {
        if(s==null || s.isEmpty()) return true;
        if(t==null || t.isEmpty()) return false;
        
        char[] sa=s.toCharArray();
        char[] ta=t.toCharArray();
        
        int i=0;
        for(int j=0;j<ta.length;j++){
        	System.out.println("ta[j]"+ta[j]);
        	System.out.println("sa[i]"+sa[i]+" i:"+i);
            if(ta[j]==sa[i]){
                i++;
            }
            if(i==sa.length) return true;
        }
        
        return false;
    }
}
