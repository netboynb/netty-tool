package com.netboy.netty.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.netboy.netty.client.NettyClient;

/**
 * TODO
 * Administrator 2013-3-23下午07:50:49
 */
public class RunClient {
    
	public static void main(String[] args) throws InterruptedException {
		
    	String contextFile = "./conf/spring-client.xml";
    	
		ApplicationContext context = null;
		try {
			context = new FileSystemXmlApplicationContext(contextFile);
		} catch (Exception e) {
			System.out.println("RunMain has some exception");
			e.printStackTrace();
		}
		NettyClient client = (NettyClient)context.getBean("nettyClient");
		try {
			
				client.start();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true){
			Thread.sleep(5000);
			System.out.println("sleep 5s");
		}
		
	}
}
