// Code generated by protoc-gen-volcengine-sdk
// source: updatePullToPushTask
// DO NOT EDIT!

package com.volcengine.service.live.pull_to_push_task;

import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

public class LiveUpdatePullToPushTaskDemo {

    public static void main(String[] args) throws Exception {
        ILiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your ak");
        liveService.setSecretKey("your sk");

        try {
            com.volcengine.service.live.model.request.UpdatePullToPushTaskRequest.Builder reqBuilder = com.volcengine.service.live.model.request.UpdatePullToPushTaskRequest.newBuilder();
			reqBuilder.setTitle("your Title");
			reqBuilder.setTaskId("your TaskId");
			reqBuilder.setStartTime(0);
			reqBuilder.setEndTime(0);
			reqBuilder.setCallbackURL("your CallbackURL");
			reqBuilder.setType(0);
			reqBuilder.setCycleMode(0);
			reqBuilder.setDstAddr("your DstAddr");
			reqBuilder.setSrcAddr("your SrcAddr");
			reqBuilder.addSrcAddrS("your SrcAddrS");
			
            com.volcengine.service.live.model.response.UpdatePullToPushTaskResponse resp = liveService.updatePullToPushTask(reqBuilder.build());
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