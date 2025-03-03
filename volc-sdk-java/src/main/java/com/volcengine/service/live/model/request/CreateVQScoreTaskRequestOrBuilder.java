// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/request/request_live.proto

package com.volcengine.service.live.model.request;

public interface CreateVQScoreTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Live.Models.Request.CreateVQScoreTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 主拉流地址。 支持输入FCDN拉流地址和第三方CDN拉流地址。
   * </pre>
   *
   * <code>string MainAddr = 1;</code>
   * @return The mainAddr.
   */
  java.lang.String getMainAddr();
  /**
   * <pre>
   * 主拉流地址。 支持输入FCDN拉流地址和第三方CDN拉流地址。
   * </pre>
   *
   * <code>string MainAddr = 1;</code>
   * @return The bytes for mainAddr.
   */
  com.google.protobuf.ByteString
      getMainAddrBytes();

  /**
   * <pre>
   * 对比拉流地址。
   * </pre>
   *
   * <code>string ContrastAddr = 2;</code>
   * @return The contrastAddr.
   */
  java.lang.String getContrastAddr();
  /**
   * <pre>
   * 对比拉流地址。
   * </pre>
   *
   * <code>string ContrastAddr = 2;</code>
   * @return The bytes for contrastAddr.
   */
  com.google.protobuf.ByteString
      getContrastAddrBytes();

  /**
   * <pre>
   * 抽帧间隔，目前只能密集抽帧模板控制，以模板为主。
   * </pre>
   *
   * <code>int64 FrameInterval = 3;</code>
   * @return The frameInterval.
   */
  long getFrameInterval();

  /**
   * <pre>
   * 测评运行时间
   *- 支持输入s整数
   *- 最大支持7*24小时的测评任务
   *- 最小支持1min的测评任务
   * </pre>
   *
   * <code>int64 Duration = 4;</code>
   * @return The duration.
   */
  long getDuration();

  /**
   * <pre>
   * 测评算法，支持vqscore分数计算
   * </pre>
   *
   * <code>string Algorithm = 5;</code>
   * @return The algorithm.
   */
  java.lang.String getAlgorithm();
  /**
   * <pre>
   * 测评算法，支持vqscore分数计算
   * </pre>
   *
   * <code>string Algorithm = 5;</code>
   * @return The bytes for algorithm.
   */
  com.google.protobuf.ByteString
      getAlgorithmBytes();
}
