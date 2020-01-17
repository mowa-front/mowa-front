package com.mowa.view;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/17 11:04
 * @Email: 15290810931@163.com
 */
@Data
@ApiModel(value = "用户信息表")
public class UserInfoView implements Serializable{

    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("用户昵称")
    private String userNickname;

    @ApiModelProperty("用户头像")
    private String userHead;

    @ApiModelProperty("用户身份证号码")
    private String idCard;

    @ApiModelProperty("用户密码")
    private String password;

    @ApiModelProperty("微信")
    private String wechat;

    @ApiModelProperty("性别：1 男 2 女")
    private Integer gender;
    private String  genderDesc;

    @ApiModelProperty("用户手机号")
    private String mobile;

    @ApiModelProperty("用户地址")
    private String address;

    @ApiModelProperty("身份证正面")
    private String idCardX;

    @ApiModelProperty("身份证反面")
    private String idCardY;

    @ApiModelProperty("用户状态：1冻结，2正常")
    private Integer userStatus;
    private String  userStatusDesc;

    @ApiModelProperty("余额")
    private BigDecimal amount;

    @ApiModelProperty("用户类型：1个人 2 公司")
    private Integer userType;
    private String  userTypeDesc;

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
