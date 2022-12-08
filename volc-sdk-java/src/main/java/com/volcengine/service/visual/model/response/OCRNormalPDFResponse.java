package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

/**
 * @author: luohongtu
 * @date: 2022/12/8
 */
@Data
public class OCRNormalPDFResponse extends VisualBaseResponse  {

    @JSONField(name = "data")
    OCRNormalPDF data;

    @Data
    public static class OCRNormalPDF {

        @JSONField(name = "page_infos")
        List<PageInfos> pageInfos;

    }

    @Data
    public static class PageInfos {

        @JSONField(name = "poly")
        List<List<List<Double>>> poly;


        @JSONField(name = "text")
        List<String> text;

    }
}
