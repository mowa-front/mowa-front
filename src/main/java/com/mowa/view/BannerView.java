package com.mowa.view;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/23 17:58
 * @Email: 15290810931@163.com
 */
@Data
@ApiModel(value = "轮播图信息表")
public class BannerView implements Serializable {

    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("活动id")
    private Integer activityId;

    @ApiModelProperty("活动图片url")
    private String activityImg;

    @ApiModelProperty("排次")
    private Integer rankField;

    @ApiModelProperty("图片状态：1 正常 2失效")
    private Integer bannerImgStatus;

    @ApiModelProperty("图片状态：1 正常 2失效")
    private String bannerImgStatusDesc;

    @ApiModelProperty("创建人")
    private String founder;

    @ApiModelProperty("修改人")
    private String modifier;

    @ApiModelProperty("创建时间")
    private Date createDate;

    @ApiModelProperty("修改时间")
    private Date updateDate;
}
