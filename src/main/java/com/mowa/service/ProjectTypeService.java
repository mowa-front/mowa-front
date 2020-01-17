package com.mowa.service;

import com.fenghuang.job.request.ReqProjectType;
import com.fenghuang.job.view.ProjectTypeView;
import com.github.pagehelper.PageInfo;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/20 23:25
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
public interface ProjectTypeService {
    /**
     *新增项目类型
     * @param reqProjectType
     * @return
     */
    int insertProjectType(ReqProjectType reqProjectType);

    /**
     *更新项目类型字段
     * @param reqProjectType
     * @return
     */
    int modifyProjectType(ReqProjectType reqProjectType);

    /**
     *根据id 查询项目类型相关信息
     * @param id
     * @return
     */
    ProjectTypeView findProjectTypeById(Integer id);

    /**
     * 根据条件查询项目类型 且分页
     * @param reqProjectType
     * @return
     */
    PageInfo<ProjectTypeView> findProjectTypePage(ReqProjectType reqProjectType);
}
