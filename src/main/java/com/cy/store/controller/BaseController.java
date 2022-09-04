package com.cy.store.controller;

import com.cy.store.service.ex.*;
import com.cy.store.util.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpSession;

public class BaseController {
    public  static final int OK = 400;
    private Throwable e;


    @ExceptionHandler(ServiceExpection.class) //异常拦截注解，负责链接该类异常并抛出异常
    public JsonResult<Void> handleException(Throwable e){
        JsonResult<Void> jsonResult = new JsonResult<>();
        if (e instanceof UsernameDuplicateException) {
            jsonResult.setState(4000);
            jsonResult.setMessage("用户名重复");
        } else if (e instanceof UserNotFoundException) {
            jsonResult.setState(5001);
            jsonResult.setMessage("用户未找到");
        }else if (e instanceof PasswordNotMatchException) {
            jsonResult.setState(5002);
            jsonResult.setMessage("账号密码不匹配");
        }else if (e instanceof UpdateException) {
            jsonResult.setState(5003);
            jsonResult.setMessage("更新数据过程中产生未知异常");
        } else if (e instanceof InsertException){
            jsonResult.setState(5000);
            jsonResult.setMessage("注册过程中出现异常");
        }
        return jsonResult;
    }

    /**
     * 获取session对象中的uid
     * @param session session对象
     * @return 返回当前用户的uid
     */
    protected final Integer getUidFromSession(HttpSession session){
        return Integer.valueOf(session.getAttribute("uid").toString());
    }

    /**
     * 获取对象的用户名
     * @param session session对象
     * @return 当前登录的用户名
     */
    protected final String getUsernameFromSession(HttpSession session){
        return session.getAttribute("username").toString();
    }


}
