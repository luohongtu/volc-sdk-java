package com.volcengine.service.numberpool;

import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NumberPoolConfig {

    public static Map<String, ServiceInfo> serviceInfoMap = new HashMap<String, ServiceInfo>() {
        {
            put(Const.REGION_CN_NORTH_1, new ServiceInfo(new HashMap<String, Object>() {
                {
                    put(Const.CONNECTION_TIMEOUT, 5000);
                    put(Const.SOCKET_TIMEOUT, 5000);
                    put(Const.Scheme, "https");
                    put(Const.Host, "cloud-vms.volcengineapi.com");
                    put(Const.Header, new ArrayList<Header>() {
                        {
                            add(new BasicHeader("Accept", "application/json"));
                        }
                    });
                    put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "comm_number_pool"));
                }
            }));
        }
    };

    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put("NumberPoolList", new ApiInfo(new HashMap<String, Object>() {
                {
                    put(Const.Method, "POST");
                    put(Const.Path, "/");
                    put(Const.Query, new ArrayList<NameValuePair>() {
                        {
                            add(new BasicNameValuePair("Action", "NumberPoolList"));
                            add(new BasicNameValuePair("Version", "2020-09-01"));
                        }
                    });
                }
            }));
            put("NumberList", new ApiInfo(new HashMap<String, Object>() {
                {
                    put(Const.Method, "GET");
                    put(Const.Path, "/");
                    put(Const.Query, new ArrayList<NameValuePair>() {
                        {
                            add(new BasicNameValuePair("Action", "NumberList"));
                            add(new BasicNameValuePair("Version", "2020-09-01"));
                        }
                    });
                }
            }));
        }
    };
}
