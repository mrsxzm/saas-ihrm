/**
 * Copyright (C), 2019-2019, 微元素公司
 * FileName: BaseController
 * Author:   xzm
 * Date:     2019/11/13 16:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.ihrm.common.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈一句话功能简述〉<br>
 * 〈抽取公共controller参数〉
 * 获取request，response
 * 获取企业id，获取企业名称
 *
 * @author xzm
 * @create 2019/11/13
 * @since 1.0.0
 */
public class BaseController {

    protected HttpServletRequest request;
    protected HttpServletResponse response;

    @ModelAttribute
    public void setReqAndResp(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    //企业id，（暂时使用1,以后会动态获取）
    public String parseCompanyId() {
        return "1";
    }

    public String parseCompanyName() {
        return "江西徐与陶股份有限公司";
    }

}
