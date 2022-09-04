package com.cy.store.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    // 在调用所有请求处理的方法之前被自动调用执行的方法

    /**
     * 检测全局session对象中是否存在uid数据，如果有责放行，如果没有就重定向到登录界面
     * @param request 请求对象
     * @param response 响应对象
     * @param handler 处理器（url+controller：映射）
     * @return 如果返回值为true 表示放行当前的请求；如果返回值为false则表示拦截当前请求
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object obj = request.getSession().getAttribute("uid");
        if (obj == null){
            response.sendRedirect("/web/login.html");
            return false;
        }
        return true;
//        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
    // 在ModelAndView对象返回值后被调用
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
    // 整个请求所有关联的资源内执行完毕最后所要执行的方法
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
