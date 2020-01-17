package com.mowa.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/19 18:18
 * @Email: 15290810931@163.com
 */
@Data
@ApiModel(value = "手机号注册")
public class ReqRegisterCode implements Serializable{

    @ApiModelProperty("注册手机号")
    private String mobile;

    @ApiModelProperty("接收注册码")
    private String registerCode;

    @ApiModelProperty("设置密码")
    private String password;

    @ApiModelProperty("再次设置密码")
    private String repeatPassword;
}
