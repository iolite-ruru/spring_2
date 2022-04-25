package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("aroundMethod 1");
		pjp.proceed();
		System.out.println("aroundMethod 2");
	}
	
	public void afterThrowing(Throwable e) {
		System.out.println("afterThrowing");
		System.out.println(e);
	}
	
	public void afterReturning() {
		System.out.println("afterReturning");
	}
}
