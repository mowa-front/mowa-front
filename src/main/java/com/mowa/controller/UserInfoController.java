package com.mowa.controller;

import com.mowa.entity.Result;
import com.mowa.request.ReqLoginUserInfo;
import com.mowa.service.UserInfoService;
import com.mowa.utils.VerifyCodeUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/1/17 18:05
 * @Email: 15290810931@163.com
 */
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @ApiOperation(value = "生成验证码，返回给前端")
    @RequestMapping(value="/getImage",method= RequestMethod.GET)
    public void authImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        // 生成随机字串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
        // 存入会话session
        HttpSession session = request.getSession(true);
        // 删除以前的
        session.removeAttribute("verCode");
        session.removeAttribute("codeTime");
        session.setAttribute("verCode", verifyCode.toLowerCase());
        session.setAttribute("codeTime", LocalDateTime.now());
        // 生成图片
        int w = 100, h = 30;
        OutputStream out = response.getOutputStream();
        VerifyCodeUtils.outputImage(w, h, out, verifyCode);
    }

    @ApiOperation(value = "用户登陆，校验用户名，密码，验证码等信息。")
    @RequestMapping(value="valid-login",method=RequestMethod.GET)
    @ResponseBody
    public Map<String,String> validImage(HttpServletRequest request, HttpSession session, ReqLoginUserInfo userInfo){
        String code = request.getParameter("code");
        Object verCode = session.getAttribute("verCode");
        Map<String,String> result = new HashMap<>(16);
        if (null == verCode) {
            request.setAttribute("errmsg", "验证码已失效，请重新输入");
            result.put("rCode","1000");
            result.put("message","验证码已失效，请重新输入");
            return result;
        }
        String verCodeStr = verCode.toString();
        LocalDateTime localDateTime = (LocalDateTime)session.getAttribute("codeTime");
        long past = localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long now = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        Result login = userInfoService.login(userInfo);

        if(verCodeStr == null || code == null || code.isEmpty() || !verCodeStr.equalsIgnoreCase(code)){
            request.setAttribute("errmsg", "验证码错误");
            result.put("rCode","1001");
            result.put("message","验证码错误");
            return result;
        } else if((now-past)/1000/60 >5){
            request.setAttribute("errmsg", "验证码已过期，重新获取");
            result.put("rCode","1002");
            result.put("message","验证码已过期，重新获取");
            return result;
        } else if(login == null){
            request.setAttribute("errmsg", "用户名或密码错误");
            result.put("rCode","1003");
            result.put("message","用户名或密码错误");
            return result;
        }else  {
            //saveLoginLog(nickName,request);
            //验证成功，删除存储的验证码
            session.removeAttribute("verCode");

            request.getSession();
            result.put("rCode","200");
            result.put("message","登陆成功");
            return result;
        }
    }
}
