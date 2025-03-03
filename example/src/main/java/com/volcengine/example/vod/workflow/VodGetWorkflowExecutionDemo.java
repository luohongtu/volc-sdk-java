// Code generated by protoc-gen-volcengine-sdk
// source: getWorkflowExecution
// DO NOT EDIT!

package com.volcengine.example.vod.workflow;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;

public class VodGetWorkflowExecutionDemo {

    //获取转码工作流状态
    public void TestGetWorkflowExecution() throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ad");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodGetWorkflowExecutionStatusRequest vodGetWorkflowExecutionStatusRequest = com.volcengine.service.vod.model.request.VodGetWorkflowExecutionStatusRequest.newBuilder()
                    .setRunId("your RunId")
                    .build();
            com.volcengine.service.vod.model.response.VodGetWorkflowExecutionStatusResponse resp = vodService.GetWorkflowExecution(vodGetWorkflowExecutionStatusRequest);
            if (resp.getResponseMetadata().hasError()) {
                System.out.println(resp.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
