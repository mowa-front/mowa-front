package com.mowa.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/20 13:44
 * @Email: 15290810931@163.com
 */
@Data
public class ReqLoginUserInfo implements Serializable {

    private String userName;

    private String userNickname;

    private String idCard;

    private String mobile;

    private String password;

    private String verificationCode;

    private String LoginIp;

    @ApiModelProperty(value = "登录方式：1.[用户名&密码] 2.[用户昵称&密码]3.[手机号&密码]4.[身份证号&密码] 5.[手机号&短信]")
    private Integer loginType;
}
