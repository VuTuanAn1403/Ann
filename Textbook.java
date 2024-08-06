package de1;

public class Textbook extends Book {
	private String subject;
	private int pageCount;

	// Constructor
	public Textbook(String name, int publicationYear, String subject, int pageCount) {
		super(name, publicationYear);
		this.subject = subject;
		this.pageCount = pageCount;
	}

	// Getter và Setter cho thuộc tính subject
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// Getter và Setter cho thuộc tính pageCount
	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	// Phương thức hiển thị thông tin Textbook

	@Override
	public String toString() {
		return "Textbook [subject=" + subject + ", pageCount=" + pageCount + ", toString()=" + super.toString() + "]";
	}
}
