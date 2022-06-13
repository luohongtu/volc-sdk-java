// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_common.proto

package com.volcengine.service.vod.model.business;

public interface VodAllPlayInfoModelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodAllPlayInfoModel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 唯一ID
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <pre>
   * 唯一ID
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <pre>
   * 状态
   * </pre>
   *
   * <code>int32 Status = 2;</code>
   * @return The status.
   */
  int getStatus();

  /**
   * <pre>
   * 封面地址
   * </pre>
   *
   * <code>string PosterUrl = 3;</code>
   * @return The posterUrl.
   */
  java.lang.String getPosterUrl();
  /**
   * <pre>
   * 封面地址
   * </pre>
   *
   * <code>string PosterUrl = 3;</code>
   * @return The bytes for posterUrl.
   */
  com.google.protobuf.ByteString
      getPosterUrlBytes();

  /**
   * <pre>
   * 播放列表数量
   * </pre>
   *
   * <code>int32 TotalCount = 4;</code>
   * @return The totalCount.
   */
  int getTotalCount();

  /**
   * <pre>
   * 是否关键针对齐
   * </pre>
   *
   * <code>bool EnableAdaptive = 5;</code>
   * @return The enableAdaptive.
   */
  boolean getEnableAdaptive();

  /**
   * <pre>
   * 转码流
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodPlayInfo VodTranscodePlayInfo = 6;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodPlayInfo> 
      getVodTranscodePlayInfoList();
  /**
   * <pre>
   * 转码流
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodPlayInfo VodTranscodePlayInfo = 6;</code>
   */
  com.volcengine.service.vod.model.business.VodPlayInfo getVodTranscodePlayInfo(int index);
  /**
   * <pre>
   * 转码流
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodPlayInfo VodTranscodePlayInfo = 6;</code>
   */
  int getVodTranscodePlayInfoCount();
  /**
   * <pre>
   * 转码流
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodPlayInfo VodTranscodePlayInfo = 6;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodPlayInfoOrBuilder> 
      getVodTranscodePlayInfoOrBuilderList();
  /**
   * <pre>
   * 转码流
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodPlayInfo VodTranscodePlayInfo = 6;</code>
   */
  com.volcengine.service.vod.model.business.VodPlayInfoOrBuilder getVodTranscodePlayInfoOrBuilder(
      int index);

  /**
   * <pre>
   * 原片流
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodPlayInfo VodSourcePlayInfo = 7;</code>
   * @return Whether the vodSourcePlayInfo field is set.
   */
  boolean hasVodSourcePlayInfo();
  /**
   * <pre>
   * 原片流
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodPlayInfo VodSourcePlayInfo = 7;</code>
   * @return The vodSourcePlayInfo.
   */
  com.volcengine.service.vod.model.business.VodPlayInfo getVodSourcePlayInfo();
  /**
   * <pre>
   * 原片流
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodPlayInfo VodSourcePlayInfo = 7;</code>
   */
  com.volcengine.service.vod.model.business.VodPlayInfoOrBuilder getVodSourcePlayInfoOrBuilder();

  /**
   * <pre>
   * 数据版本
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModelVersion Version = 8;</code>
   * @return The enum numeric value on the wire for version.
   */
  int getVersionValue();
  /**
   * <pre>
   * 数据版本
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModelVersion Version = 8;</code>
   * @return The version.
   */
  com.volcengine.service.vod.model.business.VodPlayInfoModelVersion getVersion();

  /**
   * <pre>
   * 雪碧图列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodThumbInfo ThumbInfoList = 9;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodThumbInfo> 
      getThumbInfoListList();
  /**
   * <pre>
   * 雪碧图列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodThumbInfo ThumbInfoList = 9;</code>
   */
  com.volcengine.service.vod.model.business.VodThumbInfo getThumbInfoList(int index);
  /**
   * <pre>
   * 雪碧图列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodThumbInfo ThumbInfoList = 9;</code>
   */
  int getThumbInfoListCount();
  /**
   * <pre>
   * 雪碧图列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodThumbInfo ThumbInfoList = 9;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodThumbInfoOrBuilder> 
      getThumbInfoListOrBuilderList();
  /**
   * <pre>
   * 雪碧图列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodThumbInfo ThumbInfoList = 9;</code>
   */
  com.volcengine.service.vod.model.business.VodThumbInfoOrBuilder getThumbInfoListOrBuilder(
      int index);

  /**
   * <pre>
   * 弹幕蒙版url
   * </pre>
   *
   * <code>string BarrageMaskUrl = 10;</code>
   * @return The barrageMaskUrl.
   */
  java.lang.String getBarrageMaskUrl();
  /**
   * <pre>
   * 弹幕蒙版url
   * </pre>
   *
   * <code>string BarrageMaskUrl = 10;</code>
   * @return The bytes for barrageMaskUrl.
   */
  com.google.protobuf.ByteString
      getBarrageMaskUrlBytes();

  /**
   * <pre>
   * 字幕信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 11;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodSubtitleInfo> 
      getSubtitleInfoListList();
  /**
   * <pre>
   * 字幕信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 11;</code>
   */
  com.volcengine.service.vod.model.business.VodSubtitleInfo getSubtitleInfoList(int index);
  /**
   * <pre>
   * 字幕信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 11;</code>
   */
  int getSubtitleInfoListCount();
  /**
   * <pre>
   * 字幕信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 11;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodSubtitleInfoOrBuilder> 
      getSubtitleInfoListOrBuilderList();
  /**
   * <pre>
   * 字幕信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 11;</code>
   */
  com.volcengine.service.vod.model.business.VodSubtitleInfoOrBuilder getSubtitleInfoListOrBuilder(
      int index);
}
