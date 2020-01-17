package com.mowa.service;


import com.github.pagehelper.PageInfo;
import com.mowa.entity.Result;
import com.mowa.request.ReqActivity;
import com.mowa.request.ReqActivityQuery;
import com.mowa.request.ReqActivityUpdate;
import com.mowa.view.ActivityView;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/25 14:16
 * @Email: 15290810931@163.com
 */
public interface ActivityService {
    /**
     * 新增活动
     * @param reqActivity
     * @return
     */
    Result insertActivity(ReqActivity reqActivity);

    /**
     * 根据ID修改活动相关信息
     * @param reqActivityUpdate
     * @return
     */
    int modifyActivity(ReqActivityUpdate reqActivityUpdate);

    /**
     * 根据id 查询活动详情
     * @param id
     * @return
     */
    ActivityView findActivityById(Integer id);

    /**
     * 根据条件查询活动且分页
     * @param reqActivityQuery
     * @return
     */
    PageInfo<ActivityView> findActivityPage(ReqActivityQuery reqActivityQuery);
}
