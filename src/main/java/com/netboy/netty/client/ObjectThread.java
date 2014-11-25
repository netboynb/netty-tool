package com.netboy.netty.client;


import io.netty.channel.Channel;

import com.netboy.netty.common.People;
import com.netboy.netty.common.ReqProto;

/**
 * TODO
 * Administrator 2013-3-24下午04:19:38
 */
public class ObjectThread extends ClientThread {
	
	public void run() {
		while(true) {

			Channel channel = (Channel) nettyClient.getChannelFuture();
			System.out.println("填写信息，发送消息（Enter发送）:");
			ReqProto.Req req = getInfo();
			channel.write(req);
		}
	}
	public ReqProto.Req getInfo() {
		ReqProto.Req.Builder builder = ReqProto.Req.newBuilder();
		System.out.println("name: ");
		String name = scanner.next();
		builder.setName(name);
	    
	    System.out.println("age: ");
		String age = scanner.next();
		builder.setAge(Long.parseLong(age));
	    System.out.println("address: ");
		String address = scanner.next();
	    builder.setAddress(address);
	    return builder.build();
	}
}
