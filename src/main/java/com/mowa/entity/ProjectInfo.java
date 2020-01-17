package com.mowa.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(value = "兼职信息表")
public class ProjectInfo implements Serializable {
    private Integer id;

    private Integer userId;

    private String userName;

    private Integer projectTypeId;

    private String projectTypeName;

    private String projectTitle;

    private String projectContent;

    private String projectAscriptionCompany;

    private Integer provinceId;

    private String provinceTitle;

    private Integer cityId;

    private String cityTitle;

    private Integer areaId;

    private String areaTitle;

    private String workAddress;

    private Integer genderRequirement;

    private String projectLabel;

    private BigDecimal salary;

    private Integer salaryUnit;

    private Integer settlementCycle;

    private String workWelfaresId;

    private Integer projectNeedNum;

    private String projectContactsName;

    private String projectContactsMobile;

    private String projectContactsEmail;

    private String projectSkill;

    private Integer workTimeNum;

    private Integer workTimeUnit;

    private Date workTimeIntervalMin;

    private Date workTimeIntervalMax;

    private String workTimeRequirement;

    private Date projectBeginTime;

    private Date projectEndTime;

    private String projectRemark;

    private String orderId;

    private BigDecimal totalpayAmount;

    private BigDecimal serviceCharge;

    private BigDecimal serviceChargeRate;

    private Integer orderState;

    private Integer projectState;

    private Integer examineStatus;

    private Integer isDelete;

    private String founder;

    private String modifier;

    private Date createDate;

    private Date updateDate;
}