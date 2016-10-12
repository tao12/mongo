package com.tao.leetcode.trie;

import java.util.HashMap;

public class ImplementTrie208 {
	public static void main(String[] args) {
		ImplementTrie208 it=new ImplementTrie208();
		it.insert("a");
		it.insert("ab");
		it.insert("c");
	}
	
	private TrieNode root;

    public ImplementTrie208() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        if(word==null || word.isEmpty()) return;
        
        TrieNode tn=this.root;
        for(int i=0;i<word.length();i++){
            HashMap<Character,TrieNode> temp_children=tn.children;
            char temp=word.charAt(i);
            if(!temp_children.containsKey(temp)){
                TrieNode temp_tn=new TrieNode(temp);
                temp_children.put(temp,temp_tn);
            }
            tn=temp_children.get(temp);
        }
        tn.is=true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        if(word==null || word.isEmpty()) return false;
        TrieNode tn=searchNode(word);
        return tn!=null&&tn.is;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        if(prefix==null || prefix.isEmpty()) return false;
        TrieNode tn=searchNode(prefix);
        return tn!=null;
    }
    
    public TrieNode searchNode(String word){
        TrieNode tn=this.root;
        for(int i=0;i<word.length();i++){
            HashMap<Character,TrieNode> temp_children=tn.children;
            char temp=word.charAt(i);
            if(temp_children.containsKey(temp)){
                tn=temp_children.get(temp);
            }else{
                return null;
            }
        }
        return tn;
    }
    
    
}
