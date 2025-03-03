// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/request/request_live.proto

package com.volcengine.service.live.model.request;

public interface UpdatePullToPushTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Live.Models.Request.UpdatePullToPushTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *任务标题
   * </pre>
   *
   * <code>string Title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   *任务标题
   * </pre>
   *
   * <code>string Title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   *任务ID
   * </pre>
   *
   * <code>string TaskId = 2;</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <pre>
   *任务ID
   * </pre>
   *
   * <code>string TaskId = 2;</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();

  /**
   * <pre>
   *开始时间，unix时间戳，单位s
   * </pre>
   *
   * <code>int64 StartTime = 3;</code>
   * @return The startTime.
   */
  long getStartTime();

  /**
   * <pre>
   *结束时间，unix时间戳，单位s，与开始时间跨度不超过7天
   * </pre>
   *
   * <code>int64 EndTime = 4;</code>
   * @return The endTime.
   */
  long getEndTime();

  /**
   * <pre>
   *回调地址，长度小于2000
   * </pre>
   *
   * <code>string CallbackURL = 5;</code>
   * @return The callbackURL.
   */
  java.lang.String getCallbackURL();
  /**
   * <pre>
   *回调地址，长度小于2000
   * </pre>
   *
   * <code>string CallbackURL = 5;</code>
   * @return The bytes for callbackURL.
   */
  com.google.protobuf.ByteString
      getCallbackURLBytes();

  /**
   * <pre>
   *拉流转推地址类型，0：直播，1：点播
   * </pre>
   *
   * <code>int32 Type = 6;</code>
   * @return The type.
   */
  int getType();

  /**
   * <pre>
   *点播时，拉流地址的循环模式，Type=1时必选，-1：顺序循环
   * </pre>
   *
   * <code>int32 CycleMode = 7;</code>
   * @return The cycleMode.
   */
  int getCycleMode();

  /**
   * <pre>
   *推流目标地址
   * </pre>
   *
   * <code>string DstAddr = 8;</code>
   * @return The dstAddr.
   */
  java.lang.String getDstAddr();
  /**
   * <pre>
   *推流目标地址
   * </pre>
   *
   * <code>string DstAddr = 8;</code>
   * @return The bytes for dstAddr.
   */
  com.google.protobuf.ByteString
      getDstAddrBytes();

  /**
   * <pre>
   *直播拉流地址,Type=0时必填
   * </pre>
   *
   * <code>string SrcAddr = 9;</code>
   * @return The srcAddr.
   */
  java.lang.String getSrcAddr();
  /**
   * <pre>
   *直播拉流地址,Type=0时必填
   * </pre>
   *
   * <code>string SrcAddr = 9;</code>
   * @return The bytes for srcAddr.
   */
  com.google.protobuf.ByteString
      getSrcAddrBytes();

  /**
   * <pre>
   *点播拉流地址，Type=1时必填
   * </pre>
   *
   * <code>repeated string SrcAddrS = 10;</code>
   * @return A list containing the srcAddrS.
   */
  java.util.List<java.lang.String>
      getSrcAddrSList();
  /**
   * <pre>
   *点播拉流地址，Type=1时必填
   * </pre>
   *
   * <code>repeated string SrcAddrS = 10;</code>
   * @return The count of srcAddrS.
   */
  int getSrcAddrSCount();
  /**
   * <pre>
   *点播拉流地址，Type=1时必填
   * </pre>
   *
   * <code>repeated string SrcAddrS = 10;</code>
   * @param index The index of the element to return.
   * @return The srcAddrS at the given index.
   */
  java.lang.String getSrcAddrS(int index);
  /**
   * <pre>
   *点播拉流地址，Type=1时必填
   * </pre>
   *
   * <code>repeated string SrcAddrS = 10;</code>
   * @param index The index of the value to return.
   * @return The bytes of the srcAddrS at the given index.
   */
  com.google.protobuf.ByteString
      getSrcAddrSBytes(int index);
}
