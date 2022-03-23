package kr.hs.study.beans;

public class Novel implements Book{
	private String author;
	private String title;
	private int price;
	
	public Novel(String author, String title, int price) {
		this.author = author;
		this.title = title;
		this.price = price;
	}

	public void buy() {
		System.out.println(author +"�� �Ҽ� '"+ title + "'�� "+ price +"���� ���");
	}
	
	public void sell() {
		System.out.println(author +"�� �Ҽ� '"+ title + "'�� "+ price +"���� �Ǵ�");
	}
	
	public void create() {
		System.out.println(author +"�� �Ҽ� '"+ title + "'�� "+ price +"���� �����Ѵ�");		
	}
}