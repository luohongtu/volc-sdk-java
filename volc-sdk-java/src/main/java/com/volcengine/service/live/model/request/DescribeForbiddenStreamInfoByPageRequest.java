// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/request/request_live.proto

package com.volcengine.service.live.model.request;

/**
 * Protobuf type {@code Volcengine.Live.Models.Request.DescribeForbiddenStreamInfoByPageRequest}
 */
public final class DescribeForbiddenStreamInfoByPageRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Live.Models.Request.DescribeForbiddenStreamInfoByPageRequest)
    DescribeForbiddenStreamInfoByPageRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DescribeForbiddenStreamInfoByPageRequest.newBuilder() to construct.
  private DescribeForbiddenStreamInfoByPageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DescribeForbiddenStreamInfoByPageRequest() {
    vhost_ = "";
    app_ = "";
    stream_ = "";
    sort_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DescribeForbiddenStreamInfoByPageRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DescribeForbiddenStreamInfoByPageRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            pageNum_ = input.readInt64();
            break;
          }
          case 16: {

            pageSize_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            vhost_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            app_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            stream_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            sort_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.live.model.request.LiveRequest.internal_static_Volcengine_Live_Models_Request_DescribeForbiddenStreamInfoByPageRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.live.model.request.LiveRequest.internal_static_Volcengine_Live_Models_Request_DescribeForbiddenStreamInfoByPageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest.class, com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest.Builder.class);
  }

  public static final int PAGENUM_FIELD_NUMBER = 1;
  private long pageNum_;
  /**
   * <pre>
   *当前页码，取值范围 ≥1。
   * </pre>
   *
   * <code>int64 PageNum = 1;</code>
   * @return The pageNum.
   */
  @java.lang.Override
  public long getPageNum() {
    return pageNum_;
  }

  public static final int PAGESIZE_FIELD_NUMBER = 2;
  private long pageSize_;
  /**
   * <pre>
   *分页大小，取值范围为 。
   * </pre>
   *
   * <code>int64 PageSize = 2;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public long getPageSize() {
    return pageSize_;
  }

  public static final int VHOST_FIELD_NUMBER = 3;
  private volatile java.lang.Object vhost_;
  /**
   * <pre>
   *域名空间名称。
   *参数 `Domain` 和 `Vhost`传且仅传一个。
   * </pre>
   *
   * <code>string Vhost = 3;</code>
   * @return The vhost.
   */
  @java.lang.Override
  public java.lang.String getVhost() {
    java.lang.Object ref = vhost_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vhost_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *域名空间名称。
   *参数 `Domain` 和 `Vhost`传且仅传一个。
   * </pre>
   *
   * <code>string Vhost = 3;</code>
   * @return The bytes for vhost.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVhostBytes() {
    java.lang.Object ref = vhost_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vhost_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APP_FIELD_NUMBER = 4;
  private volatile java.lang.Object app_;
  /**
   * <pre>
   * 应用名称，默认查询所有应用名称，由 1 到 30
   * 位数字、字母、下划线及"-"和"."组成。
   * </pre>
   *
   * <code>string App = 4;</code>
   * @return The app.
   */
  @java.lang.Override
  public java.lang.String getApp() {
    java.lang.Object ref = app_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      app_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 应用名称，默认查询所有应用名称，由 1 到 30
   * 位数字、字母、下划线及"-"和"."组成。
   * </pre>
   *
   * <code>string App = 4;</code>
   * @return The bytes for app.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAppBytes() {
    java.lang.Object ref = app_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      app_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STREAM_FIELD_NUMBER = 5;
  private volatile java.lang.Object stream_;
  /**
   * <pre>
   * 流名称，缺省情况下，查询所有流名称，由 1 到 100
   * 位数字、字母、下划线及"-"和"."组成，如果指定 Stream，必须同时指定 App 的值
   * </pre>
   *
   * <code>string Stream = 5;</code>
   * @return The stream.
   */
  @java.lang.Override
  public java.lang.String getStream() {
    java.lang.Object ref = stream_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stream_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 流名称，缺省情况下，查询所有流名称，由 1 到 100
   * 位数字、字母、下划线及"-"和"."组成，如果指定 Stream，必须同时指定 App 的值
   * </pre>
   *
   * <code>string Stream = 5;</code>
   * @return The bytes for stream.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStreamBytes() {
    java.lang.Object ref = stream_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stream_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SORT_FIELD_NUMBER = 6;
  private volatile java.lang.Object sort_;
  /**
   * <pre>
   * 排列方式，根据结束时间排序。支持两种形式。缺省情况下为 desc。
   *&lt;li&gt;asc：按从小到大升序排列；
   *&lt;li&gt;desc：按从大到小降序排列。
   * </pre>
   *
   * <code>string Sort = 6;</code>
   * @return The sort.
   */
  @java.lang.Override
  public java.lang.String getSort() {
    java.lang.Object ref = sort_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sort_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 排列方式，根据结束时间排序。支持两种形式。缺省情况下为 desc。
   *&lt;li&gt;asc：按从小到大升序排列；
   *&lt;li&gt;desc：按从大到小降序排列。
   * </pre>
   *
   * <code>string Sort = 6;</code>
   * @return The bytes for sort.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSortBytes() {
    java.lang.Object ref = sort_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sort_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (pageNum_ != 0L) {
      output.writeInt64(1, pageNum_);
    }
    if (pageSize_ != 0L) {
      output.writeInt64(2, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vhost_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, vhost_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(app_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, app_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stream_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, stream_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sort_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, sort_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageNum_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, pageNum_);
    }
    if (pageSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vhost_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, vhost_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(app_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, app_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stream_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, stream_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sort_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, sort_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest other = (com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest) obj;

    if (getPageNum()
        != other.getPageNum()) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
    if (!getVhost()
        .equals(other.getVhost())) return false;
    if (!getApp()
        .equals(other.getApp())) return false;
    if (!getStream()
        .equals(other.getStream())) return false;
    if (!getSort()
        .equals(other.getSort())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PAGENUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageNum());
    hash = (37 * hash) + PAGESIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageSize());
    hash = (37 * hash) + VHOST_FIELD_NUMBER;
    hash = (53 * hash) + getVhost().hashCode();
    hash = (37 * hash) + APP_FIELD_NUMBER;
    hash = (53 * hash) + getApp().hashCode();
    hash = (37 * hash) + STREAM_FIELD_NUMBER;
    hash = (53 * hash) + getStream().hashCode();
    hash = (37 * hash) + SORT_FIELD_NUMBER;
    hash = (53 * hash) + getSort().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Volcengine.Live.Models.Request.DescribeForbiddenStreamInfoByPageRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Live.Models.Request.DescribeForbiddenStreamInfoByPageRequest)
      com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.live.model.request.LiveRequest.internal_static_Volcengine_Live_Models_Request_DescribeForbiddenStreamInfoByPageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.live.model.request.LiveRequest.internal_static_Volcengine_Live_Models_Request_DescribeForbiddenStreamInfoByPageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest.class, com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest.Builder.class);
    }

    // Construct using com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      pageNum_ = 0L;

      pageSize_ = 0L;

      vhost_ = "";

      app_ = "";

      stream_ = "";

      sort_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.live.model.request.LiveRequest.internal_static_Volcengine_Live_Models_Request_DescribeForbiddenStreamInfoByPageRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest getDefaultInstanceForType() {
      return com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest build() {
      com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest buildPartial() {
      com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest result = new com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest(this);
      result.pageNum_ = pageNum_;
      result.pageSize_ = pageSize_;
      result.vhost_ = vhost_;
      result.app_ = app_;
      result.stream_ = stream_;
      result.sort_ = sort_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest) {
        return mergeFrom((com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest other) {
      if (other == com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest.getDefaultInstance()) return this;
      if (other.getPageNum() != 0L) {
        setPageNum(other.getPageNum());
      }
      if (other.getPageSize() != 0L) {
        setPageSize(other.getPageSize());
      }
      if (!other.getVhost().isEmpty()) {
        vhost_ = other.vhost_;
        onChanged();
      }
      if (!other.getApp().isEmpty()) {
        app_ = other.app_;
        onChanged();
      }
      if (!other.getStream().isEmpty()) {
        stream_ = other.stream_;
        onChanged();
      }
      if (!other.getSort().isEmpty()) {
        sort_ = other.sort_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long pageNum_ ;
    /**
     * <pre>
     *当前页码，取值范围 ≥1。
     * </pre>
     *
     * <code>int64 PageNum = 1;</code>
     * @return The pageNum.
     */
    @java.lang.Override
    public long getPageNum() {
      return pageNum_;
    }
    /**
     * <pre>
     *当前页码，取值范围 ≥1。
     * </pre>
     *
     * <code>int64 PageNum = 1;</code>
     * @param value The pageNum to set.
     * @return This builder for chaining.
     */
    public Builder setPageNum(long value) {
      
      pageNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *当前页码，取值范围 ≥1。
     * </pre>
     *
     * <code>int64 PageNum = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageNum() {
      
      pageNum_ = 0L;
      onChanged();
      return this;
    }

    private long pageSize_ ;
    /**
     * <pre>
     *分页大小，取值范围为 。
     * </pre>
     *
     * <code>int64 PageSize = 2;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public long getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     *分页大小，取值范围为 。
     * </pre>
     *
     * <code>int64 PageSize = 2;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(long value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *分页大小，取值范围为 。
     * </pre>
     *
     * <code>int64 PageSize = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object vhost_ = "";
    /**
     * <pre>
     *域名空间名称。
     *参数 `Domain` 和 `Vhost`传且仅传一个。
     * </pre>
     *
     * <code>string Vhost = 3;</code>
     * @return The vhost.
     */
    public java.lang.String getVhost() {
      java.lang.Object ref = vhost_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vhost_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *域名空间名称。
     *参数 `Domain` 和 `Vhost`传且仅传一个。
     * </pre>
     *
     * <code>string Vhost = 3;</code>
     * @return The bytes for vhost.
     */
    public com.google.protobuf.ByteString
        getVhostBytes() {
      java.lang.Object ref = vhost_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vhost_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *域名空间名称。
     *参数 `Domain` 和 `Vhost`传且仅传一个。
     * </pre>
     *
     * <code>string Vhost = 3;</code>
     * @param value The vhost to set.
     * @return This builder for chaining.
     */
    public Builder setVhost(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vhost_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *域名空间名称。
     *参数 `Domain` 和 `Vhost`传且仅传一个。
     * </pre>
     *
     * <code>string Vhost = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVhost() {
      
      vhost_ = getDefaultInstance().getVhost();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *域名空间名称。
     *参数 `Domain` 和 `Vhost`传且仅传一个。
     * </pre>
     *
     * <code>string Vhost = 3;</code>
     * @param value The bytes for vhost to set.
     * @return This builder for chaining.
     */
    public Builder setVhostBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vhost_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object app_ = "";
    /**
     * <pre>
     * 应用名称，默认查询所有应用名称，由 1 到 30
     * 位数字、字母、下划线及"-"和"."组成。
     * </pre>
     *
     * <code>string App = 4;</code>
     * @return The app.
     */
    public java.lang.String getApp() {
      java.lang.Object ref = app_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        app_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 应用名称，默认查询所有应用名称，由 1 到 30
     * 位数字、字母、下划线及"-"和"."组成。
     * </pre>
     *
     * <code>string App = 4;</code>
     * @return The bytes for app.
     */
    public com.google.protobuf.ByteString
        getAppBytes() {
      java.lang.Object ref = app_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        app_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 应用名称，默认查询所有应用名称，由 1 到 30
     * 位数字、字母、下划线及"-"和"."组成。
     * </pre>
     *
     * <code>string App = 4;</code>
     * @param value The app to set.
     * @return This builder for chaining.
     */
    public Builder setApp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      app_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 应用名称，默认查询所有应用名称，由 1 到 30
     * 位数字、字母、下划线及"-"和"."组成。
     * </pre>
     *
     * <code>string App = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearApp() {
      
      app_ = getDefaultInstance().getApp();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 应用名称，默认查询所有应用名称，由 1 到 30
     * 位数字、字母、下划线及"-"和"."组成。
     * </pre>
     *
     * <code>string App = 4;</code>
     * @param value The bytes for app to set.
     * @return This builder for chaining.
     */
    public Builder setAppBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      app_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object stream_ = "";
    /**
     * <pre>
     * 流名称，缺省情况下，查询所有流名称，由 1 到 100
     * 位数字、字母、下划线及"-"和"."组成，如果指定 Stream，必须同时指定 App 的值
     * </pre>
     *
     * <code>string Stream = 5;</code>
     * @return The stream.
     */
    public java.lang.String getStream() {
      java.lang.Object ref = stream_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stream_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 流名称，缺省情况下，查询所有流名称，由 1 到 100
     * 位数字、字母、下划线及"-"和"."组成，如果指定 Stream，必须同时指定 App 的值
     * </pre>
     *
     * <code>string Stream = 5;</code>
     * @return The bytes for stream.
     */
    public com.google.protobuf.ByteString
        getStreamBytes() {
      java.lang.Object ref = stream_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stream_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 流名称，缺省情况下，查询所有流名称，由 1 到 100
     * 位数字、字母、下划线及"-"和"."组成，如果指定 Stream，必须同时指定 App 的值
     * </pre>
     *
     * <code>string Stream = 5;</code>
     * @param value The stream to set.
     * @return This builder for chaining.
     */
    public Builder setStream(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stream_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 流名称，缺省情况下，查询所有流名称，由 1 到 100
     * 位数字、字母、下划线及"-"和"."组成，如果指定 Stream，必须同时指定 App 的值
     * </pre>
     *
     * <code>string Stream = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearStream() {
      
      stream_ = getDefaultInstance().getStream();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 流名称，缺省情况下，查询所有流名称，由 1 到 100
     * 位数字、字母、下划线及"-"和"."组成，如果指定 Stream，必须同时指定 App 的值
     * </pre>
     *
     * <code>string Stream = 5;</code>
     * @param value The bytes for stream to set.
     * @return This builder for chaining.
     */
    public Builder setStreamBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stream_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sort_ = "";
    /**
     * <pre>
     * 排列方式，根据结束时间排序。支持两种形式。缺省情况下为 desc。
     *&lt;li&gt;asc：按从小到大升序排列；
     *&lt;li&gt;desc：按从大到小降序排列。
     * </pre>
     *
     * <code>string Sort = 6;</code>
     * @return The sort.
     */
    public java.lang.String getSort() {
      java.lang.Object ref = sort_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sort_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 排列方式，根据结束时间排序。支持两种形式。缺省情况下为 desc。
     *&lt;li&gt;asc：按从小到大升序排列；
     *&lt;li&gt;desc：按从大到小降序排列。
     * </pre>
     *
     * <code>string Sort = 6;</code>
     * @return The bytes for sort.
     */
    public com.google.protobuf.ByteString
        getSortBytes() {
      java.lang.Object ref = sort_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sort_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 排列方式，根据结束时间排序。支持两种形式。缺省情况下为 desc。
     *&lt;li&gt;asc：按从小到大升序排列；
     *&lt;li&gt;desc：按从大到小降序排列。
     * </pre>
     *
     * <code>string Sort = 6;</code>
     * @param value The sort to set.
     * @return This builder for chaining.
     */
    public Builder setSort(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sort_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 排列方式，根据结束时间排序。支持两种形式。缺省情况下为 desc。
     *&lt;li&gt;asc：按从小到大升序排列；
     *&lt;li&gt;desc：按从大到小降序排列。
     * </pre>
     *
     * <code>string Sort = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSort() {
      
      sort_ = getDefaultInstance().getSort();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 排列方式，根据结束时间排序。支持两种形式。缺省情况下为 desc。
     *&lt;li&gt;asc：按从小到大升序排列；
     *&lt;li&gt;desc：按从大到小降序排列。
     * </pre>
     *
     * <code>string Sort = 6;</code>
     * @param value The bytes for sort to set.
     * @return This builder for chaining.
     */
    public Builder setSortBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sort_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Volcengine.Live.Models.Request.DescribeForbiddenStreamInfoByPageRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Live.Models.Request.DescribeForbiddenStreamInfoByPageRequest)
  private static final com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest();
  }

  public static com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DescribeForbiddenStreamInfoByPageRequest>
      PARSER = new com.google.protobuf.AbstractParser<DescribeForbiddenStreamInfoByPageRequest>() {
    @java.lang.Override
    public DescribeForbiddenStreamInfoByPageRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DescribeForbiddenStreamInfoByPageRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DescribeForbiddenStreamInfoByPageRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DescribeForbiddenStreamInfoByPageRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

