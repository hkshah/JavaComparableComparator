package com.jcc.comparable;

public class Student implements Comparable<Student> {
	String name;
	int rollNo;
	int age;

	public Student(String name, int rollNo, int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}

	// Sort with RollNo:
	@Override
	public int compareTo(Student student) {
		return Integer.compare(rollNo, student.rollNo);
	}

	// Sort with Name:
	// @Override
	// public int compareTo(Student student) {
	// return name.compareTo(student.name);
	// }

	// Sort with Age:
	// @Override
	// public int compareTo(Student student) {
	// return Integer.compare(age, student.age);
	// }
}