package com.savas.sedef.structures;

import java.util.ArrayList;
import java.util.Collections;

public class Node implements Comparable<Node>{

	int capacity;
	int remaining;
	String name;
	ArrayList<File> list;
	
	public Node(int capacity, String name) {
		this.capacity = capacity;
		this.name = name;
		this.remaining = capacity;
		list = new ArrayList<File>();
	}

	@Override
	public int compareTo(Node o) {
		return this.remaining - o.remaining;
	}
	
	boolean insertFile(File file) {
		if (file.size > remaining ) {
			return false;
		}
		list.add(file);
		Collections.sort(list);
		remaining -= file.size;
		return true;
	}
	
	int numElements() {
		return list.size();
	}
	
	File popSmallest() {
		File f = list.remove(0);
		remaining += f.size;
		return f; 
	}
	
	File popLargest() {
		File f = list.remove(list.size() - 1);
		remaining += f.size;
		return f;
	}
	
	int peekSmallest() {
		return list.get(0).size;
	}
	
	int peekLargest() {
		return list.get(list.size() - 1).size;
	}
}
