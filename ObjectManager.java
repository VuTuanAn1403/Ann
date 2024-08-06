package de1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ObjectManager {
	private static ArrayList<Book> bookList = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Thêm đối tượng mới vào danh sách");
			System.out.println("2. Hiển thị danh sách đối tượng");
			System.out.println("3. Tìm kiếm đối tượng theo tên");
			System.out.println("4. Xóa đối tượng khỏi danh sách");
			System.out.println("5. Sắp xếp danh sách đối tượng theo năm xuất bản");
			System.out.println("6. Thoát");
			System.out.print("Lựa chọn của bạn: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				addNewBook(scanner);
				break;
			case 2:
				displayBooks();
				break;
			case 3:
				searchBookByName(scanner);
				break;
			case 4:
				removeBookByName(scanner);
				break;
			case 5:
				sortBooksByYear();
				break;
			case 6:
				System.out.println("Thoát chương trình");
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
			}
		} while (choice != 6);
	}

	private static void addNewBook(Scanner scanner) {
		try {
			System.out.print("Nhập tên sách: ");
			String name = scanner.nextLine();
			System.out.print("Nhập năm xuất bản: ");
			int year = scanner.nextInt();
			scanner.nextLine(); // Consume newline
			bookList.add(new Book(name, year));
			System.out.println("Đã thêm sách thành công.");
		} catch (Exception e) {
			System.err.println("Lỗi khi thêm sách: " + e.getMessage());
		}
	}

	private static void displayBooks() {
		try {
			if (bookList.isEmpty()) {
				System.out.println("Danh sách sách trống.");
			} else {
				for (Book book : bookList) {
					System.out.println(book.toString());
				}
			}
		} catch (Exception e) {
			System.err.println("looix khi hien thi doi tuong " + e.getMessage());
		}
	}

	private static void searchBookByName(Scanner scanner) {
		try {
			System.out.print("Nhập tên sách cần tìm: ");
			String name = scanner.nextLine();
			boolean found = false;
			for (Book book : bookList) {
				if (book.getName().equalsIgnoreCase(name)) {
					System.out.println(book.toString());
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("Không tìm thấy sách có tên: " + name);
			}
		} catch (Exception e) {
			System.err.println("loi khi  tim kiem doi tuowng " + e.getMessage());
		}
	}

	private static void removeBookByName(Scanner scanner) {
		try {
			System.out.print("Nhập tên sách cần xóa: ");
			String name = scanner.nextLine();
			boolean found = false;
			for (Book book : bookList) {
				if (book.getName().equalsIgnoreCase(name)) {
					bookList.remove(book);
					System.out.println("Đã xóa sách thành công.");
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("Không tìm thấy sách có tên: " + name);
			}
		} catch (Exception e) {
			System.err.println("loi khi xoa doi tuong " + e.getMessage());
		}
	}

	private static void sortBooksByYear() {
		try {
			Collections.sort(bookList, new Comparator<Book>() {
				@Override
				public int compare(Book b1, Book b2) {
					return Integer.compare(b1.getPublicationYear(), b2.getPublicationYear());
				}
			});
			System.out.println("Đã sắp xếp danh sách sách theo năm xuất bản.");

		} catch (Exception e) {
			System.out.println("loi sap xep danh sach theo nawm xuat ban " + e.getMessage());
		}
	}
}
