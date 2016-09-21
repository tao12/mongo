package com.tao.algorithm;

import java.util.Set;

public class HashMapTao {
	public interface Map<K, V> {
		int size();

		public V get(K key);

		public void put(K key, V value);

		public boolean contains(K key);

		public void remove(K key);

		Iterable<K> keySet();
	}

	public static void main(String[] args) {
		java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
		Set<Integer> set = map.keySet();
	}
}
