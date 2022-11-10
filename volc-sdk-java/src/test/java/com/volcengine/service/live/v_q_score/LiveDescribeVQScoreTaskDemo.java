// Code generated by protoc-gen-volcengine-sdk
// source: describeVQScoreTask
// DO NOT EDIT!

package com.volcengine.service.live.v_q_score;

import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

public class LiveDescribeVQScoreTaskDemo {

    public static void main(String[] args) throws Exception {
        ILiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your ak");
        liveService.setSecretKey("your sk");

        try {
            com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest.Builder reqBuilder = com.volcengine.service.live.model.request.DescribeVQScoreTaskRequest.newBuilder();
			reqBuilder.setID("your ID");
			
            com.volcengine.service.live.model.response.DescribeVQScoreTaskResponse resp = liveService.describeVQScoreTask(reqBuilder.build());
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