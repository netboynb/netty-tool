package com.netboy.netty.solr.handler;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

import java.io.IOException;

import org.apache.solr.common.params.ModifiableSolrParams;
import org.apache.solr.common.util.NamedList;
import org.apache.solr.request.LocalSolrQueryRequest;
import org.apache.solr.response.BinaryResponseWriter;
import org.apache.solr.response.SolrQueryResponse;

import com.google.protobuf.ByteString;
import com.netboy.netty.common.SolrByteArrayOutputStream;
import com.netboy.netty.solr.proto.ReqSolrProto;
import com.netboy.netty.solr.proto.RespSolrProto;
import io.netty.channel.ChannelHandler.Sharable;
/**
 * 
*   
* 项目名称：netty-tool  
* 类名称：RespSolrHandler  
* 类描述： 用于序列化solr返回的结果  
* 创建人：quzhu.wl  
* 创建时间：2014年11月27日 下午7:46:34  
* @version
 */

@Sharable
public class RespSolrHandler extends ChannelHandlerAdapter {
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		ReqSolrProto.Req req = (ReqSolrProto.Req) msg;
			System.out.println("Service accept client subscribe req");
			System.out.println("solr query string  = "+req.getParams());
			System.out.println("solr query format = "+req.getStreamsFormat());
			ctx.writeAndFlush(resp(req.getStreamsFormat()));
	}

	private RespSolrProto.Resp resp(long age) {
		RespSolrProto.Resp.Builder builder = RespSolrProto.Resp.newBuilder();
		builder.setErrorCode(0);
		builder.setErrorStr("OK");
		builder.setResponseFormat(3);
		SolrQueryResponse solrQueryResponse = new SolrQueryResponse();
		solrQueryResponse.setEndTime(1000);
		NamedList<Object> nameValuePairs = new NamedList<>();
		nameValuePairs.add("fileld_1", "111");
		nameValuePairs.add("fileld_2", "222");
		solrQueryResponse.setAllValues(nameValuePairs);
		builder.setResponse(respConvertByteStr(solrQueryResponse));
		return builder.build();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
		cause.printStackTrace();
		ctx.close();// 发生异常，关闭链路
	}
	/**
	 * @throws IOException 
	 * 
	* @Description: TODO将solrResponse转换为byteString
	* @params @return
	* @return ByteString 
	* @throws
	 */
	private ByteString respConvertByteStr(SolrQueryResponse resp){
		SolrByteArrayOutputStream  out = new SolrByteArrayOutputStream(1024);
		BinaryResponseWriter bwrt = new BinaryResponseWriter();
		try {
			ModifiableSolrParams solrParam = new ModifiableSolrParams();
			LocalSolrQueryRequest solrQueryRequest = new LocalSolrQueryRequest(null, solrParam);
			bwrt.write(out, solrQueryRequest, resp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ByteString.copyFrom(out.getBuf(), 0, out.size());
		
	}
}
