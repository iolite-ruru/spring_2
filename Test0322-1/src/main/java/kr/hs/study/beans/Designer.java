package kr.hs.study.beans;

public class Designer implements Employee{
	private int checkinTime;
	private int checkoutTime;
	
	public Designer(int checkinTime, int checkoutTime) {
		this.checkinTime = checkinTime;
		this.checkoutTime = checkoutTime;
	}

	public void Checkin() {
		System.out.println("�����̳� " + checkinTime + "�� ���");
	}

	public void Checkout() {
		System.out.println("�����̳� " + "�� ���");
	}
	
}