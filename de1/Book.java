package de1;

public class Book {
	private String name;
	private int publicationYear;

	// Constructor
	public Book(String name, int publicationYear) {
		this.name = name;
		this.publicationYear = publicationYear;
	}

	// Getter và Setter cho thuộc tính name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter và Setter cho thuộc tính publicationYear
	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	// Phương thức hiển thị thông tin Book

	@Override
	public String toString() {
		return "Book [name=" + name + ", publicationYear=" + publicationYear + "]";
	}
}
