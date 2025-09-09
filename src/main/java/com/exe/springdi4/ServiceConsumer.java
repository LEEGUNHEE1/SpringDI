package com.exe.springdi4;


public class ServiceConsumer {
	
	//������ ����(DI)
	MessageService ms;
	
	TimeService ts;
	
	JobService js;
	
	//�����ڸ� ���� ������ ����	
	public ServiceConsumer(MessageService ms) {
		this.ms = ms;
	}
	
	//�޼ҵ带 ���� ������ ����,�̸��� set�ݵ�� �ʿ�
	public void setTimeService(TimeService ts) {
		
		this.ts = ts;
		
	}
	
	public void setJobService(JobService js) {
		
		this.js = js;
		
	}
	
	
	
	public void consumerService() {
		
		//������ DI
		String message = ms.getMessage();
		System.out.println(message);
		
		//�޼ҵ� DI
		String time = ts.getTimeString();
		System.out.println(time);
		
		js.getJob();
		
	}

}
