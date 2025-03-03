package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Functions {
    @JSONField(name = "Name")
    String name;
    @JSONField(name = "Input")
    Object input;

    public static Functions GetMetaFunction() {
        return new Functions("GetMeta", null);
    }

    public static Functions SnapShotFunction(double snapShot) {
        return new Functions("Snapshot", new FunctionsSnapshotInput(snapShot));
    }

    public static Functions AddOptionInfoFunction(String title, String tags, String description) {
        return new Functions("AddOptionInfo", new FunctionsOptionInfo(title, tags, description, "", 1, "", 0));
    }

    public static Functions AddOptionInfoFunction(String title, String tags, String description, long classificationId) {
        return new Functions("AddOptionInfo", new FunctionsOptionInfo(title, tags, description, "", 1, "", classificationId));
    }

    public static Functions AddOptionInfoFunction(String title, String tags, String description, String category, String format) {
        return new Functions("AddOptionInfo", new FunctionsOptionInfo(title, tags, description, category, 2, format, 0));
    }

    public static Functions StartWorkFlowFunction(String templateId) {
        return new Functions("StartWorkflow", new FunctionsWorkflowInput(templateId));
    }

}
