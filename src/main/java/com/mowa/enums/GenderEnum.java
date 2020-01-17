package com.mowa.enums;

import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/25 14:46
 * @Email: 15290810931@163.com
 */
public enum GenderEnum {

    MAN(1,"男"),
    WOMAN(2,"女"),
    SECRECY(3,"保密")
    ;

    //根据code 找到desc 描述
    private static final Map<Integer,GenderEnum> valueLookup = new ConcurrentHashMap<>(values().length);
    static {
        for (GenderEnum type: EnumSet.allOf(GenderEnum.class)){
            valueLookup.put(type.code, type);
        }
    }
    public static GenderEnum fromValue(Integer code) {
        GenderEnum data = valueLookup.get(code);
        if (data == null) {
            throw new IllegalArgumentException("参数[" + code + "]不正确，没有找到对应的 Enum");
        }
        return data;
    }

    GenderEnum(Integer code, String msg) {
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
