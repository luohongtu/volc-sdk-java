// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_common.proto

package com.volcengine.service.vod.model.business;

public final class VodCommon {
  private VodCommon() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodSourceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodSourceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodAudioStreamMeta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodAudioStreamMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodVideoStreamMeta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodVideoStreamMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodTranscodeInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodTranscodeInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodAdaptiveInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodAdaptiveInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodPlayInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodPlayInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodThumbInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodThumbInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodSubtitleInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodSubtitleInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodCommonConfigInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodCommonConfigInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodPlayInfoModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodPlayInfoModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodPoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035vod/business/vod_common.proto\022\036Volceng" +
      "ine.Vod.Models.Business\"\364\001\n\rVodSourceInf" +
      "o\022\016\n\006FileId\030\001 \001(\t\022\013\n\003Md5\030\002 \001(\t\022\020\n\010FileTy" +
      "pe\030\003 \001(\t\022\r\n\005Codec\030\004 \001(\t\022\016\n\006Height\030\005 \001(\005\022" +
      "\r\n\005Width\030\006 \001(\005\022\016\n\006Format\030\007 \001(\t\022\020\n\010Durati" +
      "on\030\010 \001(\002\022\014\n\004Size\030\t \001(\001\022\020\n\010StoreUri\030\n \001(\t" +
      "\022\022\n\nDefinition\030\013 \001(\t\022\017\n\007Bitrate\030\014 \001(\005\022\013\n" +
      "\003Fps\030\r \001(\002\022\022\n\nCreateTime\030\016 \001(\t\"Z\n\022VodAud" +
      "ioStreamMeta\022\r\n\005Codec\030\001 \001(\t\022\020\n\010Duration\030" +
      "\002 \001(\002\022\022\n\nSampleRate\030\003 \001(\005\022\017\n\007Bitrate\030\004 \001" +
      "(\005\"\206\001\n\022VodVideoStreamMeta\022\r\n\005Codec\030\001 \001(\t" +
      "\022\016\n\006Height\030\002 \001(\005\022\r\n\005Width\030\003 \001(\005\022\020\n\010Durat" +
      "ion\030\004 \001(\002\022\022\n\nDefinition\030\005 \001(\t\022\017\n\007Bitrate" +
      "\030\006 \001(\005\022\013\n\003Fps\030\007 \001(\002\"\324\002\n\020VodTranscodeInfo" +
      "\022\016\n\006FileId\030\001 \001(\t\022\013\n\003Md5\030\002 \001(\t\022\020\n\010FileTyp" +
      "e\030\003 \001(\t\022\020\n\010LogoType\030\004 \001(\t\022\017\n\007Encrypt\030\005 \001" +
      "(\010\022\016\n\006Format\030\006 \001(\t\022\020\n\010Duration\030\007 \001(\002\022\014\n\004" +
      "Size\030\010 \001(\001\022\020\n\010StoreUri\030\t \001(\t\022K\n\017VideoStr" +
      "eamMeta\030\n \001(\01322.Volcengine.Vod.Models.Bu" +
      "siness.VodVideoStreamMeta\022K\n\017AudioStream" +
      "Meta\030\013 \001(\01322.Volcengine.Vod.Models.Busin" +
      "ess.VodAudioStreamMeta\022\022\n\nCreateTime\030\014 \001" +
      "(\t\"S\n\017VodAdaptiveInfo\022\023\n\013MainPlayUrl\030\001 \001" +
      "(\t\022\025\n\rBackupPlayUrl\030\002 \001(\t\022\024\n\014AdaptiveTyp" +
      "e\030\003 \001(\t\"\367\002\n\013VodPlayInfo\022\016\n\006FileId\030\001 \001(\t\022" +
      "\013\n\003Md5\030\002 \001(\t\022\020\n\010FileType\030\003 \001(\t\022\016\n\006Format" +
      "\030\004 \001(\t\022\r\n\005Codec\030\005 \001(\t\022\022\n\nDefinition\030\006 \001(" +
      "\t\022\023\n\013MainPlayUrl\030\007 \001(\t\022\025\n\rBackupPlayUrl\030" +
      "\010 \001(\t\022\017\n\007Bitrate\030\t \001(\005\022\r\n\005Width\030\n \001(\005\022\016\n" +
      "\006Height\030\013 \001(\005\022\014\n\004Size\030\014 \001(\001\022\021\n\tCheckInfo" +
      "\030\r \001(\t\022\022\n\nIndexRange\030\016 \001(\t\022\021\n\tInitRange\030" +
      "\017 \001(\t\022\020\n\010PlayAuth\030\020 \001(\t\022\022\n\nPlayAuthId\030\021 " +
      "\001(\t\022\020\n\010LogoType\030\022 \001(\t\022\017\n\007Quality\030\023 \001(\t\022\031" +
      "\n\021BarrageMaskOffset\030\024 \001(\t\"\240\001\n\014VodThumbIn" +
      "fo\022\022\n\nCaptureNum\030\001 \001(\005\022\021\n\tStoreUrls\030\002 \003(" +
      "\t\022\021\n\tCellWidth\030\003 \001(\005\022\022\n\nCellHeight\030\004 \001(\005" +
      "\022\017\n\007ImgXLen\030\005 \001(\005\022\017\n\007ImgYLen\030\006 \001(\005\022\020\n\010In" +
      "terval\030\007 \001(\001\022\016\n\006Format\030\010 \001(\t\"\200\002\n\017VodSubt" +
      "itleInfo\022\013\n\003Vid\030\001 \001(\t\022\016\n\006FileId\030\002 \001(\t\022\020\n" +
      "\010Language\030\003 \001(\t\022\022\n\nLanguageId\030\004 \001(\005\022\016\n\006F" +
      "ormat\030\005 \001(\t\022\022\n\nSubtitleId\030\006 \001(\t\022\r\n\005Title" +
      "\030\007 \001(\t\022\013\n\003Tag\030\010 \001(\t\022\016\n\006Status\030\t \001(\t\022\016\n\006S" +
      "ource\030\n \001(\t\022\020\n\010StoreUri\030\013 \001(\t\022\023\n\013Subtitl" +
      "eUrl\030\014 \001(\t\022\022\n\nCreateTime\030\r \001(\t\022\017\n\007Versio" +
      "n\030\016 \001(\t\"A\n\023VodCommonConfigInfo\022\016\n\006Module" +
      "\030\001 \001(\t\022\013\n\003Key\030\002 \001(\t\022\r\n\005Value\030\003 \001(\t\"\216\004\n\020V" +
      "odPlayInfoModel\022H\n\007Version\030\n \001(\01627.Volce" +
      "ngine.Vod.Models.Business.VodPlayInfoMod" +
      "elVersion\022\013\n\003Vid\030\001 \001(\t\022\016\n\006Status\030\002 \001(\005\022\021" +
      "\n\tPosterUrl\030\003 \001(\t\022\020\n\010Duration\030\004 \001(\002\022\020\n\010F" +
      "ileType\030\005 \001(\t\022\026\n\016EnableAdaptive\030\006 \001(\010\022\022\n" +
      "\nTotalCount\030\007 \001(\005\022E\n\014AdaptiveInfo\030\010 \001(\0132" +
      "/.Volcengine.Vod.Models.Business.VodAdap" +
      "tiveInfo\022A\n\014PlayInfoList\030\t \003(\0132+.Volceng" +
      "ine.Vod.Models.Business.VodPlayInfo\022C\n\rT" +
      "humbInfoList\030\013 \003(\0132,.Volcengine.Vod.Mode" +
      "ls.Business.VodThumbInfo\022\026\n\016BarrageMaskU" +
      "rl\030\014 \001(\t\022I\n\020SubtitleInfoList\030\r \003(\0132/.Vol" +
      "cengine.Vod.Models.Business.VodSubtitleI" +
      "nfo\",\n\010VodPoint\022\021\n\tTimestamp\030\001 \001(\001\022\r\n\005Va" +
      "lue\030\002 \001(\001*\326\001\n\027VodPlayInfoModelVersion\022$\n" +
      " UndefinedVodPlayInfoModelVersion\020\000\022%\n!I" +
      "nternalV1VodPlayInfoModelVersion\020\001\022%\n!In" +
      "ternalV2VodPlayInfoModelVersion\020\002\022%\n!Int" +
      "ernalV3VodPlayInfoModelVersion\020\003\022 \n\034ToBV" +
      "1VodPlayInfoModelVersion\020\004B\315\001\n)com.volce" +
      "ngine.service.vod.model.businessB\tVodCom" +
      "monP\001ZAgithub.com/volcengine/volc-sdk-go" +
      "lang/service/vod/models/business\240\001\001\330\001\001\302\002" +
      "\000\312\002 Volc\\Service\\Vod\\Models\\Business\342\002#V" +
      "olc\\Service\\Vod\\Models\\GPBMetadatab\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Volcengine_Vod_Models_Business_VodSourceInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Volcengine_Vod_Models_Business_VodSourceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodSourceInfo_descriptor,
        new java.lang.String[] { "FileId", "Md5", "FileType", "Codec", "Height", "Width", "Format", "Duration", "Size", "StoreUri", "Definition", "Bitrate", "Fps", "CreateTime", });
    internal_static_Volcengine_Vod_Models_Business_VodAudioStreamMeta_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Volcengine_Vod_Models_Business_VodAudioStreamMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodAudioStreamMeta_descriptor,
        new java.lang.String[] { "Codec", "Duration", "SampleRate", "Bitrate", });
    internal_static_Volcengine_Vod_Models_Business_VodVideoStreamMeta_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Volcengine_Vod_Models_Business_VodVideoStreamMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodVideoStreamMeta_descriptor,
        new java.lang.String[] { "Codec", "Height", "Width", "Duration", "Definition", "Bitrate", "Fps", });
    internal_static_Volcengine_Vod_Models_Business_VodTranscodeInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Volcengine_Vod_Models_Business_VodTranscodeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodTranscodeInfo_descriptor,
        new java.lang.String[] { "FileId", "Md5", "FileType", "LogoType", "Encrypt", "Format", "Duration", "Size", "StoreUri", "VideoStreamMeta", "AudioStreamMeta", "CreateTime", });
    internal_static_Volcengine_Vod_Models_Business_VodAdaptiveInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Volcengine_Vod_Models_Business_VodAdaptiveInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodAdaptiveInfo_descriptor,
        new java.lang.String[] { "MainPlayUrl", "BackupPlayUrl", "AdaptiveType", });
    internal_static_Volcengine_Vod_Models_Business_VodPlayInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Volcengine_Vod_Models_Business_VodPlayInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodPlayInfo_descriptor,
        new java.lang.String[] { "FileId", "Md5", "FileType", "Format", "Codec", "Definition", "MainPlayUrl", "BackupPlayUrl", "Bitrate", "Width", "Height", "Size", "CheckInfo", "IndexRange", "InitRange", "PlayAuth", "PlayAuthId", "LogoType", "Quality", "BarrageMaskOffset", });
    internal_static_Volcengine_Vod_Models_Business_VodThumbInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Volcengine_Vod_Models_Business_VodThumbInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodThumbInfo_descriptor,
        new java.lang.String[] { "CaptureNum", "StoreUrls", "CellWidth", "CellHeight", "ImgXLen", "ImgYLen", "Interval", "Format", });
    internal_static_Volcengine_Vod_Models_Business_VodSubtitleInfo_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_Volcengine_Vod_Models_Business_VodSubtitleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodSubtitleInfo_descriptor,
        new java.lang.String[] { "Vid", "FileId", "Language", "LanguageId", "Format", "SubtitleId", "Title", "Tag", "Status", "Source", "StoreUri", "SubtitleUrl", "CreateTime", "Version", });
    internal_static_Volcengine_Vod_Models_Business_VodCommonConfigInfo_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_Volcengine_Vod_Models_Business_VodCommonConfigInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodCommonConfigInfo_descriptor,
        new java.lang.String[] { "Module", "Key", "Value", });
    internal_static_Volcengine_Vod_Models_Business_VodPlayInfoModel_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_Volcengine_Vod_Models_Business_VodPlayInfoModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodPlayInfoModel_descriptor,
        new java.lang.String[] { "Version", "Vid", "Status", "PosterUrl", "Duration", "FileType", "EnableAdaptive", "TotalCount", "AdaptiveInfo", "PlayInfoList", "ThumbInfoList", "BarrageMaskUrl", "SubtitleInfoList", });
    internal_static_Volcengine_Vod_Models_Business_VodPoint_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_Volcengine_Vod_Models_Business_VodPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodPoint_descriptor,
        new java.lang.String[] { "Timestamp", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
