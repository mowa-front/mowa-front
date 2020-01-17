package com.mowa.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "轮播图信息表")
public class Banner implements Serializable{

    private Integer id;

    private Integer activityId;

    private String activityImg;

    private Integer rankField;

    private Integer bannerImgStatus;

    private String founder;

    private String modifier;

    private Date createDate;

    private Date updateDate;

}