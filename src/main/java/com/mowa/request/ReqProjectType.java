package com.mowa.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/20 23:26
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
@Data
public class ReqProjectType extends PageHelps implements Serializable {

    private Integer id;

    @ApiModelProperty("父级id")
    private Integer parentId;

    @ApiModelProperty("分类名称")
    private String categoryName;

    @ApiModelProperty("收费百分比")
    private Double chargeRate;

    @ApiModelProperty("项目类型状态：1 正常 2.禁用")
    private Integer projectTypeStatus;

    @ApiModelProperty("查询收费百分比min")
    private Double chargeRateMin;

    @ApiModelProperty("查询收费百分比max")
    private Double chargeRateMax;

    @ApiModelProperty("创建人")
    private String founder;

    @ApiModelProperty("修改人")
    private String modifier;
}
