package com.ustglobal.collectionframework.list;

public class Student {
	
	int id;
	String name;
	double percentage;
	
	public Student(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", percentage=" + percentage;
	}
	
	

}
