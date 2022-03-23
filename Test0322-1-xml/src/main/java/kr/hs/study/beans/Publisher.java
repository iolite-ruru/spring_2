package kr.hs.study.beans;

public class Publisher implements Employee{
	private int checkinTime;
	private int checkoutTime;
	
	public Publisher(int checkinTime, int checkoutTime) {
		this.checkinTime = checkinTime;
		this.checkoutTime = checkoutTime;
	}

	public void Checkin() {
		System.out.println("�ۺ��� "+ checkinTime +"�� ���");
	}

	public void Checkout() {
		System.out.println("�ۺ��� "+ checkoutTime +"�� ���");
	}

}
