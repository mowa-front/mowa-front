package com.mowa.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "活动信息表")
public class Activity implements Serializable{

    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("活动标题")
    private String activityTitle;

    @ApiModelProperty("活动内容")
    private String activityContent;

    @ApiModelProperty("活动创建时间")
    private Date activityCreateDate;

    @ApiModelProperty("活动结束时间")
    private Date activityEndDate;

    @ApiModelProperty("活动状态：1 初始化 2 有效 3 失效")
    private Integer activityStatus;

    @ApiModelProperty("审核状态：1 待审核 2 已通过 3已驳回")
    private Integer examineStatus;

    @ApiModelProperty("创建人")
    private String founder;

    @ApiModelProperty("修改人")
    private String modifier;

    @ApiModelProperty("创建时间")
    private Date createDate;

    @ApiModelProperty("修改时间")
    private Date updateDate;

}