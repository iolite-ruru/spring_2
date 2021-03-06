package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Magazine;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public Novel book1() {
		return new Novel("kim", "spring", 8000);
	}
	
	@Bean
	public Poet book2() {
		return new Poet("lee ", "spring2", 10000);
	}
	
	@Bean
	public Magazine book3() {
		return new Magazine("park", "spring3", 20000);
	}
	
}
