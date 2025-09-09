package com.exe.springdi3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageService {
	
	public void messageService() {
		
		//BeanFactory »ý¼º,xmlÀÐ¾î¼­ °´Ã¼È­
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("app-context.xml");

		
		//Bean °´Ã¼ È¹µæ
		Message ms = (Message)context.getBean("message");
		
		ms.sayHello("¹è¼öÁö");
		
	}
	
	
	
}
