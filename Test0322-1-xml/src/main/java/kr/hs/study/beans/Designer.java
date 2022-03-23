package kr.hs.study.beans;

public class Designer implements Employee{
	private int checkinTime;
	private int checkoutTime;
	
	public Designer(int checkinTime, int checkoutTime) {
		this.checkinTime = checkinTime;
		this.checkoutTime = checkoutTime;
	}

	public void Checkin() {
		System.out.println("디자이너 " + checkinTime + "시 출근");
	}

	public void Checkout() {
		System.out.println("디자이너 "+ checkoutTime + "시 퇴근");
	}
	
}
