// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_space.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf enum {@code Volcengine.Vod.Models.Business.VodSpaceUploadConfigKey}
 */
public enum VodSpaceUploadConfigKey
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未定义的key
   * </pre>
   *
   * <code>UndefinedVodSpaceUploadConfigKey = 0;</code>
   */
  UndefinedVodSpaceUploadConfigKey(0),
  /**
   * <pre>
   * 自定义文件路径key
   * </pre>
   *
   * <code>CustomUploadFilePathVodSpaceUploadConfigKey = 1;</code>
   */
  CustomUploadFilePathVodSpaceUploadConfigKey(1),
  /**
   * <pre>
   * 上传完成后自动发布key
   * </pre>
   *
   * <code>AutoPublishAfterUploadVodSpaceUploadConfigKey = 2;</code>
   */
  AutoPublishAfterUploadVodSpaceUploadConfigKey(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未定义的key
   * </pre>
   *
   * <code>UndefinedVodSpaceUploadConfigKey = 0;</code>
   */
  public static final int UndefinedVodSpaceUploadConfigKey_VALUE = 0;
  /**
   * <pre>
   * 自定义文件路径key
   * </pre>
   *
   * <code>CustomUploadFilePathVodSpaceUploadConfigKey = 1;</code>
   */
  public static final int CustomUploadFilePathVodSpaceUploadConfigKey_VALUE = 1;
  /**
   * <pre>
   * 上传完成后自动发布key
   * </pre>
   *
   * <code>AutoPublishAfterUploadVodSpaceUploadConfigKey = 2;</code>
   */
  public static final int AutoPublishAfterUploadVodSpaceUploadConfigKey_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static VodSpaceUploadConfigKey valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VodSpaceUploadConfigKey forNumber(int value) {
    switch (value) {
      case 0: return UndefinedVodSpaceUploadConfigKey;
      case 1: return CustomUploadFilePathVodSpaceUploadConfigKey;
      case 2: return AutoPublishAfterUploadVodSpaceUploadConfigKey;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VodSpaceUploadConfigKey>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VodSpaceUploadConfigKey> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VodSpaceUploadConfigKey>() {
          public VodSpaceUploadConfigKey findValueByNumber(int number) {
            return VodSpaceUploadConfigKey.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodSpace.getDescriptor().getEnumTypes().get(0);
  }

  private static final VodSpaceUploadConfigKey[] VALUES = values();

  public static VodSpaceUploadConfigKey valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private VodSpaceUploadConfigKey(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Volcengine.Vod.Models.Business.VodSpaceUploadConfigKey)
}

