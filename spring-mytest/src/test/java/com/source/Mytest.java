package com.source;

import com.source.config.AppConfig;
import com.source.service.TestService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author luodong
 * @create 2019-07-02 20:47
 **/
public class Mytest {

	@Test
	public void testBean() {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TestService testService = context.getBean(TestService.class);
		testService.sayHello();
	}

}
