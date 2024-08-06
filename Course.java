package de1;

public class Course {
	private String name;
	private String description;
	private int credits;

	// Constructor
	public Course(String name, String description, int credits) {
		this.name = name;
		this.description = description;
		this.credits = credits;
	}

	// Getter và Setter cho thuộc tính name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter và Setter cho thuộc tính description
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// Getter và Setter cho thuộc tính credits
	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", description=" + description + ", credits=" + credits + "]";
	}

	// Phương thức hiển thị thông tin Course

}
