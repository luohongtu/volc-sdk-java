// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/request/request_live.proto

package com.volcengine.service.live.model.request;

public interface ForbidStreamRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Live.Models.Request.ForbidStreamRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 域名空间名称
   * </pre>
   *
   * <code>string Vhost = 1;</code>
   * @return The vhost.
   */
  java.lang.String getVhost();
  /**
   * <pre>
   * 域名空间名称
   * </pre>
   *
   * <code>string Vhost = 1;</code>
   * @return The bytes for vhost.
   */
  com.google.protobuf.ByteString
      getVhostBytes();

  /**
   * <pre>
   *推流域名。
   *参数 `Domain` 和 `Vhost`传且仅传一个。
   * </pre>
   *
   * <code>string Domain = 2;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   *推流域名。
   *参数 `Domain` 和 `Vhost`传且仅传一个。
   * </pre>
   *
   * <code>string Domain = 2;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * 应用名称，默认查询所有应用名称，由 1 到 30
   * 位数字、字母、下划线及"-"和"."组成。
   * </pre>
   *
   * <code>string App = 3;</code>
   * @return The app.
   */
  java.lang.String getApp();
  /**
   * <pre>
   * 应用名称，默认查询所有应用名称，由 1 到 30
   * 位数字、字母、下划线及"-"和"."组成。
   * </pre>
   *
   * <code>string App = 3;</code>
   * @return The bytes for app.
   */
  com.google.protobuf.ByteString
      getAppBytes();

  /**
   * <pre>
   * 流名称，缺省情况下，查询所有流名称，由 1 到
   * 100位数字、字母、下划线及"-"和"."组成，如果指定 Stream，必须同时指定
   * App的值
   * </pre>
   *
   * <code>string Stream = 4;</code>
   * @return The stream.
   */
  java.lang.String getStream();
  /**
   * <pre>
   * 流名称，缺省情况下，查询所有流名称，由 1 到
   * 100位数字、字母、下划线及"-"和"."组成，如果指定 Stream，必须同时指定
   * App的值
   * </pre>
   *
   * <code>string Stream = 4;</code>
   * @return The bytes for stream.
   */
  com.google.protobuf.ByteString
      getStreamBytes();

  /**
   * <pre>
   * 禁推的结束时间，禁推有效期最长为 90 天，默认为当前时间加 90 天
   * </pre>
   *
   * <code>string EndTime = 5;</code>
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   * <pre>
   * 禁推的结束时间，禁推有效期最长为 90 天，默认为当前时间加 90 天
   * </pre>
   *
   * <code>string EndTime = 5;</code>
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString
      getEndTimeBytes();
}
