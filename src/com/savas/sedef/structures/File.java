package com.savas.sedef.structures;

public class File implements Comparable<File>{
	int size;
	String filename;
	
	public File(int size, String filename) {
		this.size = size;
		this.filename = filename;
	}

	@Override
	public int compareTo(File o) {
		return this.size - o.size;
	}
}
