// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/request/request_live.proto

package com.volcengine.service.live.model.request;

/**
 * Protobuf type {@code Volcengine.Live.Models.Request.DeleteDenyConfigRequest}
 */
public final class DeleteDenyConfigRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Live.Models.Request.DeleteDenyConfigRequest)
    DeleteDenyConfigRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteDenyConfigRequest.newBuilder() to construct.
  private DeleteDenyConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteDenyConfigRequest() {
    vhost_ = "";
    domain_ = "";
    app_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteDenyConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteDenyConfigRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            vhost_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            domain_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            app_ = s;
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
    return com.volcengine.service.live.model.request.LiveRequest.internal_static_Volcengine_Live_Models_Request_DeleteDenyConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.live.model.request.LiveRequest.internal_static_Volcengine_Live_Models_Request_DeleteDenyConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.live.model.request.DeleteDenyConfigRequest.class, com.volcengine.service.live.model.request.DeleteDenyConfigRequest.Builder.class);
  }

  public static final int VHOST_FIELD_NUMBER = 1;
  private volatile java.lang.Object vhost_;
  /**
   * <pre>
   *域名空间名称
   * </pre>
   *
   * <code>string Vhost = 1;</code>
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
   *域名空间名称
   * </pre>
   *
   * <code>string Vhost = 1;</code>
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

  public static final int DOMAIN_FIELD_NUMBER = 2;
  private volatile java.lang.Object domain_;
  /**
   * <pre>
   *推拉流域名，domain和app二选一填
   * </pre>
   *
   * <code>string Domain = 2;</code>
   * @return The domain.
   */
  @java.lang.Override
  public java.lang.String getDomain() {
    java.lang.Object ref = domain_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      domain_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *推拉流域名，domain和app二选一填
   * </pre>
   *
   * <code>string Domain = 2;</code>
   * @return The bytes for domain.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDomainBytes() {
    java.lang.Object ref = domain_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      domain_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APP_FIELD_NUMBER = 3;
  private volatile java.lang.Object app_;
  /**
   * <pre>
   * App的名称，由 1 到 30
   * 位数字、字母、下划线及"-"和"."组成。domain和app二选一填。
   * </pre>
   *
   * <code>string App = 3;</code>
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
   * App的名称，由 1 到 30
   * 位数字、字母、下划线及"-"和"."组成。domain和app二选一填。
   * </pre>
   *
   * <code>string App = 3;</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vhost_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vhost_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domain_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, domain_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(app_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, app_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vhost_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vhost_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domain_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, domain_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(app_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, app_);
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
    if (!(obj instanceof com.volcengine.service.live.model.request.DeleteDenyConfigRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.live.model.request.DeleteDenyConfigRequest other = (com.volcengine.service.live.model.request.DeleteDenyConfigRequest) obj;

    if (!getVhost()
        .equals(other.getVhost())) return false;
    if (!getDomain()
        .equals(other.getDomain())) return false;
    if (!getApp()
        .equals(other.getApp())) return false;
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
    hash = (37 * hash) + VHOST_FIELD_NUMBER;
    hash = (53 * hash) + getVhost().hashCode();
    hash = (37 * hash) + DOMAIN_FIELD_NUMBER;
    hash = (53 * hash) + getDomain().hashCode();
    hash = (37 * hash) + APP_FIELD_NUMBER;
    hash = (53 * hash) + getApp().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.live.model.request.DeleteDenyConfigRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.live.model.request.DeleteDenyConfigRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.live.model.request.DeleteDenyConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.live.model.request.DeleteDenyConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.live.model.request.DeleteDenyConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.live.model.request.DeleteDenyConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.live.model.request.DeleteDenyConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.live.model.request.DeleteDenyConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.live.model.request.DeleteDenyConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.live.model.request.DeleteDenyConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.live.model.request.DeleteDenyConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.live.model.request.DeleteDenyConfigRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.live.model.request.DeleteDenyConfigRequest prototype) {
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
   * Protobuf type {@code Volcengine.Live.Models.Request.DeleteDenyConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Live.Models.Request.DeleteDenyConfigRequest)
      com.volcengine.service.live.model.request.DeleteDenyConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.live.model.request.LiveRequest.internal_static_Volcengine_Live_Models_Request_DeleteDenyConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.live.model.request.LiveRequest.internal_static_Volcengine_Live_Models_Request_DeleteDenyConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.live.model.request.DeleteDenyConfigRequest.class, com.volcengine.service.live.model.request.DeleteDenyConfigRequest.Builder.class);
    }

    // Construct using com.volcengine.service.live.model.request.DeleteDenyConfigRequest.newBuilder()
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
      vhost_ = "";

      domain_ = "";

      app_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.live.model.request.LiveRequest.internal_static_Volcengine_Live_Models_Request_DeleteDenyConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.live.model.request.DeleteDenyConfigRequest getDefaultInstanceForType() {
      return com.volcengine.service.live.model.request.DeleteDenyConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.live.model.request.DeleteDenyConfigRequest build() {
      com.volcengine.service.live.model.request.DeleteDenyConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.live.model.request.DeleteDenyConfigRequest buildPartial() {
      com.volcengine.service.live.model.request.DeleteDenyConfigRequest result = new com.volcengine.service.live.model.request.DeleteDenyConfigRequest(this);
      result.vhost_ = vhost_;
      result.domain_ = domain_;
      result.app_ = app_;
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
      if (other instanceof com.volcengine.service.live.model.request.DeleteDenyConfigRequest) {
        return mergeFrom((com.volcengine.service.live.model.request.DeleteDenyConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.live.model.request.DeleteDenyConfigRequest other) {
      if (other == com.volcengine.service.live.model.request.DeleteDenyConfigRequest.getDefaultInstance()) return this;
      if (!other.getVhost().isEmpty()) {
        vhost_ = other.vhost_;
        onChanged();
      }
      if (!other.getDomain().isEmpty()) {
        domain_ = other.domain_;
        onChanged();
      }
      if (!other.getApp().isEmpty()) {
        app_ = other.app_;
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
      com.volcengine.service.live.model.request.DeleteDenyConfigRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.live.model.request.DeleteDenyConfigRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object vhost_ = "";
    /**
     * <pre>
     *域名空间名称
     * </pre>
     *
     * <code>string Vhost = 1;</code>
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
     *域名空间名称
     * </pre>
     *
     * <code>string Vhost = 1;</code>
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
     *域名空间名称
     * </pre>
     *
     * <code>string Vhost = 1;</code>
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
     *域名空间名称
     * </pre>
     *
     * <code>string Vhost = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVhost() {
      
      vhost_ = getDefaultInstance().getVhost();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *域名空间名称
     * </pre>
     *
     * <code>string Vhost = 1;</code>
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

    private java.lang.Object domain_ = "";
    /**
     * <pre>
     *推拉流域名，domain和app二选一填
     * </pre>
     *
     * <code>string Domain = 2;</code>
     * @return The domain.
     */
    public java.lang.String getDomain() {
      java.lang.Object ref = domain_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        domain_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *推拉流域名，domain和app二选一填
     * </pre>
     *
     * <code>string Domain = 2;</code>
     * @return The bytes for domain.
     */
    public com.google.protobuf.ByteString
        getDomainBytes() {
      java.lang.Object ref = domain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        domain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *推拉流域名，domain和app二选一填
     * </pre>
     *
     * <code>string Domain = 2;</code>
     * @param value The domain to set.
     * @return This builder for chaining.
     */
    public Builder setDomain(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      domain_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *推拉流域名，domain和app二选一填
     * </pre>
     *
     * <code>string Domain = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDomain() {
      
      domain_ = getDefaultInstance().getDomain();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *推拉流域名，domain和app二选一填
     * </pre>
     *
     * <code>string Domain = 2;</code>
     * @param value The bytes for domain to set.
     * @return This builder for chaining.
     */
    public Builder setDomainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      domain_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object app_ = "";
    /**
     * <pre>
     * App的名称，由 1 到 30
     * 位数字、字母、下划线及"-"和"."组成。domain和app二选一填。
     * </pre>
     *
     * <code>string App = 3;</code>
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
     * App的名称，由 1 到 30
     * 位数字、字母、下划线及"-"和"."组成。domain和app二选一填。
     * </pre>
     *
     * <code>string App = 3;</code>
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
     * App的名称，由 1 到 30
     * 位数字、字母、下划线及"-"和"."组成。domain和app二选一填。
     * </pre>
     *
     * <code>string App = 3;</code>
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
     * App的名称，由 1 到 30
     * 位数字、字母、下划线及"-"和"."组成。domain和app二选一填。
     * </pre>
     *
     * <code>string App = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearApp() {
      
      app_ = getDefaultInstance().getApp();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * App的名称，由 1 到 30
     * 位数字、字母、下划线及"-"和"."组成。domain和app二选一填。
     * </pre>
     *
     * <code>string App = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Live.Models.Request.DeleteDenyConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Live.Models.Request.DeleteDenyConfigRequest)
  private static final com.volcengine.service.live.model.request.DeleteDenyConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.live.model.request.DeleteDenyConfigRequest();
  }

  public static com.volcengine.service.live.model.request.DeleteDenyConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteDenyConfigRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteDenyConfigRequest>() {
    @java.lang.Override
    public DeleteDenyConfigRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteDenyConfigRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteDenyConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteDenyConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.live.model.request.DeleteDenyConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

