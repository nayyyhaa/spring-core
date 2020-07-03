package com.neha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		PrintMessage p=(PrintMessage)ctx.getBean("PObj");
		System.out.println(p.getMsg());

	}

}
