package com.exe.springdi2;

public class MessageCall {

	public static void main(String[] args) {

		System.out.println("1.�Ϲ����� ��ü ����");
		MessageEn ob1 = new MessageEn();
		ob1.sayHello("suzi");
		
		MessageKr ob2 = new MessageKr();
		ob2.sayHello("����");
		
		System.out.println("2.�������̽� ��ü ����");
		
		Message ms = null;
		
		ms = new MessageEn();
		ms.sayHello("inna");
		
		ms = new MessageKr();
		ms.sayHello("�γ�");
		
		
	}

}
