package com.mowa.utils;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/19 13:55
 * @Email: 15290810931@163.com
 */
@Slf4j
@Service
public class HttpClientUtil {

    // 短信应用 AppID
    @Value("${message.appId}")
    private  String appId;

    // 短信应用 AppKey
    @Value("${message.appKey}")
    private  String appKey ;

    private static String smsUrl = "https://www.lingruanyun.com/api/pu/sms/sendSingleSms";

    public  String sendSms(String signId, String templateId, String phone, String... params) {
        Map<String, Object> paramMap = Maps.newHashMap();
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL url = new URL(smsUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true); // 设置可输入
            connection.setDoOutput(true); // 设置该连接是可以输出的
            connection.setRequestMethod("POST"); // 设置请求方式
            connection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // conn.setRequestProperty("Charset", "UTF-8");
            out = new PrintWriter(connection.getOutputStream());
            paramMap.put("appId", appId);
            paramMap.put("appKey", appKey);
            paramMap.put("signId", signId);
            paramMap.put("templateId", templateId);
            paramMap.put("phone", phone);
            paramMap.put("params", params);

            // 发送请求参数
            out.print(JSON.toJSONString(paramMap));
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            log.error("发送 POST 请求出现异常！", e);
        }
        // 使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                log.error("出现异常！",ex);
            }
        }
        return result;
    }
}
