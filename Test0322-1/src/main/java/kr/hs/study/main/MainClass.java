package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Employee;
import kr.hs.study.beans.Publisher;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
	
		Employee obj1 = ctx.getBean("emp1", Designer.class);
		obj1.Checkin();
		obj1.Checkout();
		
		Employee obj2 = ctx.getBean("emp2", Developer.class);
		obj2.Checkin();
		obj2.Checkout();
		
		Employee obj3 = ctx.getBean("emp3", Publisher.class);
		obj3.Checkin();
		obj3.Checkout();
		
		
		ctx.close();
	}

}
