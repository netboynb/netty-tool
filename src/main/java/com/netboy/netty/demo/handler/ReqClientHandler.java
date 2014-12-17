package com.netboy.netty.demo.handler;

import com.netboy.netty.common.ReqProto;
import com.netboy.netty.common.RespProto;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

public class ReqClientHandler extends ChannelHandlerAdapter {
	@Override
	public void channelActive(ChannelHandlerContext ctx) {
		for (int i = 0; i < 1; i++) {
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
		System.out.println("Receive server response");
		System.out.println("name = "+resp.getName());
		System.out.println("age  = "+resp.getAge());
		System.out.println("address = "+resp.getAddress());
		System.out.println("count = "+resp.getCount());
		System.out.println("Msg = "+resp.getMsg());
		System.out.println("##################################");
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
