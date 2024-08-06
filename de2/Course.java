package de2;

public class Course {
	private String name;
	private String description;
	private int credits;

	public Course(String name, String description, int credits) {
		this.name = name;
		this.description = description;
		this.credits = credits;
	}

	// Getter và Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Course Name: " + name + ", Description: " + description + ", Credits: " + credits;
	}
}
