package com.volcengine.example.upload;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.Functions;
import com.volcengine.model.vod.request.VodUploadMediaRequest;
import com.volcengine.model.vod.response.VodCommitUploadInfoResponse;
import com.volcengine.service.vod.impl.VodUploadServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class VodUploadMediaDemo {

    public static void main(String[] args) {
        VodUploadServiceImpl vodService = VodUploadServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        String space = "your space name";
        String filePath = "file path";

        List<Functions> functionsList = new ArrayList<>();
        Functions getMetaFunc = Functions.GetMetaFunction();
        functionsList.add(getMetaFunc);

        Functions snapShotFunc = Functions.SnapShotFunction(2.3);
        functionsList.add(snapShotFunc);

        VodUploadMediaRequest vodUploadMediaRequest = VodUploadMediaRequest.newBuilder()
                .setSpaceName(space)
                .setFilePath(filePath)
                .setFunctions(JSON.toJSONString(functionsList))
                .build();
        try {
            VodCommitUploadInfoResponse vodCommitUploadInfoResponse = vodService.uploadMedia(vodUploadMediaRequest);
            if (vodCommitUploadInfoResponse.getResponseMetadata().hasError()) {
                System.out.println(vodCommitUploadInfoResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(vodCommitUploadInfoResponse.toString());
            System.out.println(vodCommitUploadInfoResponse.getResult().getData().getVid());
            System.out.println(vodCommitUploadInfoResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
