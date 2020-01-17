package com.mowa.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/12/5 15:04
 * @Email: 15290810931@163.com
 */
@Data
public class PageHelps implements Serializable {

    private Integer pageNum;

    private Integer pageSize;
}
