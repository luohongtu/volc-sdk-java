package com.volcengine.helper;

public class Const {

    public static final String ACCESS_KEY = "VOLC_ACCESSKEY";
    public static final String SECRET_KEY = "VOLC_SECRETKEY";

    public static final String REGION_CN_NORTH_1 = "cn-north-1";
    public static final String REGION_AP_SINGAPORE_1 = "ap-singapore-1";
    public static final String REGION_US_EASE_1 = "us-east-1";

    public static final String TIME_FORMAT_V4 = "yyyyMMdd'T'HHmmss'Z'";

    public static final String CONNECTION_TIMEOUT = "ConnectionTimeout";
    public static final String SOCKET_TIMEOUT = "SocketTimeout";
    public static final String Scheme = "Scheme";
    public static final String Host = "Host";
    public static final String Header = "Header";
    public static final String Credentials = "Credentials";

    public static final String Method = "Method";
    public static final String Path = "Path";
    public static final String Query = "Query";
    public static final String Form = "Form";

    // iam
    public static final String CreateUser = "CreateUser";
    public static final String DeleteUser = "DeleteUser";
    public static final String ListUsers = "ListUsers";
    public static final String CreateRole = "CreateRole";
    public static final String GetRole = "GetRole";
    public static final String UpdateRole = "UpdateRole";
    public static final String ListRoles = "ListRoles";
    public static final String DeleteRole = "DeleteRole";

    // billing
    public static final String ListBill = "ListBill";
    public static final String ListBillDetail = "ListBillDetail";
    public static final String ListBillOverviewByProd = "ListBillOverviewByProd";


    // sts
    public static final String AssumeRole = "AssumeRole";

    // ad blocker
    public static final String AdBlock = "AdBlock";
    // game protect
    public static final String GameProtect = "GameProtect";
    // business security
    public static final String RiskDetection = "RiskDetection";
    public static final String AsyncRiskDetection = "AsyncRiskDetection";
    public static final String RiskResult = "RiskResult";
    public static final String DataReport = "DataReport";
    public static final String AccountRisk = "AccountRisk";
    public static final String MobileStatus = "MobileStatus";
    public static final String ElementVerify = "ElementVerify";
    public static final String MobileStatusV2 = "MobileStatusV2";
    public static final String ElementVerifyV2 = "ElementVerifyV2";

    // content security
    public static final String ImageContentRisk = "ImageContentRisk";
    public static final String AsyncImageRisk = "AsyncImageRisk";
    public static final String VideoResult = "VideoResult";
    public static final String GetImageResult = "GetImageResult";
    public static final String AsyncVideoRisk = "AsyncVideoRisk";
    public static final String TextRisk = "TextRisk";
    public static final String CreateCustomContents = "CreateCustomContents";
    public static final String UploadCustomContents = "UploadCustomContents";
    public static final String GetAudioResult = "GetAudioResult";
    public static final String AsyncAudioRisk = "AsyncAudioRisk";
    public static final String GetVideoLiveResult = "GetVideoLiveResult";
    public static final String AsyncLiveVideoRisk = "AsyncLiveVideoRisk";
    public static final String GetAudioLiveResult = "GetAudioLiveResult";
    public static final String AsyncLiveAudioRisk = "AsyncLiveAudioRisk";
    public static final String TextSliceRisk = "TextSliceRisk";

    // livesaas

    //创建直播间
    public static final String CreateActivityAPI = "CreateActivityAPI";
    //查询直播间
    public static final String GetActivityAPI = "GetActivityAPI";
    //获取直播流
    public static final String GetStreamsAPI = "GetStreamsAPI";
    //获取广告数据
    public static final String GetAdvertisementDataAPI = "GetAdvertisementDataAPI";
    //获取真实在线人数
    public static final String GetRealTimeOnlineNumberAPI = "GetRealTimeOnlineNumberAPI";
    //删除直播间
    public static final String DeleteActivityAPI = "DeleteActivityAPI";
    //获取直播间基本信息与配置
    public static final String UpdateActivityBasicConfigAPI = "UpdateActivityBasicConfigAPI";
    //更新直播间基本信息与配置
    public static final String GetActivityBasicConfigAPI = "GetActivityBasicConfigAPI";
    //图片视频上传
    public static final String UploadLibAPI = "UploadLibAPI";
    //获取菜单栏
    public static final String GetActivityMenuAPI = "GetActivityMenuAPI";
    //更新菜单栏
    public static final String UpdateActivityMenuAPI = "UpdateActivityMenuAPI";
    //获取菜单栏商品
    public static final String GetActivityProductAPI = "GetActivityProductAPI";
    //更新菜单栏商品
    public static final String UpdateActivityProductAPI = "UpdateActivityProductAPI";
    //获取直播间列表的详细状态信息
    public static final String ListActivityDetailStatusAPI = "ListActivityDetailStatusAPI";

    // translate
    public static final String LangDetect = "LangDetect";
    public static final String TranslateText = "TranslateText";
    public static final String TranslateImage = "TranslateImage";
    public static final String TranslateAudioSubmit = "SubmitAudio";
    public static final String TranslateAudioQuery = "QueryAudio";

    //sign
    public static final String XDate = "X-Date";
    public static final String XNotSignBody = "X-NotSignBody";
    public static final String XCredential = "X-Credential";
    public static final String XAlgorithm = "X-Algorithm";
    public static final String XSignedHeaders = "X-SignedHeaders";
    public static final String XSignedQueries = "X-SignedQueries";
    public static final String XSignature = "X-Signature";

    public static final String ContentType = "Content-Type";
    public static final String ContentTypeValue = "application/x-www-form-urlencoded; charset=utf-8";
    public static final String XContentSha256 = "X-Content-Sha256";
    public static final String Authorization = "Authorization";
    public static final String XSecurityToken = "X-Security-Token";

    public static final String ContentMd5 = "Content-Md5";

    public static final String ListRooms = "ListRooms";
    public static final String ListIndicators = "ListIndicators";

    // cms
    public static final String BatchCreateSourceArticle = "BatchCreateSourceArticle";
    public static final String GetArticleBatchUploadDetail = "GetArticleBatchUploadDetail";
    public static final String DeleteSourceArticle = "DeleteSourceArticle";
    public static final String DeleteSourceArticleByOpenid = "DeleteSourceArticleByOpenid";
    public static final String ArticleEventNotify = "ArticleEventNotify";
    public static final String Feed = "Feed";
    public static final String GetVideoByVid = "GetVideoByVid";
    public static final String MGetVideoByVids = "MGetVideoByVids";
    public static final String GetGoodsRelatedArticles = "GetGoodsRelatedArticles";
    public static final String MGetGoodsRelatedArticles = "MGetGoodsRelatedArticles";
    public static final String CmsSearch = "Search";
    public static final String RelatedFeed = "RelatedFeed";

    // stream
    public static final String WapRegister = "WapRegister";
    public static final String ContentStream = "ContentStream";
    public static final String Digg = "Digg";
    public static final String Bury = "Bury";
    public static final String UnDigg = "UnDigg";
    public static final String UnBury = "UnBury";
    public static final String SingleArticleInfo = "SingleArticleInfo";
    public static final String MultiArticleInfo = "MultiArticleInfo";
    public static final String DislikeLog = "DislikeLog";
    public static final String VideoPlayDrawLog = "VideoPlayDrawLog";
    public static final String VideoOverDrawLog = "VideoOverDrawLog";
    public static final String ProductShowLog = "ProductShowLog";
    public static final String PushLog = "PushLog";
    public static final String ProductClickLog = "ProductClickLog";
    public static final String VideoPlayAutoLog = "VideoPlayAutoLog";
    public static final String VideoOverAutoLog = "VideoOverAutoLog";
    public static final String Feedback = "Feedback";
    public static final String Follow = "Follow";
    public static final String Unfollow = "Unfollow";
    public static final String CheckRelation = "CheckRelation";
    public static final String FollowingList = "FollowingList";
    public static final String RefreshTips = "RefreshTips";
    public static final String FollowArticles = "FollowArticles";
    public static final String RecommendRelatedUser = "RecommendRelatedUser";
    public static final String RecommendCategoryUser = "RecommendCategoryUser";
    public static final String RecommendCategoryInfo = "RecommendCategoryInfo";
    public static final String RelatedArticle = "RelatedArticle";
    public static final String ClickLog = "ClickLog";
    public static final String StayLog = "StayLog";
    public static final String VideoPlayLog = "VideoPlayLog";
    public static final String VideoOverLog = "VideoOverLog";
    public static final String SingleShowLog = "SingleShowLog";
    public static final String MultiShowLog = "MultiShowLog";
    public static final String ShareLog = "ShareLog";
    public static final String FavouriteLog = "FavouriteLog";
    public static final String VerifyLog = "VerifyLog";
    public static final String FollowLog = "FollowLog";
    public static final String UnfollowLog = "UnfollowLog";
    public static final String FollowCardLog = "FollowCardLog";
    public static final String DiggList = "DiggList";
    public static final String VideoUrl = "VideoUrl";
    public static final String UnionProduct = "UnionProduct";
    public static final String HotBoard = "HotBoard";
    public static final String SdkMonitor = "SdkMonitor";
    //new
    public static final String FollowAction = "FollowAction";
    public static final String UnfollowAction = "UnfollowAction";
    public static final String FollowList = "FollowList";
    public static final String FollowCheck = "FollowCheck";
    public static final String SingleArticle = "SingleArticle";
    public static final String MultiArticle = "MultiArticle";
    public static final String ContentVersion = "2021-01-01";

    //live
    public static final String LiveSDKVersion = "2020-08-01";
    public static final String ListCommonTransPresetDetail = "ListCommonTransPresetDetail";
    public static final String UpdateCallback = "UpdateCallback";
    public static final String DescribeCallback = "DescribeCallback";
    public static final String DeleteCallback = "DeleteCallback";
    public static final String CreateDomain = "CreateDomain";
    public static final String DeleteDomain = "DeleteDomain";
    public static final String ListDomainDetail = "ListDomainDetail";
    public static final String DescribeDomain = "DescribeDomain";
    public static final String EnableDomain = "EnableDomain";
    public static final String DisableDomain = "DisableDomain";
    public static final String ManagerPullPushDomainBind = "ManagerPullPushDomainBind";
    public static final String UpdateAuthKey = "UpdateAuthKey";
    public static final String EnableAuth = "EnableAuth";
    public static final String DisableAuth = "DisableAuth";
    public static final String DescribeAuth = "DescribeAuth";
    public static final String ForbidStream = "ForbidStream";
    public static final String ResumeStream = "ResumeStream";
    public static final String ListCert = "ListCert";
    public static final String CreateCert = "CreateCert";
    public static final String DescribeCertDetailSecret = "DescribeCertDetailSecret";
    public static final String UpdateCert = "UpdateCert";
    public static final String BindCert = "BindCert";
    public static final String UnbindCert = "UnbindCert";
    public static final String DeleteCert = "DeleteCert";
    public static final String UpdateReferer = "UpdateReferer";
    public static final String DeleteReferer = "DeleteReferer";
    public static final String DescribeReferer = "DescribeReferer";
    public static final String CreateRecordPreset = "CreateRecordPreset";
    public static final String UpdateRecordPreset = "UpdateRecordPreset";
    public static final String DeleteRecordPreset = "DeleteRecordPreset";
    public static final String ListVhostRecordPreset = "ListVhostRecordPreset";
    public static final String CreateTranscodePreset = "CreateTranscodePreset";
    public static final String UpdateTranscodePreset = "UpdateTranscodePreset";
    public static final String DeleteTranscodePreset = "DeleteTranscodePreset";
    public static final String ListVhostTransCodePreset = "ListVhostTransCodePreset";
    public static final String CreateSnapshotPreset = "CreateSnapshotPreset";
    public static final String UpdateSnapshotPreset = "UpdateSnapshotPreset";
    public static final String DeleteSnapshotPreset = "DeleteSnapshotPreset";
    public static final String ListVhostSnapshotPreset = "ListVhostSnapshotPreset";
    public static final String DescribeLiveBandwidthData = "DescribeLiveBandwidthData";
    public static final String DescribeLiveTrafficData = "DescribeLiveTrafficData";
    public static final String DescribeLiveP95PeakBandwidthData = "DescribeLiveP95PeakBandwidthData";
    public static final String DescribeTranscodeData = "DescribeTranscodeData";
    public static final String DescribeSnapshotData = "DescribeSnapshotData";
    public static final String DescribeRecordData = "DescribeRecordData";
    public static final String DescribeLiveTimeShiftData = "DescribeLiveTimeShiftData";
    public static final String DescribePushStreamMetrics = "DescribePushStreamMetrics";
    public static final String DescribeLiveStreamSessions = "DescribeLiveStreamSessions";
    public static final String DescribePlayResponseStatusStat = "DescribePlayResponseStatusStat";
    public static final String DescribeLiveDomainLog = "DescribeLiveDomainLog";
    public static final String DescribeLiveMetricTrafficData = "DescribeLiveMetricTrafficData";
    public static final String DescribeLiveMetricBandwidthData = "DescribeLiveMetricBandwidthData";
    public static final String DescribePlayStreamList = "DescribePlayStreamList";
    public static final String DescribePullToPushBandwidthData = "DescribePullToPushBandwidthData";
    public static final String CreateSnapshotAuditPreset = "CreateSnapshotAuditPreset";
    public static final String UpdateSnapshotAuditPreset = "UpdateSnapshotAuditPreset";
    public static final String DeleteSnapshotAuditPreset = "DeleteSnapshotAuditPreset";
    public static final String ListVhostSnapshotAuditPreset = "ListVhostSnapshotAuditPreset";
    public static final String DescribeLiveAuditData = "DescribeLiveAuditData";
    public static final String DescribeCDNSnapshotHistory = "DescribeCDNSnapshotHistory";
    public static final String DescribeRecordTaskFileHistory = "DescribeRecordTaskFileHistory";
    public static final String DescribeLiveStreamInfoByPage = "DescribeLiveStreamInfoByPage";
    public static final String KillStream = "KillStream";
    public static final String DescribeClosedStreamInfoByPage = "DescribeClosedStreamInfoByPage";
    public static final String DescribeLiveStreamState = "DescribeLiveStreamState";
    public static final String DescribeForbiddenStreamInfoByPage = "DescribeForbiddenStreamInfoByPage";
    public static final String UpdateRelaySourceV2 = "UpdateRelaySourceV2";
    public static final String DeleteRelaySourceV2 = "DeleteRelaySourceV2";
    public static final String DescribeRelaySourceV2 = "DescribeRelaySourceV2";
    public static final String CreateVQScoreTask = "CreateVQScoreTask";
    public static final String DescribeVQScoreTask = "DescribeVQScoreTask";
    public static final String ListVQScoreTask = "ListVQScoreTask";
    public static final String GeneratePlayURL = "GeneratePlayURL";
    public static final String GeneratePushURL = "GeneratePushURL";
    public static final String CreatePullToPushTask = "CreatePullToPushTask";
    public static final String ListPullToPushTask = "ListPullToPushTask";
    public static final String UpdatePullToPushTask = "UpdatePullToPushTask";
    public static final String StopPullToPushTask = "StopPullToPushTask";
    public static final String RestartPullToPushTask = "RestartPullToPushTask";
    public static final String DeletePullToPushTask = "DeletePullToPushTask";
    public static final String UpdateDenyConfig = "UpdateDenyConfig";
    public static final String DescribeDenyConfig = "DescribeDenyConfig";
    public static final String DeleteDenyConfig = "DeleteDenyConfig";

    //kms
    public static final String CreateKeyring = "CreateKeyring";
    public static final String DescribeKeyrings = "DescribeKeyrings";
    public static final String UpdateKeyring = "UpdateKeyring";
    public static final String QueryKeyring = "QueryKeyring";
    public static final String CreateKey = "CreateKey";
    public static final String DescribeKeys = "DescribeKeys";
    public static final String UpdateKey = "UpdateKey";
    public static final String GenerateDataKey = "GenerateDataKey";
    public static final String Encrypt = "Encrypt";
    public static final String Decrypt = "Decrypt";
    public static final String EnableKey = "EnableKey";
    public static final String DisableKey = "DisableKey";
    public static final String ScheduleKeyDeletion = "ScheduleKeyDeletion";
    public static final String CancelKeyDeletion = "CancelKeyDeletion";
    public static final String KmsServiceVersion = "2021-02-18";


    //video_aiot
    public static final String VideoAIoTSDKVersion = "2021-01-01";
    public static final String AIoTVideoCreateSpace = "CreateSpace";
    public static final String AIoTVideoDeleteSpace = "DeleteSpace";
    public static final String AIoTVideoGetSpace = "GetSpace";
    public static final String AIoTVideoListSpace = "ListSpaces";
    public static final String AIoTVideoUpdateSpace = "UpdateSpace";
    public static final String AIoTVideoStartSpace = "StartSpace";
    public static final String AIoTVideoStopSpace = "StopSpace";

    //template
    public static final String VideoAIoTCreateRecordTemplate = "CreateRecordTemplate";
    public static final String VideoAIoTDeleteRecordTemplate = "DeleteRecordTemplate";
    public static final String AIoTVideoGetDataProjectWithBindWidthAndFlow = "GetDataProjectWithBindWidthAndFlow";

    public static final String AIoTVideoGetTotalData = "GetTotalData";

    public static final String AIoTVideoSetSpaceTemplate = "SetSpaceTemplate";
    public static final String AIoTVideoGetSpaceTemplate = "GetSpaceTemplate";
    public static final String AIoTVideoCancelBindTemplate = "CancelBindTemplate";

    public static final String AIoTVideoUpdateAuthInSpace = "UpdateAuthInSpace";

    public static final String AIoTVideoDisableAuthInSpace = "DisableAuthInSpace";
    public static final String AIoTVideoCreateDevice = "CreateDevice";
    public static final String AIoTVideoStartDevice = "StartDevice";
    public static final String AIoTVideoStopDevice = "StopDevice";
    public static final String AIoTVideoListDevice = "ListDevices";
    public static final String AIoTVideoUpdateDevice = "UpdateDevice";
    public static final String AIoTVideoFreshDevice = "FreshDevice";
    public static final String AIoTVideoDeleteDevice = "DeleteDevice";
    public static final String AIoTVideoGetDevice = "GetDevice";
    public static final String AIoTVideoGenSipID = "GenSipID";
    public static final String AIoTVideoGetDeviceChannels = "GetDeviceChannels";

    public static final String AIoTVideoListDeviceScreenshot = "ListDeviceScreenshots";
    public static final String AIoTVideoListDeviceRecords = "ListDeviceRecords";
    public static final String AIoTVideoCloudRecordPlay = "CloudRecordPlay";

    public static final String AIoTVideoLocalMediaDownload = "LocalMediaDownload";

    public static final String AIoTVideoSetAlarmGuard = "SetAlarmGuard";
    public static final String AIoTVideoResetAlarm = "ResetAlarm";

    public static final String AIoTVideoListAlarmNotify = "ListAlarmNotify";

    public static final String AIoTVideoDeleteAlarmNotify = "DeleteAlarmNotify";

    public static final String AIoTVideoDeleteAlarmNotifyAll = "DeleteAlarmNotifyAll";

    public static final String AIoTVideoGetStream = "GetStream";
    public static final String AIoTVideoListStreams = "ListStreams";
    public static final String AIoTVideoStartStream = "StartStream";
    public static final String AIoTVideoStopStream = "StopStream";
    public static final String AIoTVideoUpdateStream = "UpdateStream";

    public static final String AIoTVideoStreamLogs = "StreamLogs";

    public static final String AIoTVideoCreateStream = "CreateStream";
    public static final String AIoTVideoDeleteStream = "DeleteStream";
    public static final String AIoTVideoCreateForward = "CreateForward";
    public static final String AIoTVideoListForward = "ListForward";
    public static final String AIoTVideoGetForward = "GetForward";
    public static final String AIoTVideoStartForward = "StartForward";
    public static final String AIoTVideoStopForward = "StopForward";
    public static final String AIoTVideoDeleteForward = "DeleteForward";
    public static final String AIoTVideoGetStreamData = "GetStreamData";

    public static final String AIoTVideoForbidStream = "ForbidStream";

    public static final String AIoTVideoUnforbidStream = "UnforbidStream";
    public static final String AIoTVideoStartVoiceTalk = "StartVoiceTalk";
    public static final String AIoTVideoStopVoiceTalk = "StopVoiceTalk";

    //request method
    public static final String GET = "GET";
    public static final String DELETE = "DELETE";
    public static final String POST = "POST";
    public static final String PUT = "PUT";

    public static final String HTTP = "http";
    public static final String HTTPS = "https";
    public static final String ACCEPT = "Accept";
    public static final String ACCEPT_ALL = "*/*";
    public static final String ACCEPT_ENCODING = "Accept-Encoding";
    public static final String GZIP_DEFLATE_BR = "gzip, deflate, br";
    public static final String SERVICE_NAME = "ServiceName";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_X_PROTOBUF = "application/x-protobuf";

    // visual
    public static final String SkySegment = "SkySegment";
    public static final String HumanSegment = "HumanSegment";
    public static final String GeneralSegment = "GeneralSegment";
    public static final String CarDetection = "CarDetection";
    public static final String CarSegment = "CarSegment";
    public static final String CarPlateDetection = "CarPlateDetection";
    public static final String PoemMaterial = "PoemMaterial";
    public static final String ImageFlow = "ImageFlow";
    public static final String ImageScore = "ImageScore";
    public static final String FaceSwap = "FaceSwap";
    public static final String JPCartoon = "JPCartoon";
    public static final String EyeClose2Open = "EyeClose2Open";
    public static final String EmoticonEdit = "EmoticonEdit";
    public static final String StretchRecovery = "StretchRecovery";
    public static final String DistortionFree = "DistortionFree";
    public static final String EnhancePhoto = "EnhancePhoto";
    public static final String ConvertPhoto = "ConvertPhoto";
    public static final String OCRNormal = "OCRNormal";
    public static final String BankCard = "BankCard";
    public static final String IDCard = "IDCard";
    public static final String DrivingLicense = "DrivingLicense";
    public static final String VehicleLicense = "VehicleLicense";
    public static final String VatInvoice = "OcrVatInvoice";
    public static final String MultilangOCR = "MultiLanguageOCR";

    // cloudtrail
    public static final String LookupEvents = "LookupEvents";
}
