// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/request/request_live.proto

package com.volcengine.service.live.model.request;

public interface DeleteRelaySourceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Live.Models.Request.DeleteRelaySourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 域名空间名称。
   * </pre>
   *
   * <code>string Vhost = 1;</code>
   * @return The vhost.
   */
  java.lang.String getVhost();
  /**
   * <pre>
   * 域名空间名称。
   * </pre>
   *
   * <code>string Vhost = 1;</code>
   * @return The bytes for vhost.
   */
  com.google.protobuf.ByteString
      getVhostBytes();

  /**
   * <pre>
   * 应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。
   * </pre>
   *
   * <code>string App = 2;</code>
   * @return The app.
   */
  java.lang.String getApp();
  /**
   * <pre>
   * 应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。
   * </pre>
   *
   * <code>string App = 2;</code>
   * @return The bytes for app.
   */
  com.google.protobuf.ByteString
      getAppBytes();
}
