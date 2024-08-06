package de2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
	private List<Student> students;

	public StudentManagement() {
		this.students = new ArrayList<>();
	}

	public void addStudent(Student student) {
		try {
			students.add(student);
			System.out.println("Thêm sinh viên thành công: " + student);
		} catch (Exception e) {
			System.err.println("Lỗi khi thêm sinh viên: " + e.getMessage());
		}

	}

	public void displayStudents() {
		try {
			if (students.isEmpty()) {
				throw new Exception("Danh sách sinh viên trống.");
			}
			for (Student student : students) {
				System.out.println(student);
			}
		} catch (Exception e) {
			System.err.println("Lỗi khi hiển thị danh sách sinh viên: " + e.getMessage());
		}
	}

	public Student findStudentByName(String name) {
		try {
			for (Student student : students) {
				if (student.getName().equalsIgnoreCase(name)) {
					return student;
				}
			}
			throw new Exception("Không tìm thấy sinh viên.");
		} catch (Exception e) {
			System.err.println("Lỗi khi tìm kiếm sinh viên: " + e.getMessage());
			return null;
		}
	}

	public boolean removeStudent(String name) {
		try {
			Student student = findStudentByName(name);
			if (student != null) {
				students.remove(student);
				System.out.println("Xóa sinh viên thành công: " + student);
				return true;
			} else {
				throw new Exception("Không tìm thấy sinh viên để xóa.");
			}
		} catch (Exception e) {
			System.err.println("Lỗi khi xóa sinh viên: " + e.getMessage());
			return false;
		}
	}

	public void sortStudentsByGpa() {
		try {
			if (students.isEmpty()) {
				throw new Exception("Danh sách sinh viên trống, không thể sắp xếp.");
			}
			Collections.sort(students, new Comparator<Student>() {
				@Override
				public int compare(Student s1, Student s2) {
					return Double.compare(s2.getGpa(), s1.getGpa());
				}
			});
			System.out.println("Sắp xếp sinh viên theo điểm trung bình từ cao đến thấp thành công.");
		} catch (Exception e) {
			System.err.println("Lỗi khi sắp xếp danh sách sinh viên: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		StudentManagement sm = new StudentManagement();
		Scanner scanner = new Scanner(System.in);
		boolean running = true;

		while (running) {
			try {
				System.out.println("1. Thêm sinh viên mới");
				System.out.println("2. Hiển thị danh sách sinh viên");
				System.out.println("3. Tìm kiếm sinh viên theo tên");
				System.out.println("4. Xóa sinh viên khỏi danh sách");
				System.out.println("5. Sắp xếp danh sách sinh viên theo điểm trung bình từ cao đến thấp");
				System.out.println("6. Thoát");
				System.out.print("Chọn một tùy chọn: ");
				int choice = scanner.nextInt();
				scanner.nextLine(); // Consume newline

				switch (choice) {
				case 1:
					// Thêm sinh viên mới
					try {
						System.out.print("Nhập tên sinh viên: ");
						String name = scanner.nextLine();
						System.out.print("Nhập email sinh viên: ");
						String email = scanner.nextLine();
						System.out.print("Nhập điểm trung bình: ");
						double gpa = scanner.nextDouble();
						if (gpa < 0.0 || gpa > 4.0) {
							System.out.println("Điểm trung bình phải nằm trong khoảng từ 0.0 đến 4.0.");
							break;
						}
						Student student = new Student(name, email, gpa);
						sm.addStudent(student);
					} catch (InputMismatchException e) {
						System.out.println("Điểm trung bình phải là một số.");
						scanner.nextLine(); // Clear invalid input
					}
					break;

				case 2:
					// Hiển thị danh sách sinh viên
					sm.displayStudents();
					break;

				case 3:
					// Tìm kiếm sinh viên theo tên
					System.out.print("Nhập tên sinh viên cần tìm: ");
					String searchName = scanner.nextLine();
					Student foundStudent = sm.findStudentByName(searchName);
					if (foundStudent != null) {
						System.out.println("Sinh viên tìm thấy: " + foundStudent);
					} else {
						System.out.println("Không tìm thấy sinh viên với tên: " + searchName);
					}
					break;

				case 4:
					// Xóa sinh viên khỏi danh sách
					System.out.print("Nhập tên sinh viên cần xóa: ");
					String removeName = scanner.nextLine();
					if (sm.removeStudent(removeName)) {
						System.out.println("Xóa sinh viên thành công.");
					} else {
						System.out.println("Không tìm thấy sinh viên với tên: " + removeName);
					}
					break;

				case 5:
					// Sắp xếp danh sách sinh viên theo điểm trung bình từ cao đến thấp
					sm.sortStudentsByGpa();
					System.out.println("Danh sách sinh viên đã được sắp xếp.");
					break;

				case 6:
					// Thoát
					running = false;
					System.out.println("thoat chuong trinh thanh cong");
					break;

				default:
					System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Lựa chọn phải là một số nguyên.");
				scanner.nextLine(); // Clear invalid input
			}
		}

		scanner.close();
	}
}
