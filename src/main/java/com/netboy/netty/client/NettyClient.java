package com.netboy.netty.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

import com.netboy.netty.solr.proto.SolrProtocol.SolrNettyResponse;

public class NettyClient {
	private int port = 8981;
	private String host = "127.0.0.1";
	private Bootstrap clientBootstrap;
	private ChannelHandlerAdapter handler;
	private ChannelFuture channelFuture;

	/**
	 * 初始化客户端
	 * 
	 * @throws InterruptedException
	 */
	public void start() throws InterruptedException {

		EventLoopGroup group = new NioEventLoopGroup();
		try {
			this.clientBootstrap = new Bootstrap();
			clientBootstrap.group(group).channel(NioSocketChannel.class).option(ChannelOption.TCP_NODELAY, true)
					.handler(new ChannelInitializer<SocketChannel>() {
						@Override
						public void initChannel(SocketChannel ch) throws Exception {
							ch.pipeline().addLast(new ProtobufVarint32FrameDecoder());
							ch.pipeline().addLast(new ProtobufDecoder(SolrNettyResponse.getDefaultInstance()));
							ch.pipeline().addLast(new ProtobufVarint32LengthFieldPrepender());
							ch.pipeline().addLast(new ProtobufEncoder());
							ch.pipeline().addLast(handler);
						}
					});

			// 发起异步连接操作
			channelFuture = clientBootstrap.connect(host, port).sync();
			// 当代客户端链路关闭
			channelFuture.channel().closeFuture().sync();

		} finally {
			// 优雅退出，释放NIO线程组
			group.shutdownGracefully();
		}
	}

	public ChannelFuture getChannelFuture() {
		return channelFuture;
	}

	public void stop() {

	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public ChannelHandlerAdapter getHandler() {
		return handler;
	}

	public void setHandler(ChannelHandlerAdapter handler) {
		this.handler = handler;
	}

}