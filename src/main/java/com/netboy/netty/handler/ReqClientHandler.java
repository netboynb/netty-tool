package com.netboy.netty.handler;

import com.netboy.netty.common.ReqProto;
import com.netboy.netty.common.RespProto;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

public class ReqClientHandler extends ChannelHandlerAdapter {
	@Override
	public void channelActive(ChannelHandlerContext ctx) {
		for (int i = 0; i < 10; i++) {
			ctx.write(subReq(i));
		}
		ctx.flush();
	}

	private ReqProto.Req subReq(int i) {
		ReqProto.Req.Builder builder = ReqProto.Req.newBuilder();
		builder.setAge(i);
		builder.setName("netboy");
		builder.setAddress("浙江省杭州市余杭区");
		return builder.build();
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		RespProto.Resp resp = (RespProto.Resp)msg;
		System.out.println("Receive server response -->");
		System.out.println("       "+resp.getName());
		System.out.println("       "+resp.getAge());
		System.out.println("       "+resp.getAddress());
		System.out.println("       "+resp.getCount());
		System.out.println("       "+resp.getMsg());
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		ctx.flush();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
		cause.printStackTrace();
		ctx.close();
	}
}
