package com.example.config;

import com.example.config.interceptor.UserInterceptor;
import org.aopalliance.intercept.Interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class Webmvcconfig implements WebMvcConfigurer {
    @Resource
    UserInterceptor userInterceptor;
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(userInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/file_resource");
//        WebMvcConfigurer.super.addInterceptors(registry);
//    }
}
