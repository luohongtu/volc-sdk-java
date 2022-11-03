// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_common.proto

package com.volcengine.service.vod.model.business;

public interface VodSourceInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodSourceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *文件ID
   * </pre>
   *
   * <code>string FileId = 1;</code>
   * @return The fileId.
   */
  java.lang.String getFileId();
  /**
   * <pre>
   *文件ID
   * </pre>
   *
   * <code>string FileId = 1;</code>
   * @return The bytes for fileId.
   */
  com.google.protobuf.ByteString
      getFileIdBytes();

  /**
   * <pre>
   * hash值
   * </pre>
   *
   * <code>string Md5 = 2;</code>
   * @return The md5.
   */
  java.lang.String getMd5();
  /**
   * <pre>
   * hash值
   * </pre>
   *
   * <code>string Md5 = 2;</code>
   * @return The bytes for md5.
   */
  com.google.protobuf.ByteString
      getMd5Bytes();

  /**
   * <pre>
   *文件类型 video/audio
   * </pre>
   *
   * <code>string FileType = 3;</code>
   * @return The fileType.
   */
  java.lang.String getFileType();
  /**
   * <pre>
   *文件类型 video/audio
   * </pre>
   *
   * <code>string FileType = 3;</code>
   * @return The bytes for fileType.
   */
  com.google.protobuf.ByteString
      getFileTypeBytes();

  /**
   * <pre>
   *编码格式
   * </pre>
   *
   * <code>string Codec = 4;</code>
   * @return The codec.
   */
  java.lang.String getCodec();
  /**
   * <pre>
   *编码格式
   * </pre>
   *
   * <code>string Codec = 4;</code>
   * @return The bytes for codec.
   */
  com.google.protobuf.ByteString
      getCodecBytes();

  /**
   * <pre>
   *视频高度
   * </pre>
   *
   * <code>int32 Height = 5;</code>
   * @return The height.
   */
  int getHeight();

  /**
   * <pre>
   *视频宽度
   * </pre>
   *
   * <code>int32 Width = 6;</code>
   * @return The width.
   */
  int getWidth();

  /**
   * <pre>
   *文件格式
   * </pre>
   *
   * <code>string Format = 7;</code>
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   * <pre>
   *文件格式
   * </pre>
   *
   * <code>string Format = 7;</code>
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString
      getFormatBytes();

  /**
   * <pre>
   *时长
   * </pre>
   *
   * <code>float Duration = 8;</code>
   * @return The duration.
   */
  float getDuration();

  /**
   * <pre>
   *文件大小
   * </pre>
   *
   * <code>double Size = 9;</code>
   * @return The size.
   */
  double getSize();

  /**
   * <pre>
   *对象地址
   * </pre>
   *
   * <code>string StoreUri = 10;</code>
   * @return The storeUri.
   */
  java.lang.String getStoreUri();
  /**
   * <pre>
   *对象地址
   * </pre>
   *
   * <code>string StoreUri = 10;</code>
   * @return The bytes for storeUri.
   */
  com.google.protobuf.ByteString
      getStoreUriBytes();

  /**
   * <pre>
   *视频分辨率
   * </pre>
   *
   * <code>string Definition = 11;</code>
   * @return The definition.
   */
  java.lang.String getDefinition();
  /**
   * <pre>
   *视频分辨率
   * </pre>
   *
   * <code>string Definition = 11;</code>
   * @return The bytes for definition.
   */
  com.google.protobuf.ByteString
      getDefinitionBytes();

  /**
   * <pre>
   *码率(Kbps)
   * </pre>
   *
   * <code>int32 Bitrate = 12;</code>
   * @return The bitrate.
   */
  int getBitrate();

  /**
   * <pre>
   *帧率
   * </pre>
   *
   * <code>float Fps = 13;</code>
   * @return The fps.
   */
  float getFps();

  /**
   * <pre>
   *创建时间
   * </pre>
   *
   * <code>string CreateTime = 14;</code>
   * @return The createTime.
   */
  java.lang.String getCreateTime();
  /**
   * <pre>
   *创建时间
   * </pre>
   *
   * <code>string CreateTime = 14;</code>
   * @return The bytes for createTime.
   */
  com.google.protobuf.ByteString
      getCreateTimeBytes();

  /**
   * <pre>
   *音频质量
   * </pre>
   *
   * <code>string Quality = 15;</code>
   * @return The quality.
   */
  java.lang.String getQuality();
  /**
   * <pre>
   *音频质量
   * </pre>
   *
   * <code>string Quality = 15;</code>
   * @return The bytes for quality.
   */
  com.google.protobuf.ByteString
      getQualityBytes();

  /**
   * <pre>
   *动态范围，"HDR" or "SDR"
   * </pre>
   *
   * <code>string DynamicRange = 16;</code>
   * @return The dynamicRange.
   */
  java.lang.String getDynamicRange();
  /**
   * <pre>
   *动态范围，"HDR" or "SDR"
   * </pre>
   *
   * <code>string DynamicRange = 16;</code>
   * @return The bytes for dynamicRange.
   */
  com.google.protobuf.ByteString
      getDynamicRangeBytes();

  /**
   * <pre>
   *视频流信息
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodVideoStreamMeta VideoStreamMeta = 17;</code>
   * @return Whether the videoStreamMeta field is set.
   */
  boolean hasVideoStreamMeta();
  /**
   * <pre>
   *视频流信息
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodVideoStreamMeta VideoStreamMeta = 17;</code>
   * @return The videoStreamMeta.
   */
  com.volcengine.service.vod.model.business.VodVideoStreamMeta getVideoStreamMeta();
  /**
   * <pre>
   *视频流信息
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodVideoStreamMeta VideoStreamMeta = 17;</code>
   */
  com.volcengine.service.vod.model.business.VodVideoStreamMetaOrBuilder getVideoStreamMetaOrBuilder();

  /**
   * <pre>
   *音频流信息
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodAudioStreamMeta AudioStreamMeta = 18;</code>
   * @return Whether the audioStreamMeta field is set.
   */
  boolean hasAudioStreamMeta();
  /**
   * <pre>
   *音频流信息
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodAudioStreamMeta AudioStreamMeta = 18;</code>
   * @return The audioStreamMeta.
   */
  com.volcengine.service.vod.model.business.VodAudioStreamMeta getAudioStreamMeta();
  /**
   * <pre>
   *音频流信息
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodAudioStreamMeta AudioStreamMeta = 18;</code>
   */
  com.volcengine.service.vod.model.business.VodAudioStreamMetaOrBuilder getAudioStreamMetaOrBuilder();
}
