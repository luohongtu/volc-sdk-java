// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/response/response_vod.proto

package com.volcengine.service.vod.model.response;

public interface VodCommitUploadInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Response.VodCommitUploadInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 通用返回结构 
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  boolean hasResponseMetadata();
  /**
   * <pre>
   * 通用返回结构 
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  com.volcengine.service.base.model.base.ResponseMetadata getResponseMetadata();
  /**
   * <pre>
   * 通用返回结构 
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  com.volcengine.service.base.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder();

  /**
   * <pre>
   * 视频上传 1005 阶段返回结果 
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodCommitUploadInfoResult Result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   * 视频上传 1005 阶段返回结果 
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodCommitUploadInfoResult Result = 2;</code>
   * @return The result.
   */
  com.volcengine.service.vod.model.business.VodCommitUploadInfoResult getResult();
  /**
   * <pre>
   * 视频上传 1005 阶段返回结果 
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodCommitUploadInfoResult Result = 2;</code>
   */
  com.volcengine.service.vod.model.business.VodCommitUploadInfoResultOrBuilder getResultOrBuilder();
}
