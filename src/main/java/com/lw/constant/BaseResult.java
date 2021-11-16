package com.lw.constant;

/**
 * @className: BaseResult
 * @author: wei.liu2mars@outlook.com  lw
 * @date: 2021/11/16 10:35
 **/
public enum BaseResult {
    SUCCESS("1000","success"),
    FAIL("-1","error")
    ;

    private String code;
    private String msg;

    BaseResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
