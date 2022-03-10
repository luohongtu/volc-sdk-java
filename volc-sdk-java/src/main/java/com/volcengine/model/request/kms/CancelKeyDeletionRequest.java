package com.volcengine.model.request.kms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CancelKeyDeletionRequest {
    @JSONField(name = "KeyringName")
    String keyringName;
    @JSONField(name = "KeyName")
    String keyName;
}
