package kr.hs.study.beans;

public class PrintMsg implements IPrintMsg{

	public void sayHello1() {
		System.out.println("void sayHello1() 호출");
	}

	public void sayHello2() {
		System.out.println("void sayHello2() 호출");	
	}
	
	/*
	 * public int sayHello3() { System.out.println("int sayHello3() 호출"); return
	 * 10/0; }
	 * 
	 * public void function() { System.out.println("void function() 호출"); }
	 */
}
