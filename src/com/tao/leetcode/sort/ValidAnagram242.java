package com.tao.leetcode.sort;

import java.util.HashMap;
import java.util.Set;

public class ValidAnagram242 {
	public static void main(String[] args) {
		HashMap<Character, Integer> sm=new HashMap<>();
		Set<Character> keys=sm.keySet();
		for(Character c:keys){
			
		}
		
	}
	
	public boolean isAnagram(String s, String t) {
        if(s==null || t== null) return false;
        if(s.length() != t.length()) return false;
        
        char[] sa=s.toCharArray();
        char[] ta=t.toCharArray();
        
        int[] sm=new int[128];
        int[] tm=new int[128];
        
        for(int i=0;i<sa.length;i++) sm[sa[i]]++;
        for(int j=0;j<ta.length;j++) tm[ta[j]]++;
        
        for(int k=0;k<sm.length;k++){
            if(sm[k] != tm[k]) return false;
        }
        
        return true;
    }
}
