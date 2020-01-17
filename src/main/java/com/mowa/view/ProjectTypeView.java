package com.mowa.view;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/22 10:44
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
@Data
@ApiModel(value = "项目类型信息表")
public class ProjectTypeView implements Serializable {

    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("父级id")
    private Integer parentId;

    @ApiModelProperty("分类名称")
    private String categoryName;

    @ApiModelProperty("收费百分比")
    private Double chargeRate;

    @ApiModelProperty("创建人")
    private String founder;

    @ApiModelProperty("修改人")
    private String modifier;

    @ApiModelProperty("创建时间")
    private Date createDate;

    @ApiModelProperty("修改时间")
    private Date updateDate;
}
