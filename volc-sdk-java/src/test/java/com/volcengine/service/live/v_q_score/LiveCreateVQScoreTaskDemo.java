// Code generated by protoc-gen-volcengine-sdk
// source: createVQScoreTask
// DO NOT EDIT!

package com.volcengine.service.live.v_q_score;

import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

public class LiveCreateVQScoreTaskDemo {

    public static void main(String[] args) throws Exception {
        ILiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your ak");
        liveService.setSecretKey("your sk");

        try {
            com.volcengine.service.live.model.request.CreateVQScoreTaskRequest.Builder reqBuilder = com.volcengine.service.live.model.request.CreateVQScoreTaskRequest.newBuilder();
			reqBuilder.setMainAddr("your MainAddr");
			reqBuilder.setContrastAddr("your ContrastAddr");
			reqBuilder.setFrameInterval(0);
			reqBuilder.setDuration(0);
			reqBuilder.setAlgorithm("your Algorithm");
			
            com.volcengine.service.live.model.response.CreateVQScoreTaskResponse resp = liveService.createVQScoreTask(reqBuilder.build());
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