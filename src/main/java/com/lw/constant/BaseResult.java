package com.lw.constant;

/**
 * @className: BaseResult
 * @author: wei.liu2mars@outlook.com  lw
 * @date: 2021/11/16 10:35
 **/
public enum BaseResult {
    /*
    需要自定义如下枚举值，前提条件是需要定义有参构造函数
    枚举值必须放在枚举类的最前方位置
     */
    SUCCESS("1000","success"),
    FAIL("-1","error"),
    UNKNOWN("-2","other error")
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
