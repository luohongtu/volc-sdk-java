// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/request/request_live.proto

package com.volcengine.service.live.model.request;

public interface DescribeDenyConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Live.Models.Request.DescribeDenyConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *域名空间名称
   * </pre>
   *
   * <code>string Vhost = 1;</code>
   * @return The vhost.
   */
  java.lang.String getVhost();
  /**
   * <pre>
   *域名空间名称
   * </pre>
   *
   * <code>string Vhost = 1;</code>
   * @return The bytes for vhost.
   */
  com.google.protobuf.ByteString
      getVhostBytes();

  /**
   * <pre>
   *推拉流域名，domain和app二选一填
   * </pre>
   *
   * <code>string Domain = 2;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   *推拉流域名，domain和app二选一填
   * </pre>
   *
   * <code>string Domain = 2;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * App的名称，由 1 到 30
   * 位数字、字母、下划线及"-"和"."组成。domain和app二选一填。
   * </pre>
   *
   * <code>string App = 3;</code>
   * @return The app.
   */
  java.lang.String getApp();
  /**
   * <pre>
   * App的名称，由 1 到 30
   * 位数字、字母、下划线及"-"和"."组成。domain和app二选一填。
   * </pre>
   *
   * <code>string App = 3;</code>
   * @return The bytes for app.
   */
  com.google.protobuf.ByteString
      getAppBytes();
}
