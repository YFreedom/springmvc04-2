package com.zhidi.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhidi.entity.Dept;
import com.zhidi.entity.Emp;
import com.zhidi.service.IEmpService;

public class Text {
	
	private ApplicationContext context;
	@Before
	public void loadXml(){
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	@Test
	public void query(){
		IEmpService service = context.getBean("empServiceImpl",IEmpService.class);
		Emp emp = service.get(1);
		System.out.println(emp.toString());
	}
}
