package com.tao.leetcode.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BinaryTreeLevelOrderTraversal107 {	
	
	private static HashMap<Integer,List<TreeNode>> map=new HashMap<>();
	
	public static void main(String[] args) {
//		TreeNode three=new TreeNode(3);
//		TreeNode nine=new TreeNode(9);
//		TreeNode twenty=new TreeNode(20);
//		TreeNode fifteem=new TreeNode(15);
//		TreeNode seven=new TreeNode(7);
//		
//		twenty.left=fifteem;
//		twenty.right=seven;
//		three.left=nine;
//		three.right=twenty;
		
		TreeNode tn=new TreeNode(1);
		
		List<List<Integer>> result =levelOrderBottom(tn);
		for(List<Integer> list:result){
			System.out.println("[]");
			for(Integer i: list){
				System.out.println(i);
			}
		}
	}
    
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null) return Collections.EMPTY_LIST;
        int depth=0;
        List<TreeNode> list=new ArrayList<>();
        list.add(root);
        map.put(depth, list);
        if(root.left != null){
            helper(root.left,depth+1);
        }
        if(root.right != null){
            helper(root.right,depth+1);
        }
        
        List<List<Integer>> result=new ArrayList<>();
        
        if(map.size()>0){
            int j=map.size()-1;
            for(int i=j;i>=0;i--){
                List<TreeNode> temp=map.get(i);
                List<Integer> values=new ArrayList<>();
                for(TreeNode tn:temp){
                    values.add(tn.val);
                }
                result.add(values);
            }
        }
        
        return result;
    }
    
    public static void helper(TreeNode root, int depth){
        if(root == null) return;
        List<TreeNode> list=map.get(depth);
        if(list==null){
            list=new ArrayList<>();
        }
        list.add(root);
        if(root.left != null){
            helper(root.left,depth+1);
        }
        if(root.right != null){
            helper(root.right,depth+1);
        }
        map.put(depth,list);
    }
}


