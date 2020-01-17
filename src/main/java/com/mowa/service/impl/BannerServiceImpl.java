package com.mowa.service.impl;

import com.alibaba.fastjson.JSON;
import com.mowa.dao.BannerMapper;
import com.mowa.entity.Banner;
import com.mowa.entity.Result;
import com.mowa.enums.BannerImgStatusEnum;
import com.mowa.enums.BusinessEnum;
import com.mowa.exception.BusinessException;
import com.mowa.request.ReqBanner;
import com.mowa.request.ReqBannerStatus;
import com.mowa.service.BannerService;
import com.mowa.view.BannerView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/23 18:00
 * @Email: 15290810931@163.com
 */
@Slf4j
@Service
public class BannerServiceImpl implements BannerService {

    @Resource
    BannerMapper bannerMapper;
    /**
     * 添加轮播图banner
     *
     * @param reqBanner
     * @return
     */
    @Override
    public Result insertBanner(ReqBanner reqBanner) {
        log.info("添加轮播图banner 请求参数：{}", JSON.toJSONString(reqBanner));
        if (StringUtils.isEmpty(reqBanner.getActivityId())){
            throw new BusinessException(BusinessEnum.MISSING_PARAMETERS.getCode(), BusinessEnum.MISSING_PARAMETERS.getMsg());
        }
        //添加轮播图根据活动id 和状态去查询是否已存在
        Banner bannerByActivityId = bannerMapper.findBannerByActivityId(reqBanner.getActivityId());
        if (bannerByActivityId != null){
           return Result.error(BusinessEnum.RECORD_ALREADY_EXISTS.getCode(),BusinessEnum.RECORD_ALREADY_EXISTS.getMsg(),BusinessEnum.RECORD_ALREADY_EXISTS.getMsg());
        }
        Banner banner = new Banner();
        BeanCopier beanCopier = BeanCopier.create(ReqBanner.class,Banner.class,false);
        beanCopier.copy(reqBanner,banner,null);
        if (StringUtils.isEmpty(reqBanner.getBannerImgStatus().toString())){
            banner.setBannerImgStatus(BannerImgStatusEnum.NORMAL.getCode());
        }
        banner.setCreateDate(new Date());
        banner.setUpdateDate(new Date());
        return Result.success(bannerMapper.insertSelective(banner));
    }

    /**
     * 根据条件查找banner
     *
     * @param reqBanner
     * @return
     */
    @Override
    public List<BannerView> findBanner(ReqBanner reqBanner) {
        log.info("根据条件查找banner 请求参数：{}",JSON.toJSONString(reqBanner));
        if (!StringUtils.isEmpty(reqBanner.getCreateDateBegin())){
            reqBanner.setCreateDateBegin(reqBanner.getCreateDateBegin()+" "+"00:00:00");
        }
        if (!StringUtils.isEmpty(reqBanner.getCreateDateEnd())){
            reqBanner.setCreateDateEnd(reqBanner.getCreateDateEnd()+" "+"23:59:59");
        }
        List<Banner> queryBanner = bannerMapper.findBanner(reqBanner);
        if (CollectionUtils.isEmpty(queryBanner)){
            return new ArrayList<>(16);
        }
        List<BannerView> views = new ArrayList<>();
        queryBanner.stream().forEach(banner -> {
            BannerView view = new BannerView();
            BeanCopier beanCopier = BeanCopier.create(Banner.class, BannerView.class, false);
            beanCopier.copy(banner,view,null);
            view.setBannerImgStatusDesc(BannerImgStatusEnum.fromValue(banner.getBannerImgStatus()).getMsg());
            views.add(view);
        });
        log.info("根据条件查找banner 返回结果：{}",JSON.toJSONString(views));
        return views;
    }

    /**
     * 根据ID更新轮播图状态
     *
     * @param reqBannerStatus
     * @return
     */
    @Override
    public int modifyBannerStatus(ReqBannerStatus reqBannerStatus) {
        log.info("根据ID更新轮播图状态 请求参数：{}",JSON.toJSONString(reqBannerStatus));
        if (StringUtils.isEmpty(reqBannerStatus.getId())){
            throw new BusinessException(BusinessEnum.MISSING_PARAMETERS.getCode(),BusinessEnum.MISSING_PARAMETERS.getMsg());
        }
        Banner banner = new Banner();
        BeanCopier beanCopier = BeanCopier.create(ReqBannerStatus.class,Banner.class,false);
        beanCopier.copy(reqBannerStatus,banner,null);
        banner.setUpdateDate(new Date());
        return bannerMapper.updateByPrimaryKeySelective(banner);
    }

    /**
     * 根据id 查询banner 详情
     *
     * @param id
     * @return
     */
    @Override
    public BannerView findBannerById(Integer id) {
        log.info("根据id 查询banner 详情 请求参数：{}",id);
        Banner banner = new Banner();
        banner.setId(id);
        Banner queryBanner = bannerMapper.selectByPrimaryKey(id);
        if (queryBanner == null){
            return null;
        }
        BannerView view = new BannerView();
        BeanCopier beanCopier = BeanCopier.create(Banner.class,BannerView.class,false);
        beanCopier.copy(queryBanner,view,null);
        view.setBannerImgStatusDesc(BannerImgStatusEnum.fromValue(banner.getBannerImgStatus()).getMsg());
        log.info("根据id 查询banner 详情返回结果：{}",JSON.toJSONString(view));
        return view;
    }

    /**
     * @return
     */
    @Override
    public int deleteTest(String userName) {
        ReqBanner reqBanner = new ReqBanner();
        reqBanner.setFounder(userName);
        List<Banner> list = bannerMapper.findBanner(reqBanner);
        if (CollectionUtils.isEmpty(list)){
            log.info("没有要删除的数据");
            return 0;
        }
        Map<Integer, List<Banner>> map = list.stream().collect(Collectors.groupingBy(Banner::getBannerImgStatus));
        map.forEach((k,v)->{
            log.info("得到的结果：{}", JSON.toJSON(k.toString()));
            List<Integer> activityId = v.stream().map(Banner::getActivityId).collect(Collectors.toList());
            log.info("删除的参数是：{}，{}",k,activityId);
            if (CollectionUtils.isEmpty(activityId)){
                log.info("============没有要删除的数据===========");
            }else{
                int i = bannerMapper.deleteGroupKV(k, activityId);
                log.info("删除的结果是：{}",i);
            }
        });
        return 0;
    }
}
