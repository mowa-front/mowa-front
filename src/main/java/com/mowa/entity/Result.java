package com.mowa.entity;

import com.mowa.enums.SystemCodeEnum;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/17 14:25
 * @Email: 15290810931@163.com
 */
public class Result<T> {
    private boolean flag = true;
    private Integer code;
    private String message;
    private T data;

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result(boolean flag, Integer code, String message, T data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result() {
    }
    public static <T> Result<T> success(T data) {
        Result<T> response = new Result();
        response.setCode(SystemCodeEnum.SUCCESS.getCode());
        response.setMessage(SystemCodeEnum.SUCCESS.getMsg());
        response.setData(data);
        return response;
    }
    public static <T> Result<T> success() {
        Result<T> response = new Result();
        response.setCode(SystemCodeEnum.SUCCESS.getCode());
        response.setMessage(SystemCodeEnum.SUCCESS.getMsg());
        response.setData(null);
        return response;
    }
    public static <T> Result<T> error(T data) {
        Result<T> response = new Result();
        response.setCode(SystemCodeEnum.ERROR.getCode());
        response.setMessage(SystemCodeEnum.ERROR.getMsg());
        response.setData(data);
        return response;
    }

    public static <T> Result<T> error() {
        Result<T> response = new Result();
        response.setCode(SystemCodeEnum.ERROR.getCode());
        response.setMessage(SystemCodeEnum.ERROR.getMsg());
        response.setData(null);
        return response;
    }

    public static <T> Result<T> error(Integer code,String message,T data) {
        Result<T> response = new Result();
        response.setCode(code);
        response.setMessage(message);
        response.setData(null);
        return response;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "flag=" + flag +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
