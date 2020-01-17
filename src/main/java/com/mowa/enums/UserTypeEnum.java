package com.mowa.enums;

import io.swagger.annotations.ApiModel;

import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/17 14:30
 * @Email: 15290810931@163.com
 */
@ApiModel(value = "用户类型")
public enum UserTypeEnum {

    PERSONAL(1,"个人"),
    COMPANY(2,"公司"),
    ;

    //根据code 找到desc 描述
    private static final Map<Integer,UserTypeEnum> valueLookup = new ConcurrentHashMap<>(values().length);
    static {
        for (UserTypeEnum type: EnumSet.allOf(UserTypeEnum.class)){
            valueLookup.put(type.code, type);
        }
    }
    public static UserTypeEnum fromValue(Integer code) {
        UserTypeEnum data = valueLookup.get(code);
        if (data == null) {
            throw new IllegalArgumentException("参数[" + code + "]不正确，没有找到对应的 Enum");
        }
        return data;
    }

    UserTypeEnum(Integer code, String msg) {
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
