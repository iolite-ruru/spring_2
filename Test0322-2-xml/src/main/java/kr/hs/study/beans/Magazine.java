package kr.hs.study.beans;

public class Magazine implements Book{
	private String author;
	private String title;
	private int price;
	
	public Magazine(String author, String title, int price) {
		this.author = author;
		this.title = title;
		this.price = price;
	}
	
	public void buy() {
		System.out.println(author +"의 잡지 '"+ title + "'를 "+ price +"원에 산다");
	}
	
	public void sell() {
		System.out.println(author +"의 잡지 '"+ title + "'를 "+ price +"원에 판다");
	}
	
	public void create() {
		System.out.println(author +"의 잡지 '"+ title + "'를 "+ price +"원에 생산한다");
	}
}
