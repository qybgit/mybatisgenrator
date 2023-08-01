package com.example.common.enums;

public enum ApiResult {
    TEST(201,"测试");
    private int code;
    private String msg;

    ApiResult(int code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
