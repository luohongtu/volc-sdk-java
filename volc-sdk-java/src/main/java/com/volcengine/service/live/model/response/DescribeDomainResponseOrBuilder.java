// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/response/response_live.proto

package com.volcengine.service.live.model.response;

public interface DescribeDomainResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Live.Models.Response.DescribeDomainResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  boolean hasResponseMetadata();
  /**
   * <pre>
   * 响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  com.volcengine.service.base.model.base.ResponseMetadata getResponseMetadata();
  /**
   * <pre>
   * 响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  com.volcengine.service.base.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder();

  /**
   * <pre>
   *返回结果
   * </pre>
   *
   * <code>.Volcengine.Live.Models.Business.DomainListInfo Result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   *返回结果
   * </pre>
   *
   * <code>.Volcengine.Live.Models.Business.DomainListInfo Result = 2;</code>
   * @return The result.
   */
  com.volcengine.service.live.model.business.DomainListInfo getResult();
  /**
   * <pre>
   *返回结果
   * </pre>
   *
   * <code>.Volcengine.Live.Models.Business.DomainListInfo Result = 2;</code>
   */
  com.volcengine.service.live.model.business.DomainListInfoOrBuilder getResultOrBuilder();
}
