package com.netboy.netty.client;

import org.jboss.netty.channel.Channel;

import com.netboy.netty.common.People;

/**
 * TODO
 * Administrator 2013-3-24下午04:19:38
 */
public class ObjectThread extends ClientThread {
	
	public void run() {
		while(true) {

			Channel channel = nettyClient.getChannelFuture().getChannel();
			System.out.println("填写信息，发送消息（Enter发送）:");
			People people = getInfo();
			channel.write(people);
		}
	}
	public People getInfo() {
		People manPeople = new People();
		System.out.println("name: ");
		String name = scanner.next();
	    manPeople.setName(name);
	    
	    System.out.println("age: ");
		String age = scanner.next();
	    manPeople.setAge(age);
	    System.out.println("address: ");
		String address = scanner.next();
	    manPeople.setAddress(address);
	    return manPeople;
	}
}
