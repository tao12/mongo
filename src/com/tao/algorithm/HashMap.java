package com.tao.algorithm;

public class HashMap {
	public interface Map<K,V>{
		int size();
		public V get(K key);
		public void put(K key, V value);
		public boolean contains(K key);
		public void remove(K key);
		Iterable<K> keySet();
	}
}
