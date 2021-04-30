
// Code generated by protoc-gen-volcengine-sdk
// source: vod/service/service_vod.proto
// DO NOT EDIT!

package com.volcengine.service.vod;

/**
 * The interface Vod service.
 */
public interface IVodService extends com.volcengine.service.IBaseService {
     
    /**
     * Gets hls auth token.
     *
     * @param expireSeconds the params
     * @return the hls auth token
     * @throws Exception the exception
     */
    String createSha1HlsDrmAuthToken(Long expireSeconds) throws Exception;
	
    /**
     * Gets play auth token.
     *
     * @param input the params
     * @return the play auth token
     * @throws Exception the exception
     */
    String getPlayAuthToken(com.volcengine.model.vod.request.VodGetPlayInfoRequest input, Long expireSeconds) throws Exception;

    /**
     * Get Upload Sts2 token.
     *
     * @return com.volcengine.model.sts2.SecurityToken2
     * @throws Exception the exception
     */
    com.volcengine.model.sts2.SecurityToken2 getUploadSts2() throws Exception;

    /**
     * Get Upload Sts2 token with expired time.
     *
     * @param expire long
     * @return com.volcengine.model.sts2.SecurityToken2
     * @throws Exception the exception
     */
    com.volcengine.model.sts2.SecurityToken2 getUploadSts2WithExpire(long expire) throws Exception;

    /**
     * uploadMedia
     *
     * @param vodUploadMediaRequest com.volcengine.model.vod.request.VodUploadMediaRequest
     * @return com.volcengine.model.vod.response.VodCommitUploadInfoResponse
     * @throws Exception the exception
     */
    com.volcengine.model.vod.response.VodCommitUploadInfoResponse uploadMedia(com.volcengine.model.vod.request.VodUploadMediaRequest vodUploadMediaRequest) throws Exception;


	/**
     * getPlayInfo.
     *
     * @param input com.volcengine.model.vod.request.VodGetPlayInfoRequest
     * @return com.volcengine.model.vod.response.VodGetPlayInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.model.vod.response.VodGetPlayInfoResponse getPlayInfo(com.volcengine.model.vod.request.VodGetPlayInfoRequest input) throws Exception;
	
	/**
     * getPrivateDrmPlayAuth.
     *
     * @param input com.volcengine.model.vod.request.VodGetPrivateDrmPlayAuthRequest
     * @return com.volcengine.model.vod.response.VodGetPrivateDrmPlayAuthResponse
     * @throws Exception the exception
     */
	com.volcengine.model.vod.response.VodGetPrivateDrmPlayAuthResponse getPrivateDrmPlayAuth(com.volcengine.model.vod.request.VodGetPrivateDrmPlayAuthRequest input) throws Exception;
	
	/**
     * getHlsDecryptionKey.
     *
     * @param input com.volcengine.model.vod.request.VodGetHlsDecryptionKeyRequest
     * @return com.volcengine.model.vod.response.VodGetHlsDecryptionKeyResponse
     * @throws Exception the exception
     */
	com.volcengine.model.vod.response.VodGetHlsDecryptionKeyResponse getHlsDecryptionKey(com.volcengine.model.vod.request.VodGetHlsDecryptionKeyRequest input) throws Exception;
	
	/**
     * uploadMediaByUrl.
     *
     * @param input com.volcengine.model.vod.request.VodUrlUploadRequest
     * @return com.volcengine.model.vod.response.VodUrlUploadResponse
     * @throws Exception the exception
     */
	com.volcengine.model.vod.response.VodUrlUploadResponse uploadMediaByUrl(com.volcengine.model.vod.request.VodUrlUploadRequest input) throws Exception;
	
	/**
     * queryUploadTaskInfo.
     *
     * @param input com.volcengine.model.vod.request.VodQueryUploadTaskInfoRequest
     * @return com.volcengine.model.vod.response.VodQueryUploadTaskInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.model.vod.response.VodQueryUploadTaskInfoResponse queryUploadTaskInfo(com.volcengine.model.vod.request.VodQueryUploadTaskInfoRequest input) throws Exception;
	
	/**
     * applyUploadInfo.
     *
     * @param input com.volcengine.model.vod.request.VodApplyUploadInfoRequest
     * @return com.volcengine.model.vod.response.VodApplyUploadInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.model.vod.response.VodApplyUploadInfoResponse applyUploadInfo(com.volcengine.model.vod.request.VodApplyUploadInfoRequest input) throws Exception;
	
	/**
     * commitUploadInfo.
     *
     * @param input com.volcengine.model.vod.request.VodCommitUploadInfoRequest
     * @return com.volcengine.model.vod.response.VodCommitUploadInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.model.vod.response.VodCommitUploadInfoResponse commitUploadInfo(com.volcengine.model.vod.request.VodCommitUploadInfoRequest input) throws Exception;
	
	/**
     * updateMediaInfo.
     *
     * @param input com.volcengine.model.vod.request.VodUpdateMediaInfoRequest
     * @return com.volcengine.model.vod.response.VodUpdateMediaInfoResponse
     * @throws Exception the exception
     */
	com.volcengine.model.vod.response.VodUpdateMediaInfoResponse updateMediaInfo(com.volcengine.model.vod.request.VodUpdateMediaInfoRequest input) throws Exception;
	
	/**
     * updateMediaPublishStatus.
     *
     * @param input com.volcengine.model.vod.request.VodUpdateMediaPublishStatusRequest
     * @return com.volcengine.model.vod.response.VodUpdateMediaPublishStatusResponse
     * @throws Exception the exception
     */
	com.volcengine.model.vod.response.VodUpdateMediaPublishStatusResponse updateMediaPublishStatus(com.volcengine.model.vod.request.VodUpdateMediaPublishStatusRequest input) throws Exception;
	
	/**
     * getMediaInfos.
     *
     * @param input com.volcengine.model.vod.request.VodGetMediaInfosRequest
     * @return com.volcengine.model.vod.response.VodGetMediaInfosResponse
     * @throws Exception the exception
     */
	com.volcengine.model.vod.response.VodGetMediaInfosResponse getMediaInfos(com.volcengine.model.vod.request.VodGetMediaInfosRequest input) throws Exception;
	
	/**
     * getRecommendedPoster.
     *
     * @param input com.volcengine.model.vod.request.VodGetRecommendedPosterRequest
     * @return com.volcengine.model.vod.response.VodGetRecommendedPosterResponse
     * @throws Exception the exception
     */
	com.volcengine.model.vod.response.VodGetRecommendedPosterResponse getRecommendedPoster(com.volcengine.model.vod.request.VodGetRecommendedPosterRequest input) throws Exception;
	
	/**
     * deleteMedia.
     *
     * @param input com.volcengine.model.vod.request.VodDeleteMediaRequest
     * @return com.volcengine.model.vod.response.VodDeleteMediaResponse
     * @throws Exception the exception
     */
	com.volcengine.model.vod.response.VodDeleteMediaResponse deleteMedia(com.volcengine.model.vod.request.VodDeleteMediaRequest input) throws Exception;
	
	/**
     * deleteTranscodes.
     *
     * @param input com.volcengine.model.vod.request.VodDeleteTranscodesRequest
     * @return com.volcengine.model.vod.response.VodDeleteTranscodesResponse
     * @throws Exception the exception
     */
	com.volcengine.model.vod.response.VodDeleteTranscodesResponse deleteTranscodes(com.volcengine.model.vod.request.VodDeleteTranscodesRequest input) throws Exception;
	
	/**
     * StartWorkflow.
     *
     * @param input com.volcengine.model.vod.request.VodStartWorkflowRequest
     * @return com.volcengine.model.vod.response.VodStartWorkflowResponse
     * @throws Exception the exception
     */
	com.volcengine.model.vod.response.VodStartWorkflowResponse StartWorkflow(com.volcengine.model.vod.request.VodStartWorkflowRequest input) throws Exception;
	
}  // end of service interface
