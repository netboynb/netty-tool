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
}
