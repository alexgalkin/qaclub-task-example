package com.qaclub.tasks;

public class Example {

	public static void main(String[] args) {
		Student alex = new Student();
		
		alex.setName("Alex Galkin");
		alex.setScore(72);
		
		System.out.println("Student: " + alex.getName()
				+ " |  Score: " + alex.getScore());
		
		System.out.println("That's it! Just another line.");
	}

}
