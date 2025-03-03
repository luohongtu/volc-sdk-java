package com.volcengine.example.businessSecurity;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.AsyncRiskDetectionRequest;
import com.volcengine.model.request.RiskDetectionRequest;
import com.volcengine.model.request.RiskResultRequest;
import com.volcengine.model.response.*;
import com.volcengine.service.businessSecurity.BusinessSecurityService;

import com.volcengine.service.businessSecurity.impl.BusinessSecurityServiceImpl;

public class RiskDetectionDemo {
    public static void main(String[] args) {
        BusinessSecurityService businessSecurityService = BusinessSecurityServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        businessSecurityService.setAccessKey("AK");
        businessSecurityService.setSecretKey("SK");
        // risk detection
        try {
            RiskDetectionRequest riskDetectionRequest = new RiskDetectionRequest();
            riskDetectionRequest.setAppId(216455);
            riskDetectionRequest.setService("register");
            riskDetectionRequest.setParameters("{\"operate_time\": 1617960951}");

            RiskDetectionResponse riskDetectionResponse = businessSecurityService.RiskDetection(riskDetectionRequest);
            System.out.println(JSON.toJSONString(riskDetectionResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // async risk detection
        try {
            AsyncRiskDetectionRequest asyncRiskDetectionRequest = new AsyncRiskDetectionRequest();
            asyncRiskDetectionRequest.setAppId(216455);
            asyncRiskDetectionRequest.setService("register");
            asyncRiskDetectionRequest.setPatameters("{\"operate_time\": 1617960951}");

            AsyncRiskDetectionResponse asyncRiskDetectionResponse = businessSecurityService.AsyncRiskDetection(asyncRiskDetectionRequest);
            System.out.println(JSON.toJSONString(asyncRiskDetectionResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // risk result
        try {
            RiskResultRequest riskResultRequest = new RiskResultRequest();
            riskResultRequest.setAppId(216455);
            riskResultRequest.setService("register");
            riskResultRequest.setStartTime(1618848000);
            riskResultRequest.setEndTime(1618921103);
            riskResultRequest.setPageNum(1);
            riskResultRequest.setPageSize(10);

            RiskResultResponse riskResultResponse = businessSecurityService.RiskResult(riskResultRequest);
            System.out.println(JSON.toJSONString(riskResultResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // account risk
        try {
            RiskDetectionRequest riskDetectionRequest = new RiskDetectionRequest();
            riskDetectionRequest.setAppId(5461);
            riskDetectionRequest.setService("account_risk");
            riskDetectionRequest.setParameters("{\"operate_time\":1609818934, \"mobile_sha1\": \"fee831dd2756c863b052de0725719d4246a387dc\", \"ip\": \"218.6.209.45\"}");
            RiskDetectionResponse riskDetectionResponse = businessSecurityService.AccountRisk(riskDetectionRequest);
            System.out.println(JSON.toJSONString(riskDetectionResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // mobile status
        try {
            RiskDetectionRequest riskDetectionRequest = new RiskDetectionRequest();
            riskDetectionRequest.setAppId(5461);
            riskDetectionRequest.setService("mobile_status");
            riskDetectionRequest.setParameters("{\"operate_time\":1609818934, \"mobile\": \"\"}");
            MobileStatusResponse mobileStatusResponse = businessSecurityService.MobileStatus(riskDetectionRequest);
            System.out.println(JSON.toJSONString(mobileStatusResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // element verify
        try {
            RiskDetectionRequest riskDetectionRequest = new RiskDetectionRequest();
            riskDetectionRequest.setAppId(5461);
            riskDetectionRequest.setService("idcard_two_element_verify");
            riskDetectionRequest.setParameters("{\"operate_time\":1609818934, \"idcard_no\": \"\", \"idcard_name\":\"\"}");
            ElementVerifyResponse elementVerifyResponse = businessSecurityService.ElementVerify(riskDetectionRequest);
            System.out.println(JSON.toJSONString(elementVerifyResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
