package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author: luohongtu
 * @date: 2022/12/8
 */
@Data
public class OCRNormalPDFRequest {

    @JSONField(name = "image_base64")
    String imageBase64;

    @JSONField(name = "file_type")
    String fileType;

}
