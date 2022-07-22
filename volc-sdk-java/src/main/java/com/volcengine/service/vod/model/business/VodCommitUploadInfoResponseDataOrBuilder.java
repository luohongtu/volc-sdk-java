// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_upload.proto

package com.volcengine.service.vod.model.business;

public interface VodCommitUploadInfoResponseDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodCommitUploadInfoResponseData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 视频的 id 
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <pre>
   * 视频的 id 
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <pre>
   * 视频的元信息 
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodSourceInfo SourceInfo = 2;</code>
   * @return Whether the sourceInfo field is set.
   */
  boolean hasSourceInfo();
  /**
   * <pre>
   * 视频的元信息 
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodSourceInfo SourceInfo = 2;</code>
   * @return The sourceInfo.
   */
  com.volcengine.service.vod.model.business.VodSourceInfo getSourceInfo();
  /**
   * <pre>
   * 视频的元信息 
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodSourceInfo SourceInfo = 2;</code>
   */
  com.volcengine.service.vod.model.business.VodSourceInfoOrBuilder getSourceInfoOrBuilder();

  /**
   * <pre>
   * 视频的封面图 URI 
   * </pre>
   *
   * <code>string PosterUri = 3;</code>
   * @return The posterUri.
   */
  java.lang.String getPosterUri();
  /**
   * <pre>
   * 视频的封面图 URI 
   * </pre>
   *
   * <code>string PosterUri = 3;</code>
   * @return The bytes for posterUri.
   */
  com.google.protobuf.ByteString
      getPosterUriBytes();

  /**
   * <pre>
   * 视频透传业务的参数 
   * </pre>
   *
   * <code>string CallbackArgs = 4;</code>
   * @return The callbackArgs.
   */
  java.lang.String getCallbackArgs();
  /**
   * <pre>
   * 视频透传业务的参数 
   * </pre>
   *
   * <code>string CallbackArgs = 4;</code>
   * @return The bytes for callbackArgs.
   */
  com.google.protobuf.ByteString
      getCallbackArgsBytes();

  /**
   * <pre>
   * 素材 id 
   * </pre>
   *
   * <code>string Mid = 5;</code>
   * @return The mid.
   */
  java.lang.String getMid();
  /**
   * <pre>
   * 素材 id 
   * </pre>
   *
   * <code>string Mid = 5;</code>
   * @return The bytes for mid.
   */
  com.google.protobuf.ByteString
      getMidBytes();
}
