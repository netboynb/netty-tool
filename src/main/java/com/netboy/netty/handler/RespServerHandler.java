package com.netboy.netty.handler;

import com.netboy.netty.common.ReqProto;
import com.netboy.netty.common.RespProto;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

public class RespServerHandler extends ChannelHandlerAdapter {
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		ReqProto.Req req = (ReqProto.Req) msg;
			System.out.println("Service accept client subscribe req -->");
			System.out.println("    "+req.getName());
			System.out.println("    "+req.getAge());
			System.out.println("    "+req.getAddress());
			ctx.writeAndFlush(resp(req.getAge()));
	}

	private RespProto.Resp resp(long age) {
		RespProto.Resp.Builder builder = RespProto.Resp.newBuilder();
		builder.setAge(age);
		builder.setAddress("返回原请求地址");
		builder.setCount(age);
		builder.setName("netboy");
		builder.setMsg("服务器返回信息。。。");
		return builder.build();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
		cause.printStackTrace();
		ctx.close();// 发生异常，关闭链路
	}
}
