package com.netboy.netty.solr.handler;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.solr.common.params.ModifiableSolrParams;
import org.apache.solr.common.params.SolrParams;
import org.apache.solr.common.util.NamedList;

import com.google.protobuf.ByteString;
import com.netboy.netty.common.NettyUtils;
import com.netboy.netty.solr.proto.SolrProtocol.SolrNettyRequest;
import com.netboy.netty.solr.proto.SolrProtocol.SolrNettyResponse;

/**
 * 
*   
* 项目名称：netty-tool  
* 类名称：ReqSolrHandler  
* 类描述：  用于序列化solr请求
* 创建人：netboy
* 创建时间：2014年11月27日 下午7:45:30  
* @version
 */
@Sharable
public class ReqSolrHandler extends ChannelHandlerAdapter{
	@Override
	public void channelActive(ChannelHandlerContext ctx) {
		for (int i = 0; i < 1; i++) {
			ctx.write(subReq(i));
		}
		ctx.flush();
	}


	private SolrNettyRequest subReq(int i) {
		SolrNettyRequest.Builder builder = SolrNettyRequest.newBuilder();
		ModifiableSolrParams solrParams = new ModifiableSolrParams();
		solrParams.set("q", "*:*");
		solrParams.set("_core", "merge");
		NamedList<Object> namedList =solrParams.toNamedList();
		try {
			builder.setParams(NettyUtils.paramsToBytes(namedList, 40*namedList.size()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		builder.setStreamsFormat(3);
		builder.setRid(i);
		return builder.build();
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		SolrNettyResponse resp = (SolrNettyResponse)msg;
		System.out.println("Receive server response");
		
		System.out.println("Response Format = "+resp.getResponseFormat());
		System.out.println("Response error code ="+resp.getErrorCode());
		System.out.println("Response error str ="+resp.getErrorStr());
		System.out.println("Response  ="+resp.getResponse());
		System.out.println("##################################");
		long start = System.currentTimeMillis();
		 NamedList<Object> namedList = NettyUtils.bytesToObj(resp.getResponse());
		 long time = System.currentTimeMillis()-start;
		 Iterator  iterator =namedList.iterator();
		 while(iterator.hasNext()){
			 Map.Entry<String,Object>  entry= (Entry<String, Object>) iterator.next();
			 System.out.println("key="+entry.getKey()+"  value = "+entry.getValue());
		 }
		 System.out.println("use time = "+time+"ms");
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
