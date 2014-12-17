// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Req.proto

package com.netboy.netty.solr.proto;

public final class ReqSolrProto {
  private ReqSolrProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:netty.Req)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string params = 2;</code>
     *
     * <pre>
     *for string, json format, like http params
     * </pre>
     */
    boolean hasParams();
    /**
     * <code>required string params = 2;</code>
     *
     * <pre>
     *for string, json format, like http params
     * </pre>
     */
    java.lang.String getParams();
    /**
     * <code>required string params = 2;</code>
     *
     * <pre>
     *for string, json format, like http params
     * </pre>
     */
    com.google.protobuf.ByteString
        getParamsBytes();

    /**
     * <code>optional int32 streamsFormat = 3;</code>
     *
     * <pre>
     *(xml, json, solr_javabin) fix by params rt (request type)
     * </pre>
     */
    boolean hasStreamsFormat();
    /**
     * <code>optional int32 streamsFormat = 3;</code>
     *
     * <pre>
     *(xml, json, solr_javabin) fix by params rt (request type)
     * </pre>
     */
    int getStreamsFormat();

    /**
     * <code>repeated bytes streams = 4;</code>
     */
    java.util.List<com.google.protobuf.ByteString> getStreamsList();
    /**
     * <code>repeated bytes streams = 4;</code>
     */
    int getStreamsCount();
    /**
     * <code>repeated bytes streams = 4;</code>
     */
    com.google.protobuf.ByteString getStreams(int index);
  }
  /**
   * Protobuf type {@code netty.Req}
   */
  public static final class Req extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:netty.Req)
      ReqOrBuilder {
    // Use Req.newBuilder() to construct.
    private Req(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Req(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Req defaultInstance;
    public static Req getDefaultInstance() {
      return defaultInstance;
    }

    public Req getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Req(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              params_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000002;
              streamsFormat_ = input.readInt32();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                streams_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
                mutable_bitField0_ |= 0x00000004;
              }
              streams_.add(input.readBytes());
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          streams_ = java.util.Collections.unmodifiableList(streams_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.netboy.netty.solr.proto.ReqSolrProto.internal_static_netty_Req_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.netboy.netty.solr.proto.ReqSolrProto.internal_static_netty_Req_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.netboy.netty.solr.proto.ReqSolrProto.Req.class, com.netboy.netty.solr.proto.ReqSolrProto.Req.Builder.class);
    }

    public static com.google.protobuf.Parser<Req> PARSER =
        new com.google.protobuf.AbstractParser<Req>() {
      public Req parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Req(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Req> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private java.lang.Object params_;
    /**
     * <code>required string params = 2;</code>
     *
     * <pre>
     *for string, json format, like http params
     * </pre>
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string params = 2;</code>
     *
     * <pre>
     *for string, json format, like http params
     * </pre>
     */
    public java.lang.String getParams() {
      java.lang.Object ref = params_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          params_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string params = 2;</code>
     *
     * <pre>
     *for string, json format, like http params
     * </pre>
     */
    public com.google.protobuf.ByteString
        getParamsBytes() {
      java.lang.Object ref = params_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        params_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STREAMSFORMAT_FIELD_NUMBER = 3;
    private int streamsFormat_;
    /**
     * <code>optional int32 streamsFormat = 3;</code>
     *
     * <pre>
     *(xml, json, solr_javabin) fix by params rt (request type)
     * </pre>
     */
    public boolean hasStreamsFormat() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 streamsFormat = 3;</code>
     *
     * <pre>
     *(xml, json, solr_javabin) fix by params rt (request type)
     * </pre>
     */
    public int getStreamsFormat() {
      return streamsFormat_;
    }

    public static final int STREAMS_FIELD_NUMBER = 4;
    private java.util.List<com.google.protobuf.ByteString> streams_;
    /**
     * <code>repeated bytes streams = 4;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getStreamsList() {
      return streams_;
    }
    /**
     * <code>repeated bytes streams = 4;</code>
     */
    public int getStreamsCount() {
      return streams_.size();
    }
    /**
     * <code>repeated bytes streams = 4;</code>
     */
    public com.google.protobuf.ByteString getStreams(int index) {
      return streams_.get(index);
    }

    private void initFields() {
      params_ = "";
      streamsFormat_ = 0;
      streams_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasParams()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(2, getParamsBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(3, streamsFormat_);
      }
      for (int i = 0; i < streams_.size(); i++) {
        output.writeBytes(4, streams_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getParamsBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, streamsFormat_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < streams_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(streams_.get(i));
        }
        size += dataSize;
        size += 1 * getStreamsList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.netboy.netty.solr.proto.ReqSolrProto.Req parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.netboy.netty.solr.proto.ReqSolrProto.Req parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.netboy.netty.solr.proto.ReqSolrProto.Req parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.netboy.netty.solr.proto.ReqSolrProto.Req parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.netboy.netty.solr.proto.ReqSolrProto.Req parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.netboy.netty.solr.proto.ReqSolrProto.Req parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.netboy.netty.solr.proto.ReqSolrProto.Req parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.netboy.netty.solr.proto.ReqSolrProto.Req parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.netboy.netty.solr.proto.ReqSolrProto.Req parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.netboy.netty.solr.proto.ReqSolrProto.Req parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.netboy.netty.solr.proto.ReqSolrProto.Req prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code netty.Req}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:netty.Req)
        com.netboy.netty.solr.proto.ReqSolrProto.ReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.netboy.netty.solr.proto.ReqSolrProto.internal_static_netty_Req_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.netboy.netty.solr.proto.ReqSolrProto.internal_static_netty_Req_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.netboy.netty.solr.proto.ReqSolrProto.Req.class, com.netboy.netty.solr.proto.ReqSolrProto.Req.Builder.class);
      }

      // Construct using com.netboy.netty.solr.proto.ReqSolrProto.Req.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        params_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        streamsFormat_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        streams_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.netboy.netty.solr.proto.ReqSolrProto.internal_static_netty_Req_descriptor;
      }

      public com.netboy.netty.solr.proto.ReqSolrProto.Req getDefaultInstanceForType() {
        return com.netboy.netty.solr.proto.ReqSolrProto.Req.getDefaultInstance();
      }

      public com.netboy.netty.solr.proto.ReqSolrProto.Req build() {
        com.netboy.netty.solr.proto.ReqSolrProto.Req result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.netboy.netty.solr.proto.ReqSolrProto.Req buildPartial() {
        com.netboy.netty.solr.proto.ReqSolrProto.Req result = new com.netboy.netty.solr.proto.ReqSolrProto.Req(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.params_ = params_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.streamsFormat_ = streamsFormat_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          streams_ = java.util.Collections.unmodifiableList(streams_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.streams_ = streams_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.netboy.netty.solr.proto.ReqSolrProto.Req) {
          return mergeFrom((com.netboy.netty.solr.proto.ReqSolrProto.Req)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.netboy.netty.solr.proto.ReqSolrProto.Req other) {
        if (other == com.netboy.netty.solr.proto.ReqSolrProto.Req.getDefaultInstance()) return this;
        if (other.hasParams()) {
          bitField0_ |= 0x00000001;
          params_ = other.params_;
          onChanged();
        }
        if (other.hasStreamsFormat()) {
          setStreamsFormat(other.getStreamsFormat());
        }
        if (!other.streams_.isEmpty()) {
          if (streams_.isEmpty()) {
            streams_ = other.streams_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureStreamsIsMutable();
            streams_.addAll(other.streams_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasParams()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.netboy.netty.solr.proto.ReqSolrProto.Req parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.netboy.netty.solr.proto.ReqSolrProto.Req) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object params_ = "";
      /**
       * <code>required string params = 2;</code>
       *
       * <pre>
       *for string, json format, like http params
       * </pre>
       */
      public boolean hasParams() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string params = 2;</code>
       *
       * <pre>
       *for string, json format, like http params
       * </pre>
       */
      public java.lang.String getParams() {
        java.lang.Object ref = params_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            params_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string params = 2;</code>
       *
       * <pre>
       *for string, json format, like http params
       * </pre>
       */
      public com.google.protobuf.ByteString
          getParamsBytes() {
        java.lang.Object ref = params_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          params_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string params = 2;</code>
       *
       * <pre>
       *for string, json format, like http params
       * </pre>
       */
      public Builder setParams(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        params_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string params = 2;</code>
       *
       * <pre>
       *for string, json format, like http params
       * </pre>
       */
      public Builder clearParams() {
        bitField0_ = (bitField0_ & ~0x00000001);
        params_ = getDefaultInstance().getParams();
        onChanged();
        return this;
      }
      /**
       * <code>required string params = 2;</code>
       *
       * <pre>
       *for string, json format, like http params
       * </pre>
       */
      public Builder setParamsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        params_ = value;
        onChanged();
        return this;
      }

      private int streamsFormat_ ;
      /**
       * <code>optional int32 streamsFormat = 3;</code>
       *
       * <pre>
       *(xml, json, solr_javabin) fix by params rt (request type)
       * </pre>
       */
      public boolean hasStreamsFormat() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 streamsFormat = 3;</code>
       *
       * <pre>
       *(xml, json, solr_javabin) fix by params rt (request type)
       * </pre>
       */
      public int getStreamsFormat() {
        return streamsFormat_;
      }
      /**
       * <code>optional int32 streamsFormat = 3;</code>
       *
       * <pre>
       *(xml, json, solr_javabin) fix by params rt (request type)
       * </pre>
       */
      public Builder setStreamsFormat(int value) {
        bitField0_ |= 0x00000002;
        streamsFormat_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 streamsFormat = 3;</code>
       *
       * <pre>
       *(xml, json, solr_javabin) fix by params rt (request type)
       * </pre>
       */
      public Builder clearStreamsFormat() {
        bitField0_ = (bitField0_ & ~0x00000002);
        streamsFormat_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<com.google.protobuf.ByteString> streams_ = java.util.Collections.emptyList();
      private void ensureStreamsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          streams_ = new java.util.ArrayList<com.google.protobuf.ByteString>(streams_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated bytes streams = 4;</code>
       */
      public java.util.List<com.google.protobuf.ByteString>
          getStreamsList() {
        return java.util.Collections.unmodifiableList(streams_);
      }
      /**
       * <code>repeated bytes streams = 4;</code>
       */
      public int getStreamsCount() {
        return streams_.size();
      }
      /**
       * <code>repeated bytes streams = 4;</code>
       */
      public com.google.protobuf.ByteString getStreams(int index) {
        return streams_.get(index);
      }
      /**
       * <code>repeated bytes streams = 4;</code>
       */
      public Builder setStreams(
          int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureStreamsIsMutable();
        streams_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes streams = 4;</code>
       */
      public Builder addStreams(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureStreamsIsMutable();
        streams_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes streams = 4;</code>
       */
      public Builder addAllStreams(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureStreamsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, streams_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes streams = 4;</code>
       */
      public Builder clearStreams() {
        streams_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:netty.Req)
    }

    static {
      defaultInstance = new Req(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:netty.Req)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_netty_Req_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_netty_Req_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tReq.proto\022\005netty\"=\n\003Req\022\016\n\006params\030\002 \002(" +
      "\t\022\025\n\rstreamsFormat\030\003 \001(\005\022\017\n\007streams\030\004 \003(" +
      "\014B-\n\033com.netboy.netty.solr.protoB\014ReqSol" +
      "rProtoH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_netty_Req_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_netty_Req_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_netty_Req_descriptor,
        new java.lang.String[] { "Params", "StreamsFormat", "Streams", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
