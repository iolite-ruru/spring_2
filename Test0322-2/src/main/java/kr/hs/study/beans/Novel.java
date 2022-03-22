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
		System.out.println(author +"의 소설 '"+ title + "'를 "+ price +"원에 산다");
	}
	
	public void sell() {
		System.out.println(author +"의 소설 '"+ title + "'를 "+ price +"원에 판다");
	}
	
	public void create() {
		System.out.println(author +"의 소설 '"+ title + "'를 "+ price +"원에 생산한다");		
	}
}
