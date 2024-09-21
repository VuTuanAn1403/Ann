package dd;

public class xemay extends xe {
	int dungtich;

	public xemay(String bienso, String hangxe, double giaban, int dungtich) {
		super();
		this.bienso = bienso;
		this.hangxe = hangxe;
		this.giaban = giaban;
		this.dungtich = dungtich;
	}

	public int getDungtich() {
		return dungtich;
	}

	public void setDungtich(int dungtich) {
		this.dungtich = dungtich;
	}

	@Override
	void hienthithongtin() {
		System.out.println("biển số " + bienso + " Hãng xe " + hangxe + " gia bán " + giaban + "dung tich" + dungtich);

	}

}
