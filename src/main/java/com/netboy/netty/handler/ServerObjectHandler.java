package com.netboy.netty.handler;

import java.util.Date;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

import com.netboy.netty.common.People;

/**
 * TODO Administrator 2013-3-24下午04:37:18
 */
public class ServerObjectHandler extends SimpleChannelHandler {

	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
		People people = (People) e.getMessage();
		System.out.println("" + new Date().toString());
		System.out.println("get one info:"+"\n" + "   name:" + people.getName() + "\n"
				                                + "    age:" +people.getAge() + "\n"
				                                + "address:" + people.getAddress() + "\n"); 
		Channel ch = e.getChannel();
		//String string = "server has got the object";
		Object object ="server has got the object";
		ch.write(object);
	}
}
