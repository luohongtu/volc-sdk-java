package com.volcengine.service.stream;

import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MonitorConfig {
//    public static ServiceInfo serviceInfo = new ServiceInfo(
//            new HashMap<String, Object>() {
//                {
//                    put(Const.CONNECTION_TIMEOUT, 2000);
//                    put(Const.SOCKET_TIMEOUT, 2000);
//                    put(Const.Host, "mercury.volcengineapi.com");
//                    put(Const.Header, new ArrayList<Header>() {
//                        {
//                            add(new BasicHeader("Accept", "application/json"));
//                        }
//                    });
//                    put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "content"));
//                    put(Const.Scheme, "https");
//                }
//            }
//    );

    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(Const.SdkMonitor, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "GET");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new BasicNameValuePair("Action", Const.SdkMonitor));
                                    add(new BasicNameValuePair("Version", Const.ContentVersion));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
