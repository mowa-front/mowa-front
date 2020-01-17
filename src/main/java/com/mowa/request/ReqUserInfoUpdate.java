package com.mowa.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/25 9:50
 * @Email: 15290810931@163.com
 */
@Data
@ApiModel
public class ReqUserInfoUpdate implements Serializable {

    private Integer id;

    @ApiModelProperty("用户名[用户名一但注册不可修改]")
    private String userName;

    @ApiModelProperty("用户昵称")
    private String userNickname;

    @ApiModelProperty("用户头像")
    private String userHead;

    @ApiModelProperty("用户密码")
    private String password;

    @ApiModelProperty("新密码")
    private String newPassword;

    @ApiModelProperty("用户手机号")
    private String mobile;

    @ApiModelProperty("省份ID")
    private Integer provinceId;

    @ApiModelProperty("城市ID")
    private Integer cityId;

    @ApiModelProperty("县区ID")
    private Integer countyAreaId;

    @ApiModelProperty("用户详细地址")
    private String address;

    @ApiModelProperty("用户状态：1冻结，2正常")
    private Integer userStatus;

    @ApiModelProperty("用户类型：1个人 2 公司")
    private Integer userType;

    @ApiModelProperty("修改人")
    private String modifier;

    @ApiModelProperty("紧急联系人")
    private String emergencyContactName;

    @ApiModelProperty("紧急联系人手机号")
    private String emergencyContactMobile;

}
