package com.svit.day_6.encapsulation;

public class Encapsulation3Main {
	
	public static void main(String[] args) {
		
		Encapsulation3 e3 = new Encapsulation3();
		e3.setAge(25);
		e3.setGender("Male");
		e3.setName("John");
		
		System.out.println(e3.getAge());
		System.out.println(e3.getGender());
		System.out.println(e3.getName());
		
	}
}