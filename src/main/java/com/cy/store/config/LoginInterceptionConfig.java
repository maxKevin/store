package com.cy.store.config;

import com.cy.store.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/** 处理连接器的注册 */
@Configuration //加载当前的拦截器并进行注册
public class LoginInterceptionConfig implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        HandlerInterceptor handlerInterceptor = new LoginInterceptor();

        List<String> patterns = new ArrayList<>();

        patterns.add("/bootstrap3/**");
        patterns.add("/css/**");
        patterns.add("/images/**");
        patterns.add("/js/**");
        patterns.add("/index.html");
        patterns.add("/web/register.html");
        patterns.add("/web/login.html");
        patterns.add("/web/index.html");
        patterns.add("/user/reg");
        patterns.add("/user/login");
        //完成拦截器的注册
        registry.addInterceptor(handlerInterceptor).addPathPatterns("/**").excludePathPatterns(patterns);
//        WebMvcConfigurer.super.addInterceptors(registry);
    }

}
