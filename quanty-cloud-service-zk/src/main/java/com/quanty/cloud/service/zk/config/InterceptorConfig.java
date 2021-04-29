/*package com.quanty.cloud.service.zk.config;

import com.quanty.cloud.service.zk.interceptor.ZkServiceInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.Collections;

*//**
 * @Classname InterceptorConfig
 * @Description TODO
 * @Date 2020/11/17 20:44
 * @Created by willi
 *//*
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(new ZkServiceInterceptor());
        registration.addPathPatterns(getIncludePathPatterns());

    }
    *//**
     * 需要用户和服务认证判断的路径
     * @return
     *//*
    private ArrayList<String> getIncludePathPatterns() {
        ArrayList<String> list = new ArrayList<>();
        String[] urls = {
                "/config/mytest",
                "/v1/**"

        };
        Collections.addAll(list, urls);
        return list;
    }
}*/
