package com.tao.leetcode.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class CloneGraph133 {
	public static void main(String[] args) {
		UndirectedGraphNode n1=new UndirectedGraphNode(1);
		UndirectedGraphNode n2=new UndirectedGraphNode(2);
		UndirectedGraphNode n3=new UndirectedGraphNode(3);
		
//		n1.neighbors.add(n2);
//		n2.neighbors.add(n3);
//		n3.neighbors.add(n1);
		
		n1.neighbors.add(n1);
		n1.neighbors.add(n1);
		n1.neighbors.add(n1);
		
		cloneGraph(n1);
	}

	/**
	 * Definition for undirected graph. class UndirectedGraphNode { int label;
	 * List<UndirectedGraphNode> neighbors; UndirectedGraphNode(int x) { label =
	 * x; neighbors = new ArrayList<UndirectedGraphNode>(); } };
	 */

	public static UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if (node == null)
			return null;

		HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();

		UndirectedGraphNode root = new UndirectedGraphNode(node.label);
		map.put(node, root);

		Queue<UndirectedGraphNode> queue = new LinkedList<>();
		queue.add(node);

		while (!queue.isEmpty()) {
			UndirectedGraphNode curr = queue.poll();
			for (UndirectedGraphNode n : curr.neighbors) {
				if (map.get(n) == null) {
					UndirectedGraphNode copy = new UndirectedGraphNode(n.label);
					map.put(n, copy);
					queue.add(n);
				}

				map.get(curr).neighbors.add(map.get(n));
			}
		}

		return root;
	}
}
