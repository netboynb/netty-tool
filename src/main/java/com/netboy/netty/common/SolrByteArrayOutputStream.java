package com.netboy.netty.common;

import java.io.ByteArrayOutputStream;

public class SolrByteArrayOutputStream extends ByteArrayOutputStream {
	public SolrByteArrayOutputStream() {
		super();
	}

	public SolrByteArrayOutputStream(int size) {
		super(size);
	}

	public byte[] getBuf() {
		return buf;
	}
}
