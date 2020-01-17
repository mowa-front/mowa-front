package com.mowa.dao;

import com.mowa.entity.Activity;
import com.mowa.request.ReqActivityQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ActivityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);

    Activity queryActivity(ReqActivityQuery reqActivityQuery);

    /**
     * 新增活动时：相同名字且状态为待审核| 进行中的活动不能创建
     * @param title
     * @return
     */
    Activity queryActivityByTitle(@Param("title") String title);

    /**
     * 根据条件查询活动且分页
     * @param reqActivityQuery
     * @return
     */
    List<Activity> findActivityPage(ReqActivityQuery reqActivityQuery);
}