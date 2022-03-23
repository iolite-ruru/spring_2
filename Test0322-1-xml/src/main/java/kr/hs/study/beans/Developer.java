package kr.hs.study.beans;

public class Developer implements Employee{
	private int checkinTime;
	private int checkoutTime;
	
	public Developer(int checkinTime, int checkoutTime) {
		this.checkinTime = checkinTime;
		this.checkoutTime = checkoutTime;
	}

	public void Checkin() {
		System.out.println("개발자 "+ checkinTime +"시 출근");
	}

	public void Checkout() {
		System.out.println("개발자 "+ checkoutTime +"시 퇴근");
	}

}
