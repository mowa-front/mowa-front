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
@ApiModel(value = "用户状态")
public enum UserInfoStatusEnum {

    FROZEN(1,"冻结"),
    NORMAL(2,"正常"),
    ;

    //根据code 找到desc 描述
    private static final Map<Integer,UserInfoStatusEnum> valueLookup = new ConcurrentHashMap<>(values().length);
    static {
        for (UserInfoStatusEnum type: EnumSet.allOf(UserInfoStatusEnum.class)){
            valueLookup.put(type.code, type);
        }
    }
    public static UserInfoStatusEnum fromValue(Integer code) {
        UserInfoStatusEnum data = valueLookup.get(code);
        if (data == null) {
            throw new IllegalArgumentException("参数[" + code + "]不正确，没有找到对应的 Enum");
        }
        return data;
    }

    UserInfoStatusEnum(Integer code, String msg) {
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
