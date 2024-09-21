package dd;

public class xehoi extends xe {

	int socho;

	public xehoi(String bienso, String hangxe, double giaban, int socho) {
		super();
		this.bienso = bienso;
		this.hangxe = hangxe;
		this.giaban = giaban;
		this.socho = socho;
	}

	public int getSocho() {
		return socho;
	}

	public void setSocho(int socho) {
		this.socho = socho;
	}

	@Override
	void hienthithongtin() {
		System.out.println("biển số " + bienso + " Hãng xe " + hangxe + " gia bán " + giaban + " socho " + socho);

	}

}
