package com.netboy.netty.client;
import java.nio.channels.Channel;
import java.util.Scanner;

public class ClientThread extends Thread {
	protected NettyClient nettyClient;

	protected Scanner scanner = new Scanner(System.in);

	public void init() throws InterruptedException {
		nettyClient.init();
		nettyClient.start();
	}

	public void run() {
		while(true) {
			Channel channel = (Channel) nettyClient.getChannelFuture();
			System.out.println("发送消息（Enter发送）:");
			Object msg = scanner.next();
			if(msg.toString().equals("quit")) {
				System.out.println("wait, you will quit..");
				nettyClient.stop();
				
			}
			//channel.write(msg);
		}
	}

	public void setNettyClient(NettyClient nettyClient) {
		this.nettyClient = nettyClient;
	}

}
