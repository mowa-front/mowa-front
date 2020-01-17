package com.mowa.enums;

/**
 * @Author: luoxian
 * @Date: 2019/5/21 17:21
 */
public enum SystemCodeEnum {

    SUCCESS(200,"成功"),
    ERROR(201,"失败"),
    ACCESS_ERROR(2003,"权限不足"),
    EXCEPTION(500,"系统异常"),

    ;

    SystemCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;
    private String  msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
