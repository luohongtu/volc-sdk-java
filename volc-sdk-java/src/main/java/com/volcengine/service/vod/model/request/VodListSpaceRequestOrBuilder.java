// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodListSpaceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodListSpaceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 查询游标 
   * </pre>
   *
   * <code>double Offset = 1;</code>
   * @return The offset.
   */
  double getOffset();

  /**
   * <pre>
   * 查询数量 
   * </pre>
   *
   * <code>double Limit = 2;</code>
   * @return The limit.
   */
  double getLimit();
}
