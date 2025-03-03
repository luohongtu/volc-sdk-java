// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

public interface VodASRLanguageDetailForAuditOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodASRLanguageDetailForAudit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 识别为此语言的概率
   * </pre>
   *
   * <code>double Prob = 1;</code>
   * @return The prob.
   */
  double getProb();

  /**
   * <pre>
   *语言类型，形式形如`&lt;mand&gt;`=普通话，`&lt;sc&gt;`=四川话，`&lt;cant&gt;`=粤语
   * </pre>
   *
   * <code>string Language = 2;</code>
   * @return The language.
   */
  java.lang.String getLanguage();
  /**
   * <pre>
   *语言类型，形式形如`&lt;mand&gt;`=普通话，`&lt;sc&gt;`=四川话，`&lt;cant&gt;`=粤语
   * </pre>
   *
   * <code>string Language = 2;</code>
   * @return The bytes for language.
   */
  com.google.protobuf.ByteString
      getLanguageBytes();
}
