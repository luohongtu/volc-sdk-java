// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VolumeInfo}
 */
public final class VolumeInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VolumeInfo)
    VolumeInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VolumeInfo.newBuilder() to construct.
  private VolumeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VolumeInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VolumeInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VolumeInfo(
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
          case 9: {

            loudness_ = input.readDouble();
            break;
          }
          case 17: {

            peak_ = input.readDouble();
            break;
          }
          case 25: {

            meanVolume_ = input.readDouble();
            break;
          }
          case 33: {

            maxVolume_ = input.readDouble();
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
    return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_VolumeInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_VolumeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VolumeInfo.class, com.volcengine.service.vod.model.business.VolumeInfo.Builder.class);
  }

  public static final int LOUDNESS_FIELD_NUMBER = 1;
  private double loudness_;
  /**
   * <pre>
   * 响度, 单位：LUFS
   * </pre>
   *
   * <code>double Loudness = 1;</code>
   * @return The loudness.
   */
  @java.lang.Override
  public double getLoudness() {
    return loudness_;
  }

  public static final int PEAK_FIELD_NUMBER = 2;
  private double peak_;
  /**
   * <pre>
   * 峰值，范围：（0, 1.0], 峰值归一化
   * </pre>
   *
   * <code>double Peak = 2;</code>
   * @return The peak.
   */
  @java.lang.Override
  public double getPeak() {
    return peak_;
  }

  public static final int MEANVOLUME_FIELD_NUMBER = 3;
  private double meanVolume_;
  /**
   * <pre>
   * 均值，单位：dB
   * </pre>
   *
   * <code>double MeanVolume = 3;</code>
   * @return The meanVolume.
   */
  @java.lang.Override
  public double getMeanVolume() {
    return meanVolume_;
  }

  public static final int MAXVOLUME_FIELD_NUMBER = 4;
  private double maxVolume_;
  /**
   * <pre>
   * 最大值，单位：dB
   * </pre>
   *
   * <code>double MaxVolume = 4;</code>
   * @return The maxVolume.
   */
  @java.lang.Override
  public double getMaxVolume() {
    return maxVolume_;
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
    if (java.lang.Double.doubleToRawLongBits(loudness_) != 0) {
      output.writeDouble(1, loudness_);
    }
    if (java.lang.Double.doubleToRawLongBits(peak_) != 0) {
      output.writeDouble(2, peak_);
    }
    if (java.lang.Double.doubleToRawLongBits(meanVolume_) != 0) {
      output.writeDouble(3, meanVolume_);
    }
    if (java.lang.Double.doubleToRawLongBits(maxVolume_) != 0) {
      output.writeDouble(4, maxVolume_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(loudness_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, loudness_);
    }
    if (java.lang.Double.doubleToRawLongBits(peak_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, peak_);
    }
    if (java.lang.Double.doubleToRawLongBits(meanVolume_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, meanVolume_);
    }
    if (java.lang.Double.doubleToRawLongBits(maxVolume_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, maxVolume_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VolumeInfo)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VolumeInfo other = (com.volcengine.service.vod.model.business.VolumeInfo) obj;

    if (java.lang.Double.doubleToLongBits(getLoudness())
        != java.lang.Double.doubleToLongBits(
            other.getLoudness())) return false;
    if (java.lang.Double.doubleToLongBits(getPeak())
        != java.lang.Double.doubleToLongBits(
            other.getPeak())) return false;
    if (java.lang.Double.doubleToLongBits(getMeanVolume())
        != java.lang.Double.doubleToLongBits(
            other.getMeanVolume())) return false;
    if (java.lang.Double.doubleToLongBits(getMaxVolume())
        != java.lang.Double.doubleToLongBits(
            other.getMaxVolume())) return false;
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
    hash = (37 * hash) + LOUDNESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLoudness()));
    hash = (37 * hash) + PEAK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPeak()));
    hash = (37 * hash) + MEANVOLUME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMeanVolume()));
    hash = (37 * hash) + MAXVOLUME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMaxVolume()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VolumeInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VolumeInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VolumeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VolumeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VolumeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VolumeInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VolumeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VolumeInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VolumeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VolumeInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VolumeInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VolumeInfo parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VolumeInfo prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VolumeInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VolumeInfo)
      com.volcengine.service.vod.model.business.VolumeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_VolumeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_VolumeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VolumeInfo.class, com.volcengine.service.vod.model.business.VolumeInfo.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VolumeInfo.newBuilder()
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
      loudness_ = 0D;

      peak_ = 0D;

      meanVolume_ = 0D;

      maxVolume_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_VolumeInfo_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VolumeInfo getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VolumeInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VolumeInfo build() {
      com.volcengine.service.vod.model.business.VolumeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VolumeInfo buildPartial() {
      com.volcengine.service.vod.model.business.VolumeInfo result = new com.volcengine.service.vod.model.business.VolumeInfo(this);
      result.loudness_ = loudness_;
      result.peak_ = peak_;
      result.meanVolume_ = meanVolume_;
      result.maxVolume_ = maxVolume_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VolumeInfo) {
        return mergeFrom((com.volcengine.service.vod.model.business.VolumeInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VolumeInfo other) {
      if (other == com.volcengine.service.vod.model.business.VolumeInfo.getDefaultInstance()) return this;
      if (other.getLoudness() != 0D) {
        setLoudness(other.getLoudness());
      }
      if (other.getPeak() != 0D) {
        setPeak(other.getPeak());
      }
      if (other.getMeanVolume() != 0D) {
        setMeanVolume(other.getMeanVolume());
      }
      if (other.getMaxVolume() != 0D) {
        setMaxVolume(other.getMaxVolume());
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
      com.volcengine.service.vod.model.business.VolumeInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VolumeInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double loudness_ ;
    /**
     * <pre>
     * 响度, 单位：LUFS
     * </pre>
     *
     * <code>double Loudness = 1;</code>
     * @return The loudness.
     */
    @java.lang.Override
    public double getLoudness() {
      return loudness_;
    }
    /**
     * <pre>
     * 响度, 单位：LUFS
     * </pre>
     *
     * <code>double Loudness = 1;</code>
     * @param value The loudness to set.
     * @return This builder for chaining.
     */
    public Builder setLoudness(double value) {
      
      loudness_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 响度, 单位：LUFS
     * </pre>
     *
     * <code>double Loudness = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLoudness() {
      
      loudness_ = 0D;
      onChanged();
      return this;
    }

    private double peak_ ;
    /**
     * <pre>
     * 峰值，范围：（0, 1.0], 峰值归一化
     * </pre>
     *
     * <code>double Peak = 2;</code>
     * @return The peak.
     */
    @java.lang.Override
    public double getPeak() {
      return peak_;
    }
    /**
     * <pre>
     * 峰值，范围：（0, 1.0], 峰值归一化
     * </pre>
     *
     * <code>double Peak = 2;</code>
     * @param value The peak to set.
     * @return This builder for chaining.
     */
    public Builder setPeak(double value) {
      
      peak_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 峰值，范围：（0, 1.0], 峰值归一化
     * </pre>
     *
     * <code>double Peak = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPeak() {
      
      peak_ = 0D;
      onChanged();
      return this;
    }

    private double meanVolume_ ;
    /**
     * <pre>
     * 均值，单位：dB
     * </pre>
     *
     * <code>double MeanVolume = 3;</code>
     * @return The meanVolume.
     */
    @java.lang.Override
    public double getMeanVolume() {
      return meanVolume_;
    }
    /**
     * <pre>
     * 均值，单位：dB
     * </pre>
     *
     * <code>double MeanVolume = 3;</code>
     * @param value The meanVolume to set.
     * @return This builder for chaining.
     */
    public Builder setMeanVolume(double value) {
      
      meanVolume_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 均值，单位：dB
     * </pre>
     *
     * <code>double MeanVolume = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMeanVolume() {
      
      meanVolume_ = 0D;
      onChanged();
      return this;
    }

    private double maxVolume_ ;
    /**
     * <pre>
     * 最大值，单位：dB
     * </pre>
     *
     * <code>double MaxVolume = 4;</code>
     * @return The maxVolume.
     */
    @java.lang.Override
    public double getMaxVolume() {
      return maxVolume_;
    }
    /**
     * <pre>
     * 最大值，单位：dB
     * </pre>
     *
     * <code>double MaxVolume = 4;</code>
     * @param value The maxVolume to set.
     * @return This builder for chaining.
     */
    public Builder setMaxVolume(double value) {
      
      maxVolume_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 最大值，单位：dB
     * </pre>
     *
     * <code>double MaxVolume = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxVolume() {
      
      maxVolume_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VolumeInfo)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VolumeInfo)
  private static final com.volcengine.service.vod.model.business.VolumeInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VolumeInfo();
  }

  public static com.volcengine.service.vod.model.business.VolumeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VolumeInfo>
      PARSER = new com.google.protobuf.AbstractParser<VolumeInfo>() {
    @java.lang.Override
    public VolumeInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VolumeInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VolumeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VolumeInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VolumeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

