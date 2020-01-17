package com.mowa.service;

import com.mowa.entity.Result;
import com.mowa.request.ReqBanner;
import com.mowa.request.ReqBannerStatus;
import com.mowa.view.BannerView;

import java.util.List;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/23 17:50
 * @Email: 15290810931@163.com
 */
public interface BannerService {

    /**
     * 添加轮播图banner
     * @param reqBanner
     * @return
     */
    Result insertBanner(ReqBanner reqBanner);

    /**
     * 根据条件查找banner
     * @param reqBanner
     * @return
     */
    List<BannerView> findBanner(ReqBanner reqBanner);

    /**
     * 根据ID更新轮播图状态
      * @param reqBannerStatus
     * @return
     */
    int modifyBannerStatus(ReqBannerStatus reqBannerStatus);

    /**
     * 根据id 查询banner 详情
     * @param id
     * @return
     */
    BannerView findBannerById(Integer id);

    /**
     *
     * @return
     */
    int deleteTest(String userName);
}
