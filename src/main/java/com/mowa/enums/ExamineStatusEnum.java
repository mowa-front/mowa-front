package com.mowa.enums;

import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/20 15:44
 * @Email: 15290810931@163.com
 */
public enum ExamineStatusEnum {

    AUDITED(1,"待审核"),
    PASSED(2,"通过"),
    REJECTED(3,"驳回");

    //根据code 找到desc 描述
    private static final Map<Integer,ExamineStatusEnum> valueLookup = new ConcurrentHashMap<>(values().length);
    static {
        for (ExamineStatusEnum type: EnumSet.allOf(ExamineStatusEnum.class)){
            valueLookup.put(type.code, type);
        }
    }
    public static ExamineStatusEnum fromValue(Integer code) {
        ExamineStatusEnum data = valueLookup.get(code);
        if (data == null) {
            throw new IllegalArgumentException("参数[" + code + "]不正确，没有找到对应的 Enum");
        }
        return data;
    }

    ExamineStatusEnum(Integer code, String msg) {
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
