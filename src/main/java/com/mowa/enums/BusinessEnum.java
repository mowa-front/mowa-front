package com.mowa.enums;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/17 14:30
 * @Email: 15290810931@163.com
 */
public enum BusinessEnum {

    RECORD_REPETITION(1001,"记录重复"),
    MISSING_PARAMETERS(1002,"参数缺失"),
    RECORD_ALREADY_EXISTS(1003,"记录已存在"),
    RECORD_NOT_EXIST(1004,"记录不存在"),
    USERINFO_NOT_EXIST(1005,"该手机号用户已存在，不能重复注册"),
    CALL_SEND_MSM_NULL(1006,"调用发送短信服务返回为空"),
    CALL_SEND_MSM_EXCEPTION(1007,"调用发送短信服务异常"),
    PASSWORDS_INCONSISTENT(1008,"两次密码不一致，请重新输入"),
    REGISTER_VERIFICATION_MOBILE_DIFFERENT(1009,"输入验证码手机号和注册手机号请保持一致"),
    VERIFICATION_CODE_ERROR_PLEASE_TRY_AGAIN(1010,"验证码错误，请重新输入"),
    LOGIN_TYPE_NULL(1011,"登录方式为空，请选择一种登录方式"),
    USERINFO_EXIST(1012,"当前登录账号不存在"),
    USERINFO_FROZEN(1013,"对不起，您的账号已被冻结"),
    LOGIN_ERROR(1014,"对不起，您的账号和密码不匹配，请重新登录"),
    FREQUENT_OPERATION_PLEASE_TRY_AGAIN_LATER(1015,"对不起，您操作频繁，请稍后重试"),
    LOGIN_VERIFICATION_MOBILE_DIFFERENT(1016,"输入验证码手机号和登录手机号请保持一致"),


    ;

    BusinessEnum(Integer code, String msg) {
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
