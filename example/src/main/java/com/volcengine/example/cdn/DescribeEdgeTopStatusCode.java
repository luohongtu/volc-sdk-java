package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

public class DescribeEdgeTopStatusCode {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeEdgeTopStatusCodeRequest req = new CDN.DescribeEdgeTopStatusCodeRequest()
                    .setMetric("status_5xx")
                    .setItem("domain")
                    .setDomain(Utils.exampleHost);
            CDN.DescribeEdgeTopStatusCodeResponse resp = service.describeEdgeTopStatusCode(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
