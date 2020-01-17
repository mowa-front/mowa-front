package com.mowa.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/23 17:23
 * @Email: 15290810931@163.com
 */
@Data
public class ReqProjectStatus implements Serializable {

    private Integer id;

    @ApiModelProperty("项目状态：1 项目发布 2 用户报名 3 开始工作 4交易完成")
    private Integer projectState;

    @ApiModelProperty("审核状态 1待审核 2 已通过 3 已驳回")
    private Integer examineStatus;

}
