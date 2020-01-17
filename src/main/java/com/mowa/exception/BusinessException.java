package com.mowa.exception;

import lombok.Data;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/17 14:23
 * @Email: 15290810931@163.com
 */
@Data
public class BusinessException extends RuntimeException {

    private Integer code;
    public BusinessException(String msg){
        super(msg);
    }
    public BusinessException(Integer code, String msg){
        super(msg);
        this.code = code;
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }

}
