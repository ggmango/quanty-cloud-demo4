/*package com.quanty.cloud.service.zk.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

*//**
 * @Classname ZkInterceptor
 * @Description TODO 拦截器
 * @Date 2020/11/17 20:16
 * @Created by willi
 *//*
@Slf4j
public class ZkServiceInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("controller调用之前执行");
        //String token = request.getHeader("test");
        String token ="123";
        String url = request.getRequestURI();

        log.info(request.getRequestURI());
        if (StringUtils.isNotBlank(token)) {
            return true;
            }

        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("controller调用之后执行");


    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("controller调用完成后执行");

    }
}*/
