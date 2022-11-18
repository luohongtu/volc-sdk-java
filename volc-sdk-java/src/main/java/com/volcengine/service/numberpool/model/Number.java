package com.volcengine.service.numberpool.model;

import lombok.Data;

/**
 * @Author: chenhui
 * @Date: 2022/11/18
 * @Description:
 */
@Data
public class Number {
    private String number;

    private Integer numberStatusCode;

    private String numberStatusDesc;

    private Integer numberTypeCode;

    private String numberTypeDesc;

    private String numberLocation;

    private String numberPurchaseTime;

    private String numberPoolNo;

    private String numberPoolName;

    private Integer numberPoolTypeCode;

    private String numberPoolTypeDesc;

    private Integer serviceTypeCode;

    private String serviceTypeDesc;
}
