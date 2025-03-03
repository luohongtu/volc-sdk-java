// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Request.VodUrlUploadJsonRequest}
 */
public final class VodUrlUploadJsonRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.VodUrlUploadJsonRequest)
    VodUrlUploadJsonRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodUrlUploadJsonRequest.newBuilder() to construct.
  private VodUrlUploadJsonRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodUrlUploadJsonRequest() {
    spaceName_ = "";
    uRLSets_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodUrlUploadJsonRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodUrlUploadJsonRequest(
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

            spaceName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            uRLSets_ = s;
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
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodUrlUploadJsonRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodUrlUploadJsonRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest.class, com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest.Builder.class);
  }

  public static final int SPACENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object spaceName_;
  /**
   * <pre>
   * 上传的空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  @java.lang.Override
  public java.lang.String getSpaceName() {
    java.lang.Object ref = spaceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      spaceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 上传的空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSpaceNameBytes() {
    java.lang.Object ref = spaceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      spaceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URLSETS_FIELD_NUMBER = 2;
  private volatile java.lang.Object uRLSets_;
  /**
   * <pre>
   * 上传URL设置参数集合，每个URL入参的设置均在此设置 
   * </pre>
   *
   * <code>string URLSets = 2;</code>
   * @return The uRLSets.
   */
  @java.lang.Override
  public java.lang.String getURLSets() {
    java.lang.Object ref = uRLSets_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uRLSets_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 上传URL设置参数集合，每个URL入参的设置均在此设置 
   * </pre>
   *
   * <code>string URLSets = 2;</code>
   * @return The bytes for uRLSets.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getURLSetsBytes() {
    java.lang.Object ref = uRLSets_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uRLSets_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(spaceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, spaceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uRLSets_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uRLSets_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(spaceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, spaceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uRLSets_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uRLSets_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest other = (com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest) obj;

    if (!getSpaceName()
        .equals(other.getSpaceName())) return false;
    if (!getURLSets()
        .equals(other.getURLSets())) return false;
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
    hash = (37 * hash) + SPACENAME_FIELD_NUMBER;
    hash = (53 * hash) + getSpaceName().hashCode();
    hash = (37 * hash) + URLSETS_FIELD_NUMBER;
    hash = (53 * hash) + getURLSets().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Request.VodUrlUploadJsonRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.VodUrlUploadJsonRequest)
      com.volcengine.service.vod.model.request.VodUrlUploadJsonRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodUrlUploadJsonRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodUrlUploadJsonRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest.class, com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest.newBuilder()
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
      spaceName_ = "";

      uRLSets_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodUrlUploadJsonRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest build() {
      com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest buildPartial() {
      com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest result = new com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest(this);
      result.spaceName_ = spaceName_;
      result.uRLSets_ = uRLSets_;
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
      if (other instanceof com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest) {
        return mergeFrom((com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest other) {
      if (other == com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest.getDefaultInstance()) return this;
      if (!other.getSpaceName().isEmpty()) {
        spaceName_ = other.spaceName_;
        onChanged();
      }
      if (!other.getURLSets().isEmpty()) {
        uRLSets_ = other.uRLSets_;
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
      com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object spaceName_ = "";
    /**
     * <pre>
     * 上传的空间名 
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
     * @return The spaceName.
     */
    public java.lang.String getSpaceName() {
      java.lang.Object ref = spaceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spaceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 上传的空间名 
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
     * @return The bytes for spaceName.
     */
    public com.google.protobuf.ByteString
        getSpaceNameBytes() {
      java.lang.Object ref = spaceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spaceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 上传的空间名 
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
     * @param value The spaceName to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      spaceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 上传的空间名 
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpaceName() {
      
      spaceName_ = getDefaultInstance().getSpaceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 上传的空间名 
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
     * @param value The bytes for spaceName to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      spaceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object uRLSets_ = "";
    /**
     * <pre>
     * 上传URL设置参数集合，每个URL入参的设置均在此设置 
     * </pre>
     *
     * <code>string URLSets = 2;</code>
     * @return The uRLSets.
     */
    public java.lang.String getURLSets() {
      java.lang.Object ref = uRLSets_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uRLSets_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 上传URL设置参数集合，每个URL入参的设置均在此设置 
     * </pre>
     *
     * <code>string URLSets = 2;</code>
     * @return The bytes for uRLSets.
     */
    public com.google.protobuf.ByteString
        getURLSetsBytes() {
      java.lang.Object ref = uRLSets_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uRLSets_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 上传URL设置参数集合，每个URL入参的设置均在此设置 
     * </pre>
     *
     * <code>string URLSets = 2;</code>
     * @param value The uRLSets to set.
     * @return This builder for chaining.
     */
    public Builder setURLSets(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uRLSets_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 上传URL设置参数集合，每个URL入参的设置均在此设置 
     * </pre>
     *
     * <code>string URLSets = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearURLSets() {
      
      uRLSets_ = getDefaultInstance().getURLSets();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 上传URL设置参数集合，每个URL入参的设置均在此设置 
     * </pre>
     *
     * <code>string URLSets = 2;</code>
     * @param value The bytes for uRLSets to set.
     * @return This builder for chaining.
     */
    public Builder setURLSetsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uRLSets_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.VodUrlUploadJsonRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.VodUrlUploadJsonRequest)
  private static final com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest();
  }

  public static com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodUrlUploadJsonRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodUrlUploadJsonRequest>() {
    @java.lang.Override
    public VodUrlUploadJsonRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodUrlUploadJsonRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodUrlUploadJsonRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodUrlUploadJsonRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.request.VodUrlUploadJsonRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

