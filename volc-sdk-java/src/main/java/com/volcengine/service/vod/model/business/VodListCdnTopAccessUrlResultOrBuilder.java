// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

public interface VodListCdnTopAccessUrlResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodListCdnTopAccessUrlResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * TopURL查询得到的数据明细以及全部域名的汇总值
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnTopAccessUrlElement UrlInfos = 1;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement> 
      getUrlInfosList();
  /**
   * <pre>
   * TopURL查询得到的数据明细以及全部域名的汇总值
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnTopAccessUrlElement UrlInfos = 1;</code>
   */
  com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElement getUrlInfos(int index);
  /**
   * <pre>
   * TopURL查询得到的数据明细以及全部域名的汇总值
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnTopAccessUrlElement UrlInfos = 1;</code>
   */
  int getUrlInfosCount();
  /**
   * <pre>
   * TopURL查询得到的数据明细以及全部域名的汇总值
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnTopAccessUrlElement UrlInfos = 1;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElementOrBuilder> 
      getUrlInfosOrBuilderList();
  /**
   * <pre>
   * TopURL查询得到的数据明细以及全部域名的汇总值
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodCdnTopAccessUrlElement UrlInfos = 1;</code>
   */
  com.volcengine.service.vod.model.business.VodCdnTopAccessUrlElementOrBuilder getUrlInfosOrBuilder(
      int index);
}
