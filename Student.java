package de2;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	private double gpa;
	private List<Course> courses;

	public Student(String name, String email, double gpa) {
		super(name, email);
		this.gpa = gpa;
		this.courses = new ArrayList<>();
	}

	// Getter và Setter
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		this.courses.add(course);
	}

	@Override
	public String toString() {
		return super.toString() + ", GPA: " + gpa + ", Courses: " + courses;
	}
}
