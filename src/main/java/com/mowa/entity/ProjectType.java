package com.mowa.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Date;


@Data
@ApiModel(value = "项目类型信息表")
public class ProjectType {

    private Integer id;

    private Integer parentId;

    private String categoryName;

    private Double chargeRate;

    private Integer projectTypeStatus;

    private Integer isDelete;

    private String founder;

    private String modifier;

    private Date createDate;

    private Date updateDate;
}