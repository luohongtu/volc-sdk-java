// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_common.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf enum {@code Volcengine.Vod.Models.Business.VodPlayInfoModelVersion}
 */
public enum VodPlayInfoModelVersion
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未定义的数据版本
   * </pre>
   *
   * <code>UndefinedVodPlayInfoModelVersion = 0;</code>
   */
  UndefinedVodPlayInfoModelVersion(0),
  /**
   * <code>InternalV1VodPlayInfoModelVersion = 1;</code>
   */
  InternalV1VodPlayInfoModelVersion(1),
  /**
   * <code>InternalV2VodPlayInfoModelVersion = 2;</code>
   */
  InternalV2VodPlayInfoModelVersion(2),
  /**
   * <code>InternalV3VodPlayInfoModelVersion = 3;</code>
   */
  InternalV3VodPlayInfoModelVersion(3),
  /**
   * <pre>
   * ToB第一版
   * </pre>
   *
   * <code>ToBV1VodPlayInfoModelVersion = 4;</code>
   */
  ToBV1VodPlayInfoModelVersion(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未定义的数据版本
   * </pre>
   *
   * <code>UndefinedVodPlayInfoModelVersion = 0;</code>
   */
  public static final int UndefinedVodPlayInfoModelVersion_VALUE = 0;
  /**
   * <code>InternalV1VodPlayInfoModelVersion = 1;</code>
   */
  public static final int InternalV1VodPlayInfoModelVersion_VALUE = 1;
  /**
   * <code>InternalV2VodPlayInfoModelVersion = 2;</code>
   */
  public static final int InternalV2VodPlayInfoModelVersion_VALUE = 2;
  /**
   * <code>InternalV3VodPlayInfoModelVersion = 3;</code>
   */
  public static final int InternalV3VodPlayInfoModelVersion_VALUE = 3;
  /**
   * <pre>
   * ToB第一版
   * </pre>
   *
   * <code>ToBV1VodPlayInfoModelVersion = 4;</code>
   */
  public static final int ToBV1VodPlayInfoModelVersion_VALUE = 4;


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
  public static VodPlayInfoModelVersion valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VodPlayInfoModelVersion forNumber(int value) {
    switch (value) {
      case 0: return UndefinedVodPlayInfoModelVersion;
      case 1: return InternalV1VodPlayInfoModelVersion;
      case 2: return InternalV2VodPlayInfoModelVersion;
      case 3: return InternalV3VodPlayInfoModelVersion;
      case 4: return ToBV1VodPlayInfoModelVersion;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VodPlayInfoModelVersion>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VodPlayInfoModelVersion> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VodPlayInfoModelVersion>() {
          public VodPlayInfoModelVersion findValueByNumber(int number) {
            return VodPlayInfoModelVersion.forNumber(number);
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
    return com.volcengine.service.vod.model.business.VodCommon.getDescriptor().getEnumTypes().get(0);
  }

  private static final VodPlayInfoModelVersion[] VALUES = values();

  public static VodPlayInfoModelVersion valueOf(
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

  private VodPlayInfoModelVersion(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Volcengine.Vod.Models.Business.VodPlayInfoModelVersion)
}

