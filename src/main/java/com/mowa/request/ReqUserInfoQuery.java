package com.mowa.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/17 13:58
 * @Email: 15290810931@163.com
 */
@Data
public class ReqUserInfoQuery extends PageHelps implements Serializable{

    private Integer id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("用户昵称")
    private String userNickname;

    @ApiModelProperty("用户头像")
    private String userHead;

    @ApiModelProperty("身份证ID")
    private String idCard;

    @ApiModelProperty("用户密码")
    private String password;

    @ApiModelProperty("新密码")
    private String newPassword;

    @ApiModelProperty("用户微信")
    private String wechat;

    @ApiModelProperty("性别：1 男 2 女")
    private Integer gender;

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

    @ApiModelProperty("身份证正面")
    private String idCardX;

    @ApiModelProperty("身份证反面")
    private String idCardY;

    @ApiModelProperty("用户状态：1冻结，2正常")
    private Integer userStatus;

    @ApiModelProperty("余额")
    private BigDecimal amount;

    @ApiModelProperty("用户类型：1个人 2 公司")
    private Integer userType;

    @ApiModelProperty("用户等级")
    private Integer userLevel;

    @ApiModelProperty("紧急联系人")
    private String emergencyContactName;

    @ApiModelProperty("紧急联系人手机号")
    private String emergencyContactMobile;

    @ApiModelProperty("创建人")
    private String founder;

    @ApiModelProperty("修改人")
    private String modifier;

    @ApiModelProperty("创建时间")
    private Date createDate;

    @ApiModelProperty("修改时间")
    private Date updateDate;
}
