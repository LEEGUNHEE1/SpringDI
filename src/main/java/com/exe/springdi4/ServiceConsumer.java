package com.exe.springdi4;


public class ServiceConsumer {
	
	//의존성 주입(DI)
	MessageService ms;
	
	TimeService ts;
	
	JobService js;
	
	//생성자를 통한 의존성 주입	
	public ServiceConsumer(MessageService ms) {
		this.ms = ms;
	}
	
	//메소드를 통한 의존성 주입,이름에 set반드시 필요
	public void setTimeService(TimeService ts) {
		
		this.ts = ts;
		
	}
	
	public void setJobService(JobService js) {
		
		this.js = js;
		
	}
	
	
	
	public void consumerService() {
		
		//생성자 DI
		String message = ms.getMessage();
		System.out.println(message);
		
		//메소드 DI
		String time = ts.getTimeString();
		System.out.println(time);
		
		js.getJob();
		
	}

}
