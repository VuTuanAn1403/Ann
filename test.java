package dd;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<xehoi> Hoi = new ArrayList<>();
	private static ArrayList<xemay> May = new ArrayList<>();

	private static void nhapxehoi(Scanner sc) {
		System.out.println("nhap biến số xe hơi");
		String bienso = sc.nextLine();
		String hangxe = "Xe hoi";
		System.out.println("Nhap gia ban");
		double giaban = sc.nextDouble();
		System.out.println("nhap so cho");
		int socho = sc.nextInt();
		xehoi nhapxehoi = new xehoi(bienso, hangxe, giaban, socho);
		Hoi.add(nhapxehoi);
		System.out.println("nhap thanh cong thong tin xe hoi");
	}

	private static void nhapxemay(Scanner sc) {
		System.out.println("nhap bien số xe may");
		String bienso = sc.nextLine();
		String hangxe = "Xe may";
		System.out.println("Nhap gia ban");
		double giaban = sc.nextDouble();
		System.out.println("nhap dung tich");
		int dungtich = sc.nextInt();
		xemay nhapxemay = new xemay(bienso, hangxe, giaban, dungtich);
		May.add(nhapxemay);
		System.out.println("nhap thanh cong thong tin xe may");
	}

	private static void thongtinxe() {
		System.out.println("thong tin tat ca xe hoi la: ");
		for (xehoi xe : Hoi) {
			xe.hienthithongtin();
		}
		System.out.println("thong tin tat ca xe may la: ");
		for (xemay xe : May) {
			xe.hienthithongtin();
		}
	}

	private static void sumallxe() {
		double tong = 0;
		for (xehoi xe : Hoi) {
			tong += xe.giaban;
		}
		for (xemay xe : May) {
			tong += xe.giaban;
		}
		System.out.println("Tong gia ban cua tat ca cac xe la: " + tong);
	}

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("1.them thong tin xe hoi");
			System.out.println("2. them thong tin xe may");
			System.out.println("3.hien thi danh sach tat ca cac xe");
			System.out.println("4.tinh va hien thi tong gia ban cua tat ca cac xe");
			System.out.println("5.thoat chuong trinh");
			System.out.println("chon 1 tuy chon: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				nhapxehoi(sc);
				break;
			case 2:
				nhapxemay(sc);
				break;
			case 3:
				thongtinxe();
				break;
			case 4:
				sumallxe();
				break;
			case 5:
				System.out.println("thoat chuong trinh thanh cong");
				break;
			default:
				System.out.println("lua chon khong hop le. Vui long nhap lai");
			}

		} while (choice != 5);

	}

}
