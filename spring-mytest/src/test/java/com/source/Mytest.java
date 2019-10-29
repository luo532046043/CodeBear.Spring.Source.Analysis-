package com.source;

import com.source.config.AppConfig;
import com.source.service.TestService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.AntPathMatcher;

import java.util.UUID;

/**
 * @author luodong
 * @create 2019-06-18 16:02
 **/
public class MyTest {

	public static void main(String[] args) {
		System.out.println(UUID.randomUUID());
		String locationPattern = "classpath*:com/source/MyTest.class";
		new AntPathMatcher().isPattern(locationPattern.substring("classpath*:".length()));
	}

	@Test
	public void testBean() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		TestService testService = (TestService) applicationContext.getBean("testService");

		//testService.sayHello();
	}

	@Test
	public void testResourceLoad(){
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource fileResource1 = resourceLoader.getResource("D:/info.log");
		System.out.println("fileResource1 is FileSystemResource:" + (fileResource1 instanceof FileSystemResource));
		System.out.println(fileResource1.getClass().getName());
	}
}