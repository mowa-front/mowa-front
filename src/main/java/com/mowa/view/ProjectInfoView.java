package com.mowa.view;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/22 12:25
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
@Data
@ApiModel(value = "项目信息表")
public class ProjectInfoView implements Serializable {

    private Integer id;

    @ApiModelProperty("商家用户id")
    private Integer userId;

    @ApiModelProperty("项目类型id")
    private Integer projectTypeId;

    @ApiModelProperty("项目类型名称")
    private String projectTypeName;

    @ApiModelProperty("项目兼职标题")
    private String projectTitle;

    @ApiModelProperty("项目兼职内容描述")
    private String projectContent;

    @ApiModelProperty("项目所属公司")
    private String projectAscriptionCompany;

    @ApiModelProperty("省份id")
    private Integer provinceId;

    @ApiModelProperty("省份名称")
    private String provinceTitle;

    @ApiModelProperty("城市id")
    private Integer cityId;

    @ApiModelProperty("城市名称")
    private String cityTitle;

    @ApiModelProperty("地区id")
    private Integer areaId;

    @ApiModelProperty("区域名称")
    private String areaTitle;

    @ApiModelProperty("上班详细地址")
    private String workAddress;

    @ApiModelProperty("性别要求：1 男 2 女 3 不限")
    private Integer genderRequirement;
    private String  genderRequirementDesc;

    @ApiModelProperty("项目标签：1长期工 2 短期工 3寒假工 4暑假工 5钟点工")
    private String projectLabel;
    private List<String>  projectLabelsDesc;

    @ApiModelProperty("薪水")
    private BigDecimal salary;

    @ApiModelProperty("工资单位：1 天 2 小时 3 月 4 次 5 单")
    private Integer salaryUnit;

    private String  salaryUnitDesc;

    @ApiModelProperty("结算周期：1 完工结 2 日结 3 周结 4 月结")
    private Integer settlementCycle;
    private String  settlementCycleDesc;

    @ApiModelProperty("工作福利")
    private String workWelfaresId;
    private List<String>  workWelfaresIdDesc;

    @ApiModelProperty("项目需要人数")
    private Integer projectNeedNum;

    @ApiModelProperty("项目联系人姓名")
    private String projectContactsName;

    @ApiModelProperty("项目联系人手机号")
    private String projectContactsMobile;

    @ApiModelProperty("项目联系人邮箱")
    private String projectContactsEmail;

    @ApiModelProperty("项目要求技能")
    private String projectSkill;

    @ApiModelProperty("工作时间周期数")
    private Integer workTimeNum;

    @ApiModelProperty("工作时间周期单位：1.小时 2.天 3.月 4年")
    private int workTimeUnit;
    private String workTimeUnitDesc;

    @ApiModelProperty("上班时段[开始时间]")
    private String workTimeIntervalMin;

    @ApiModelProperty("上班时段[结束时间]")
    private String workTimeIntervalMax;

    @ApiModelProperty("上班时间要求")
    private String workTimeRequirement;

    @ApiModelProperty("项目报名开始时间")
    private Date projectBeginTime;

    @ApiModelProperty("项目报名结束时间")
    private Date projectEndTime;

    @ApiModelProperty("项目备注")
    private String projectRemark;

    @ApiModelProperty("订单id")
    private String orderId;

    @ApiModelProperty("总支付")
    private BigDecimal totalPayAmount;

    @ApiModelProperty("服务费")
    private BigDecimal serviceCharge;

    @ApiModelProperty("服务费费率")
    private BigDecimal serviceChargeRate;

    @ApiModelProperty("订单状态")
    private Integer orderState;

    @ApiModelProperty("项目状态：1 项目发布 2 用户报名 3 开始工作 4交易完成")
    private Integer projectState;
    private String  projectStateDesc;

    @ApiModelProperty("审核状态：1待审核 2 已通过 3 已驳回")
    private Integer examineStatus;

    @ApiModelProperty("是否删除：1 删除 2 未删除")
    private Integer isDelete;
    private String  isDeleteDesc;

    @ApiModelProperty("创建人")
    private String founder;

    @ApiModelProperty("修改人")
    private String modifier;

    @ApiModelProperty("创建时间")
    private Date createDate;

    @ApiModelProperty("结束时间")
    private Date updateDate;

    @ApiModelProperty("开始上班日期")
    private String workDateBegin;

    @ApiModelProperty("结束上班日期")
    private String workDateEnd;

    @ApiModelProperty("开始上班时间")
    private String workTimeBegin;

    @ApiModelProperty("结束上班时间")
    private String workTimeEnd;
}
