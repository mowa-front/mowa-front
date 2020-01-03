package com.mowa.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/31 16:46
 * @Email: 15290810931@163.com
 */
@Controller
public class IndexController {

    @Value("${find-job.url}")
    private String findJobUrl;

    @GetMapping("/")
    public String login(Model model){
        model.addAttribute("findJobUrl", findJobUrl);
        return "login";
    }



}
