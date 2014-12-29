package com.netboy.netty.common;

import java.io.IOException;

import org.apache.solr.common.util.JavaBinCodec;
import org.apache.solr.common.util.NamedList;

import com.google.protobuf.ByteString;

public class NettyUtils {
	public static NamedList<Object> bytesToObj(ByteString bs) throws IOException {
		if (bs == null) {
			return null;
		}
		return (NamedList<Object>) new JavaBinCodec().unmarshal(bs.newInput());
	}

	public static NamedList<Object> bytesToParams(ByteString bs) throws IOException {
		if (bs == null) {
			return null;
		}
		return (NamedList<Object>) new JavaBinCodec().unmarshal(bs.newInput());
	}

	public static ByteString paramsToBytes(NamedList<Object> nl, int initialCapacity) throws IOException {
		JavaBinCodec codec = new JavaBinCodec();

		SolrByteArrayOutputStream out = new SolrByteArrayOutputStream(initialCapacity);

		// nl 写到 out 里
		codec.marshal(nl, out);

		return byteArrayToBytes(out);
	}

	public static ByteString byteArrayToBytes(SolrByteArrayOutputStream byteArray) {
		return ByteString.copyFrom(byteArray.getBuf(), 0, byteArray.size());
	}
}
