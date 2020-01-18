package com.sly.demo.switchpage.controller;

import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * index controller
 *
 * @author SLY
 * @description TODO
 * @date 2020/1/18
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/toIndex")
    public String toIndex(HttpServletRequest request, Device device) {
        String deviceType = "unknown";
        if (device.isNormal()) {
            deviceType = "normal";
        } else if (device.isMobile()) {
            deviceType = "mobile";
        } else if (device.isTablet()) {
            deviceType = "tablet";
        }
        System.out.println(deviceType);

        request.setAttribute("value", "我是值！");
        return "/index.html";
    }

    @ResponseBody
    @RequestMapping("/getData")
    public Object getData() {
        return "我是数据";
    }




}
