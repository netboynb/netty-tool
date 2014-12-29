package com.netboy.netty.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.solr.common.util.ContentStream;
import org.apache.solr.common.util.ContentStreamBase;

import com.google.protobuf.ByteString;

/**
 * 
 */
public class ByteStringContentStream implements ContentStream {

	protected final ByteString byteBuf;
	
	public ByteStringContentStream(ByteString byteBuf) {
		if(byteBuf == null) {
			throw new IllegalArgumentException("FastByteContentStream need ByteString");
		}
		this.byteBuf = byteBuf;
	}

	@Override
	public InputStream getStream() throws IOException {
		
		return byteBuf.newInput();
	}

	@Override
	public String getName() {
		return "";
	}

	@Override
	public String getSourceInfo() {
		return "javabin";
	}

	@Override
	public String getContentType() {
		return "application/octet-stream";
	}

	@Override
	public Long getSize() {
		return new Long(byteBuf.size());
	}

	@Override
	public Reader getReader() throws IOException {
		//throw new UnsupportedOperationException("No reader available . this is a binarystream");
		//use default 'utf-8' parse to string for query ContentStream
		return new InputStreamReader(getStream(), ContentStreamBase.DEFAULT_CHARSET);
	}

	public ByteString getByteBuf() {
		return byteBuf;
	}

}
