// Code generated by protoc-gen-volcengine-sdk
// source: DescribeCDNSnapshotHistory
// DO NOT EDIT!

package com.volcengine.service.live.snapshot_manage;

import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

public class LiveDescribeCDNSnapshotHistoryDemo {

    public static void main(String[] args) throws Exception {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your ak");
        liveService.setSecretKey("your sk");

        try {
            com.volcengine.service.live.model.request.DescribeCDNSnapshotHistoryRequest.Builder reqBuilder = com.volcengine.service.live.model.request.DescribeCDNSnapshotHistoryRequest.newBuilder();
			reqBuilder.setVhost("your Vhost");
			reqBuilder.setApp("your App");
			reqBuilder.setStream("your Stream");
			reqBuilder.setDateFrom("your DateFrom");
			reqBuilder.setDateTo("your DateTo");
			reqBuilder.setPageNum(0);
			reqBuilder.setPageSize(0);
			reqBuilder.setType("your Type");
			
            com.volcengine.service.live.model.response.DescribeCDNSnapshotHistoryResponse resp = liveService.DescribeCDNSnapshotHistory(reqBuilder.build());
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