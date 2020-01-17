package com.mowa.dao;

import com.mowa.entity.ProjectInfo;
import com.mowa.request.ReqProjectInfoQuery;
import com.mowa.request.ReqProjectInfoQuery2;
import com.mowa.view.ProjectInfoView;

import java.util.List;

public interface ProjectInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectInfo record);

    int insertSelective(ProjectInfo record);

    ProjectInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProjectInfo record);

    int updateByPrimaryKey(ProjectInfo record);

    //同一用户 & 同一类型 & 相同标题 状态为未删除的项目不允许重复
    ProjectInfo findProjectParams(ReqProjectInfoQuery reqProjectInfoQuery);

    //根据条件查询项目信息
    List<ProjectInfoView> findProject(ReqProjectInfoQuery reqProjectInfoQuery);

    //根据条件查询项目信息带分页
    List<ProjectInfoView> findProjectPage(ReqProjectInfoQuery2 reqProjectInfoQuery2);
}