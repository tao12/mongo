package com.tao.leetcode.trie;

import java.util.HashMap;

public class TrieNode {
	// Initialize your data structure here.
    char c;
    HashMap<Character,TrieNode> children=new HashMap<>();
    boolean is;
    public TrieNode() {
        
    }
    
    public TrieNode(char c) {
        this.c=c;
    }
}
