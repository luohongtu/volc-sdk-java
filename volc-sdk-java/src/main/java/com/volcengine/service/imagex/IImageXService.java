package com.volcengine.service.imagex;

import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
import com.volcengine.model.sts2.SecurityToken2;
import com.volcengine.service.IBaseService;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * The interface ImageX service.
 */
@SuppressWarnings("unused")
public interface IImageXService extends IBaseService {

    /**
     * Apply upload image.
     *
     * @param applyUploadRequest the apply upload request
     * @return the apply upload response
     * @throws Exception the exception
     */
    ApplyImageUploadResponse applyImageUpload(ApplyImageUploadRequest applyUploadRequest) throws Exception;

    /**
     * Commit upload image.
     *
     * @param commitUploadRequest the commit upload request
     * @return the commit upload response
     * @throws Exception the exception
     */
    CommitImageUploadResponse commitImageUpload(CommitImageUploadRequest commitUploadRequest) throws Exception;

    /**
     * Upload image data.
     *
     * @param request the apply upload request
     * @param imageDatas image data array
     * @return the commit upload response
     * @throws Exception the exception
     */
    CommitImageUploadResponse uploadImages(ApplyImageUploadRequest request, List<byte[]> imageDatas) throws Exception;

    /**
     * Upload image data.
     *
     * @param request upload request
     * @param content image data
     * @param size image size
     * @return the commit upload response
     * @throws Exception the exception
     */
    CommitImageUploadResponse uploadImages(ApplyImageUploadRequest request, List<InputStream> content, List<Long> size) throws Exception;

    /**
     * Get image upload token.
     *
     * @param params the params
     * @return the upload token
     * @throws Exception the exception
     */
    String getUploadToken(Map<String, String> params) throws Exception;

    /**
     * Get image upload sts2 auth with default expire time (1 hour).
     *
     * @param serviceIds service id list allowed to upload image to
     * @return the upload sts2 auth
     * @throws Exception the exception
     */
    SecurityToken2 getUploadSts2(List<String> serviceIds) throws Exception;

    /**
     * Get image upload sts2 auth.
     *
     * @param serviceIds service id list allowed to upload image to
     * @param expire expire time in milliseconds
     * @return the upload sts2 auth
     * @throws Exception the exception
     */
    SecurityToken2 getUploadSts2WithExpire(List<String> serviceIds, long expire) throws Exception;

    /**
     * Get image upload sts2 auth.
     *
     * @param serviceIds service id list allowed to upload image to
     * @param expire expire time in milliseconds
     * @param keyPtn upload store key pattern, * for no restriction. default to empty.
     * @return the upload sts2 auth
     * @throws Exception the exception
     */
    SecurityToken2 getUploadSts2WithKeyPtn(List<String> serviceIds, long expire, String keyPtn) throws Exception;

    /**
     * Delete images.
     *
     * @param req delete image req
     * @return delete image resp
     * @throws Exception the exception
     */
    DeleteImageResp deleteImages(DeleteImageReq req) throws Exception;

    /**
     * Resource a file
     *
     * @param req request args
     * @return file info
     * @throws Exception the exception
     */
    GetImageUploadFileResponse getImageUploadFile(GetImageUploadFileRequest req) throws Exception;

    /**
     * List files
     *
     * @param req request args
     * @return files info
     * @throws Exception the exception
     */
    GetImageUploadFilesResponse getImageUploadFiles(GetImageUploadFilesRequest req) throws Exception;

    /**
     * Update image urls.
     *
     * @param req update image urls req
     * @return udpate image urls resp
     * @throws Exception the exception
     */
    UpdateImageFilesResponse updateImageUrls(UpdateImageFilesRequest req) throws Exception;

    /**
     * Request ImageX api with method GET.
     * @param action api action name
     * @param param api query param
     * @return api response
     * @throws Exception the exception
     */
    CommonResponse getImageX(String action, Map<String, String> param) throws Exception;

    /**
     * Request ImageX api with method POST.
     * @param action api action name
     * @param param api query param
     * @param req api json param
     * @return api response
     * @throws Exception the exception
     */
    CommonResponse postImageX(String action, Map<String, String> param, Object req) throws Exception;

    /**
     * Request ImageX api with method POST.
     * @param param api query param
     * @return api response
     * @throws Exception the exception
     */
    GetImageOCRResponse<?> getImageOCR(GetImageOCRRequest param) throws Exception;

    /**
     * Request ImageX api with method POST.
     * @param req embed image hm request
     * @return image store uri
     * @throws Exception the exception
     */
    EmbedImageHmResponse embedImageHm(EmbedImageHmRequest req) throws Exception;

    /**
     * Request ImageX api with method POST.
     * @param req extract hidden mark from image
     * @return embedded info
     * @throws Exception the exception
     */
    ExtractImageHmResponse extractImageHm(ExtractImageHmRequest req) throws Exception;

    /**
     * Request ImageX api with method POST.
     * @param req get image segment request
     * @return image store uri
     * @throws Exception the exception
     */
    GetImageSegmentResponse getImageSegment(GetImageSegmentRequest req) throws Exception;

    /**
     * Request ImageX api with method GET.
     * @param req get image erase models request
     * @return models array
     * @throws Exception the exception
     */
    GetImageEraseModelsResponse getImageEraseModels(GetImageEraseModelsRequest req) throws Exception;

    /**
     * Request ImageX api with method POST.
     * @param req get image erase result
     * @return image store uri
     * @throws Exception the exception
     */
    GetImageEraseResultResponse getImageEraseResult(GetImageEraseResultRequest req) throws Exception;

    /**
     * Get image quality
     *
     * @param req req request args
     * @return image quality metrics
     * @throws Exception the exception
     */
    GetImageQualityResponse getImageQuality(GetImageQualityRequest req) throws Exception;

    /**
     * Extend image
     *
     * @param req req request args
     * @return extended image
     * @throws Exception the exception
     */
    GetImageBgFillResultResponse getImageBgFillResult(GetImageBgFillResultRequest req) throws Exception;

    /**
     * Detect duplicate image
     *
     * @param req req request args
     * @return detection result
     * @throws Exception the exception
     */
    GetImageDuplicateDetectionSyncResponse getImageDuplicateDetectionSync(GetImageDuplicateDetectionSyncRequest req) throws Exception;

    /**
     * Detect duplicate image
     *
     * @param req req request args
     * @return detection task id
     * @throws Exception the exception
     */
    GetImageDuplicateDetectionAsyncResponse getImageDuplicateDetectionAsync(GetImageDuplicateDetectionAsyncRequest req) throws Exception;

    /**
     * Retrieve duplicate detection task status
     *
     * @param req req request args
     * @return detection status and result
     * @throws Exception the exception
     */
    GetDeduplicateTaskStatusResponse getDeduplicateTaskStatus(GetDeduplicateTaskStatusRequest req) throws Exception;

    /**
     * Noise reduction
     *
     * @param req req request args
     * @return result
     * @throws Exception the exception
     */
    GetDenoisingImageResponse getDenoisingImage(GetDenoisingImageRequest req) throws Exception;

    /**
     * Comicize an image
     *
     * @param req req request args
     * @return result
     * @throws Exception the exception
     */
    GetImageComicResultResponse getImageComicResult(GetImageComicResultRequest req) throws Exception;

    /**
     * Super resolution
     *
     * @param req req request args
     * @return result
     * @throws Exception the exception
     */
    GetImageSuperResolutionResultResponse getImageSuperResolutionResult(GetImageSuperResolutionResultRequest req) throws Exception;

    /**
     * Smart crop
     *
     * @param req req request args
     * @return result
     * @throws Exception the exception
     */
    GetImageSmartCropResultResponse getImageSmartCropResult(GetImageSmartCropResultRequest req) throws Exception;

    /**
     * License plate detection
     *
     * @param req req request args
     * @return result
     * @throws Exception the exception
     */
    GetLicensePlateDetectionResponse getLicensePlateDetection(GetLicensePlateDetectionRequest req) throws Exception;

    /**
     * Image modified detection
     *
     * @param req req request args
     * @return result
     * @throws Exception the exception
     */
    GetImagePSDetectionResponse getImagePSDetection(GetImagePSDetectionRequest req) throws Exception;

    /**
     * Private content detection
     *
     * @param req req request args
     * @return result
     * @throws Exception the exception
     */
    GetPrivateImageTypeResponse getPrivateImageType(GetPrivateImageTypeRequest req) throws Exception;

    /**
     * Enhance image
     *
     * @param req req request args
     * @return result
     * @throws Exception the exception
     */
    GetImageEnhanceResultResponse getImageEnhanceResult(GetImageEnhanceResultRequest req) throws Exception;

    /**
     * Image style
     *
     * @param req req request args
     * @return result
     * @throws Exception the exception
     */
    GetImageStyleResultResponse getImageStyleResult(GetImageStyleResultRequest req) throws Exception;
}
