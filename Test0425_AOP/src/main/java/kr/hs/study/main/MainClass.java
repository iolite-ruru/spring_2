package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.IPrintMsg;
import kr.hs.study.beans.PrintMsg;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//IPrintMsg obj = ctx.getBean("t1", IPrintMsg.class); //IPrintMsg.class?????
		IPrintMsg obj = ctx.getBean("t1", PrintMsg.class); //<aop:config proxy-target-class="true"> 사용한 경우
		
		obj.sayHello1();
		System.out.println();
		obj.sayHello2();
		/*
		 * System.out.println(); obj.sayHello3(); System.out.println(); obj.function();
		 */
		
		ctx.close();
	}

}
