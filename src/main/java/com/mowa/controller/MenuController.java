package com.mowa.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/1/2 14:41
 * @Email: 15290810931@163.com
 */
@Controller
public class MenuController {

    @Value("${find-job.url}")
    private String findJobUrl;

    @GetMapping("/bbs-map")
    public String bbsMap(){
        return "bbs_map";
    }

    //跳转首页
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("findJobUrl", findJobUrl);
        return "index";
    }

    //跳转轮播图列表页
    @GetMapping("/banner")
    public String banner(Model model){
        model.addAttribute("findJobUrl",findJobUrl);
        return "banner-list";
    }

    //跳转轮播图列表页
    @GetMapping("/banner-saveOrUpdate")
    public String bannerSaveOrUpdate(Model model, HttpServletRequest request){
        String id = request.getParameter("id");
        model.addAttribute("findJobUrl",findJobUrl);
        model.addAttribute("id",id);
        return "banner-edit";
    }


    //跳转轮播图列表页
    @GetMapping("/go-login")
    public String goLogin(Model model){
        model.addAttribute("findJobUrl",findJobUrl);
        return "login";
    }
}
