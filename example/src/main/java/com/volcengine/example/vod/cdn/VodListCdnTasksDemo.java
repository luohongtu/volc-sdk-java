// Code generated by protoc-gen-volcengine-sdk
// source: listCdnTasks
// DO NOT EDIT!

package com.volcengine.example.vod.cdn;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodListCdnTasksDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodListCdnTasksRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodListCdnTasksRequest.newBuilder();
			reqBuilder.setSpaceName("your SpaceName");
			reqBuilder.setTaskId("your TaskId");
			reqBuilder.setDomainName("your DomainName");
			reqBuilder.setTaskType("your TaskType");
			reqBuilder.setStatus("your Status");
			reqBuilder.setStartTimestamp(0);
			reqBuilder.setEndTimestamp(0);
			reqBuilder.setPageNum(0);
			reqBuilder.setPageSize(0);
			
            com.volcengine.service.vod.model.response.VodListCdnTasksResponse resp = vodService.listCdnTasks(reqBuilder.build());
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