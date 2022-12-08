package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.OCRNormalPDFRequest;
import com.volcengine.service.visual.model.response.OCRNormalPDFResponse;

public class NormalOCRPDFDemo {

    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");


        String base64 = "";

        //        通用OCR-PDF
        OCRNormalPDFRequest req = new OCRNormalPDFRequest();
        req.setImageBase64(base64);
        try {
            OCRNormalPDFResponse response = visualService.ocrNormalPDF(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
