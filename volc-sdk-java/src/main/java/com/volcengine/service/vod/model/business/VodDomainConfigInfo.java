// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodDomainConfigInfo}
 */
public final class VodDomainConfigInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodDomainConfigInfo)
    VodDomainConfigInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodDomainConfigInfo.newBuilder() to construct.
  private VodDomainConfigInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodDomainConfigInfo() {
    spaceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodDomainConfigInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodDomainConfigInfo(
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
            com.volcengine.service.vod.model.business.VodDomainInstanceInfos.Builder subBuilder = null;
            if (playInstanceInfo_ != null) {
              subBuilder = playInstanceInfo_.toBuilder();
            }
            playInstanceInfo_ = input.readMessage(com.volcengine.service.vod.model.business.VodDomainInstanceInfos.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(playInstanceInfo_);
              playInstanceInfo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.volcengine.service.vod.model.business.VodDomainInstanceInfos.Builder subBuilder = null;
            if (imageInstanceInfo_ != null) {
              subBuilder = imageInstanceInfo_.toBuilder();
            }
            imageInstanceInfo_ = input.readMessage(com.volcengine.service.vod.model.business.VodDomainInstanceInfos.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(imageInstanceInfo_);
              imageInstanceInfo_ = subBuilder.buildPartial();
            }

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
    return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodDomainConfigInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodDomainConfigInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodDomainConfigInfo.class, com.volcengine.service.vod.model.business.VodDomainConfigInfo.Builder.class);
  }

  public static final int SPACENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object spaceName_;
  /**
   * <pre>
   * 空间名称
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
   * 空间名称
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

  public static final int PLAYINSTANCEINFO_FIELD_NUMBER = 2;
  private com.volcengine.service.vod.model.business.VodDomainInstanceInfos playInstanceInfo_;
  /**
   * <pre>
   * 播放分发加速配置
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos PlayInstanceInfo = 2;</code>
   * @return Whether the playInstanceInfo field is set.
   */
  @java.lang.Override
  public boolean hasPlayInstanceInfo() {
    return playInstanceInfo_ != null;
  }
  /**
   * <pre>
   * 播放分发加速配置
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos PlayInstanceInfo = 2;</code>
   * @return The playInstanceInfo.
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodDomainInstanceInfos getPlayInstanceInfo() {
    return playInstanceInfo_ == null ? com.volcengine.service.vod.model.business.VodDomainInstanceInfos.getDefaultInstance() : playInstanceInfo_;
  }
  /**
   * <pre>
   * 播放分发加速配置
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos PlayInstanceInfo = 2;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodDomainInstanceInfosOrBuilder getPlayInstanceInfoOrBuilder() {
    return getPlayInstanceInfo();
  }

  public static final int IMAGEINSTANCEINFO_FIELD_NUMBER = 3;
  private com.volcengine.service.vod.model.business.VodDomainInstanceInfos imageInstanceInfo_;
  /**
   * <pre>
   * 图片分发加速配置
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos ImageInstanceInfo = 3;</code>
   * @return Whether the imageInstanceInfo field is set.
   */
  @java.lang.Override
  public boolean hasImageInstanceInfo() {
    return imageInstanceInfo_ != null;
  }
  /**
   * <pre>
   * 图片分发加速配置
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos ImageInstanceInfo = 3;</code>
   * @return The imageInstanceInfo.
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodDomainInstanceInfos getImageInstanceInfo() {
    return imageInstanceInfo_ == null ? com.volcengine.service.vod.model.business.VodDomainInstanceInfos.getDefaultInstance() : imageInstanceInfo_;
  }
  /**
   * <pre>
   * 图片分发加速配置
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos ImageInstanceInfo = 3;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodDomainInstanceInfosOrBuilder getImageInstanceInfoOrBuilder() {
    return getImageInstanceInfo();
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
    if (playInstanceInfo_ != null) {
      output.writeMessage(2, getPlayInstanceInfo());
    }
    if (imageInstanceInfo_ != null) {
      output.writeMessage(3, getImageInstanceInfo());
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
    if (playInstanceInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPlayInstanceInfo());
    }
    if (imageInstanceInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getImageInstanceInfo());
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodDomainConfigInfo)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodDomainConfigInfo other = (com.volcengine.service.vod.model.business.VodDomainConfigInfo) obj;

    if (!getSpaceName()
        .equals(other.getSpaceName())) return false;
    if (hasPlayInstanceInfo() != other.hasPlayInstanceInfo()) return false;
    if (hasPlayInstanceInfo()) {
      if (!getPlayInstanceInfo()
          .equals(other.getPlayInstanceInfo())) return false;
    }
    if (hasImageInstanceInfo() != other.hasImageInstanceInfo()) return false;
    if (hasImageInstanceInfo()) {
      if (!getImageInstanceInfo()
          .equals(other.getImageInstanceInfo())) return false;
    }
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
    if (hasPlayInstanceInfo()) {
      hash = (37 * hash) + PLAYINSTANCEINFO_FIELD_NUMBER;
      hash = (53 * hash) + getPlayInstanceInfo().hashCode();
    }
    if (hasImageInstanceInfo()) {
      hash = (37 * hash) + IMAGEINSTANCEINFO_FIELD_NUMBER;
      hash = (53 * hash) + getImageInstanceInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodDomainConfigInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodDomainConfigInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodDomainConfigInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodDomainConfigInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodDomainConfigInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodDomainConfigInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodDomainConfigInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodDomainConfigInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodDomainConfigInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodDomainConfigInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodDomainConfigInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodDomainConfigInfo parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodDomainConfigInfo prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodDomainConfigInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodDomainConfigInfo)
      com.volcengine.service.vod.model.business.VodDomainConfigInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodDomainConfigInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodDomainConfigInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodDomainConfigInfo.class, com.volcengine.service.vod.model.business.VodDomainConfigInfo.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodDomainConfigInfo.newBuilder()
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

      if (playInstanceInfoBuilder_ == null) {
        playInstanceInfo_ = null;
      } else {
        playInstanceInfo_ = null;
        playInstanceInfoBuilder_ = null;
      }
      if (imageInstanceInfoBuilder_ == null) {
        imageInstanceInfo_ = null;
      } else {
        imageInstanceInfo_ = null;
        imageInstanceInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodDomainConfigInfo_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodDomainConfigInfo getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodDomainConfigInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodDomainConfigInfo build() {
      com.volcengine.service.vod.model.business.VodDomainConfigInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodDomainConfigInfo buildPartial() {
      com.volcengine.service.vod.model.business.VodDomainConfigInfo result = new com.volcengine.service.vod.model.business.VodDomainConfigInfo(this);
      result.spaceName_ = spaceName_;
      if (playInstanceInfoBuilder_ == null) {
        result.playInstanceInfo_ = playInstanceInfo_;
      } else {
        result.playInstanceInfo_ = playInstanceInfoBuilder_.build();
      }
      if (imageInstanceInfoBuilder_ == null) {
        result.imageInstanceInfo_ = imageInstanceInfo_;
      } else {
        result.imageInstanceInfo_ = imageInstanceInfoBuilder_.build();
      }
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
      if (other instanceof com.volcengine.service.vod.model.business.VodDomainConfigInfo) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodDomainConfigInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodDomainConfigInfo other) {
      if (other == com.volcengine.service.vod.model.business.VodDomainConfigInfo.getDefaultInstance()) return this;
      if (!other.getSpaceName().isEmpty()) {
        spaceName_ = other.spaceName_;
        onChanged();
      }
      if (other.hasPlayInstanceInfo()) {
        mergePlayInstanceInfo(other.getPlayInstanceInfo());
      }
      if (other.hasImageInstanceInfo()) {
        mergeImageInstanceInfo(other.getImageInstanceInfo());
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
      com.volcengine.service.vod.model.business.VodDomainConfigInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodDomainConfigInfo) e.getUnfinishedMessage();
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
     * 空间名称
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
     * 空间名称
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
     * 空间名称
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
     * 空间名称
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
     * 空间名称
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

    private com.volcengine.service.vod.model.business.VodDomainInstanceInfos playInstanceInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodDomainInstanceInfos, com.volcengine.service.vod.model.business.VodDomainInstanceInfos.Builder, com.volcengine.service.vod.model.business.VodDomainInstanceInfosOrBuilder> playInstanceInfoBuilder_;
    /**
     * <pre>
     * 播放分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos PlayInstanceInfo = 2;</code>
     * @return Whether the playInstanceInfo field is set.
     */
    public boolean hasPlayInstanceInfo() {
      return playInstanceInfoBuilder_ != null || playInstanceInfo_ != null;
    }
    /**
     * <pre>
     * 播放分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos PlayInstanceInfo = 2;</code>
     * @return The playInstanceInfo.
     */
    public com.volcengine.service.vod.model.business.VodDomainInstanceInfos getPlayInstanceInfo() {
      if (playInstanceInfoBuilder_ == null) {
        return playInstanceInfo_ == null ? com.volcengine.service.vod.model.business.VodDomainInstanceInfos.getDefaultInstance() : playInstanceInfo_;
      } else {
        return playInstanceInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 播放分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos PlayInstanceInfo = 2;</code>
     */
    public Builder setPlayInstanceInfo(com.volcengine.service.vod.model.business.VodDomainInstanceInfos value) {
      if (playInstanceInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        playInstanceInfo_ = value;
        onChanged();
      } else {
        playInstanceInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 播放分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos PlayInstanceInfo = 2;</code>
     */
    public Builder setPlayInstanceInfo(
        com.volcengine.service.vod.model.business.VodDomainInstanceInfos.Builder builderForValue) {
      if (playInstanceInfoBuilder_ == null) {
        playInstanceInfo_ = builderForValue.build();
        onChanged();
      } else {
        playInstanceInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 播放分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos PlayInstanceInfo = 2;</code>
     */
    public Builder mergePlayInstanceInfo(com.volcengine.service.vod.model.business.VodDomainInstanceInfos value) {
      if (playInstanceInfoBuilder_ == null) {
        if (playInstanceInfo_ != null) {
          playInstanceInfo_ =
            com.volcengine.service.vod.model.business.VodDomainInstanceInfos.newBuilder(playInstanceInfo_).mergeFrom(value).buildPartial();
        } else {
          playInstanceInfo_ = value;
        }
        onChanged();
      } else {
        playInstanceInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 播放分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos PlayInstanceInfo = 2;</code>
     */
    public Builder clearPlayInstanceInfo() {
      if (playInstanceInfoBuilder_ == null) {
        playInstanceInfo_ = null;
        onChanged();
      } else {
        playInstanceInfo_ = null;
        playInstanceInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 播放分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos PlayInstanceInfo = 2;</code>
     */
    public com.volcengine.service.vod.model.business.VodDomainInstanceInfos.Builder getPlayInstanceInfoBuilder() {
      
      onChanged();
      return getPlayInstanceInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 播放分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos PlayInstanceInfo = 2;</code>
     */
    public com.volcengine.service.vod.model.business.VodDomainInstanceInfosOrBuilder getPlayInstanceInfoOrBuilder() {
      if (playInstanceInfoBuilder_ != null) {
        return playInstanceInfoBuilder_.getMessageOrBuilder();
      } else {
        return playInstanceInfo_ == null ?
            com.volcengine.service.vod.model.business.VodDomainInstanceInfos.getDefaultInstance() : playInstanceInfo_;
      }
    }
    /**
     * <pre>
     * 播放分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos PlayInstanceInfo = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodDomainInstanceInfos, com.volcengine.service.vod.model.business.VodDomainInstanceInfos.Builder, com.volcengine.service.vod.model.business.VodDomainInstanceInfosOrBuilder> 
        getPlayInstanceInfoFieldBuilder() {
      if (playInstanceInfoBuilder_ == null) {
        playInstanceInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.vod.model.business.VodDomainInstanceInfos, com.volcengine.service.vod.model.business.VodDomainInstanceInfos.Builder, com.volcengine.service.vod.model.business.VodDomainInstanceInfosOrBuilder>(
                getPlayInstanceInfo(),
                getParentForChildren(),
                isClean());
        playInstanceInfo_ = null;
      }
      return playInstanceInfoBuilder_;
    }

    private com.volcengine.service.vod.model.business.VodDomainInstanceInfos imageInstanceInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodDomainInstanceInfos, com.volcengine.service.vod.model.business.VodDomainInstanceInfos.Builder, com.volcengine.service.vod.model.business.VodDomainInstanceInfosOrBuilder> imageInstanceInfoBuilder_;
    /**
     * <pre>
     * 图片分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos ImageInstanceInfo = 3;</code>
     * @return Whether the imageInstanceInfo field is set.
     */
    public boolean hasImageInstanceInfo() {
      return imageInstanceInfoBuilder_ != null || imageInstanceInfo_ != null;
    }
    /**
     * <pre>
     * 图片分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos ImageInstanceInfo = 3;</code>
     * @return The imageInstanceInfo.
     */
    public com.volcengine.service.vod.model.business.VodDomainInstanceInfos getImageInstanceInfo() {
      if (imageInstanceInfoBuilder_ == null) {
        return imageInstanceInfo_ == null ? com.volcengine.service.vod.model.business.VodDomainInstanceInfos.getDefaultInstance() : imageInstanceInfo_;
      } else {
        return imageInstanceInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 图片分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos ImageInstanceInfo = 3;</code>
     */
    public Builder setImageInstanceInfo(com.volcengine.service.vod.model.business.VodDomainInstanceInfos value) {
      if (imageInstanceInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        imageInstanceInfo_ = value;
        onChanged();
      } else {
        imageInstanceInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 图片分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos ImageInstanceInfo = 3;</code>
     */
    public Builder setImageInstanceInfo(
        com.volcengine.service.vod.model.business.VodDomainInstanceInfos.Builder builderForValue) {
      if (imageInstanceInfoBuilder_ == null) {
        imageInstanceInfo_ = builderForValue.build();
        onChanged();
      } else {
        imageInstanceInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 图片分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos ImageInstanceInfo = 3;</code>
     */
    public Builder mergeImageInstanceInfo(com.volcengine.service.vod.model.business.VodDomainInstanceInfos value) {
      if (imageInstanceInfoBuilder_ == null) {
        if (imageInstanceInfo_ != null) {
          imageInstanceInfo_ =
            com.volcengine.service.vod.model.business.VodDomainInstanceInfos.newBuilder(imageInstanceInfo_).mergeFrom(value).buildPartial();
        } else {
          imageInstanceInfo_ = value;
        }
        onChanged();
      } else {
        imageInstanceInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 图片分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos ImageInstanceInfo = 3;</code>
     */
    public Builder clearImageInstanceInfo() {
      if (imageInstanceInfoBuilder_ == null) {
        imageInstanceInfo_ = null;
        onChanged();
      } else {
        imageInstanceInfo_ = null;
        imageInstanceInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 图片分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos ImageInstanceInfo = 3;</code>
     */
    public com.volcengine.service.vod.model.business.VodDomainInstanceInfos.Builder getImageInstanceInfoBuilder() {
      
      onChanged();
      return getImageInstanceInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 图片分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos ImageInstanceInfo = 3;</code>
     */
    public com.volcengine.service.vod.model.business.VodDomainInstanceInfosOrBuilder getImageInstanceInfoOrBuilder() {
      if (imageInstanceInfoBuilder_ != null) {
        return imageInstanceInfoBuilder_.getMessageOrBuilder();
      } else {
        return imageInstanceInfo_ == null ?
            com.volcengine.service.vod.model.business.VodDomainInstanceInfos.getDefaultInstance() : imageInstanceInfo_;
      }
    }
    /**
     * <pre>
     * 图片分发加速配置
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodDomainInstanceInfos ImageInstanceInfo = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodDomainInstanceInfos, com.volcengine.service.vod.model.business.VodDomainInstanceInfos.Builder, com.volcengine.service.vod.model.business.VodDomainInstanceInfosOrBuilder> 
        getImageInstanceInfoFieldBuilder() {
      if (imageInstanceInfoBuilder_ == null) {
        imageInstanceInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.vod.model.business.VodDomainInstanceInfos, com.volcengine.service.vod.model.business.VodDomainInstanceInfos.Builder, com.volcengine.service.vod.model.business.VodDomainInstanceInfosOrBuilder>(
                getImageInstanceInfo(),
                getParentForChildren(),
                isClean());
        imageInstanceInfo_ = null;
      }
      return imageInstanceInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodDomainConfigInfo)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodDomainConfigInfo)
  private static final com.volcengine.service.vod.model.business.VodDomainConfigInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodDomainConfigInfo();
  }

  public static com.volcengine.service.vod.model.business.VodDomainConfigInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodDomainConfigInfo>
      PARSER = new com.google.protobuf.AbstractParser<VodDomainConfigInfo>() {
    @java.lang.Override
    public VodDomainConfigInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodDomainConfigInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodDomainConfigInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodDomainConfigInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodDomainConfigInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

