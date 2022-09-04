package com.cy.store.controller;


import com.cy.store.entity.User;
import com.cy.store.service.IUserService;
import com.cy.store.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@RestController // @resetController = @Controller + @ResponseBody 即为这两个注解的封装
@RequestMapping("user")
public class UserController extends BaseController {
    @Autowired
    private IUserService iUserService;


    @RequestMapping("reg")
//    @ResponseBody //此注解表示将数据以Json的形式传递给前端进行展示
    public JsonResult<Void> reg(User user){
        iUserService.reg(user);
        return new JsonResult<>(OK);
    }

//    @RequestMapping("reg")
//    public JsonResult<Void> reg(User user){
//        JsonResult<Void> jsonResult = new JsonResult<Void>();
//        try {
//            iUserService.reg(user);
//            jsonResult.setState(6666);
//            jsonResult.setMessage("注册成功！");
//        } catch (UsernameDuplicateException e) {
//            jsonResult.setState(4000);
//            jsonResult.setMessage("用户名已被注册！");
//        } catch (InsertException e){
//            jsonResult.setState(5000);
//            jsonResult.setMessage("注册时产生未知异常！");
//        }
//        return jsonResult;
//    }

    @RequestMapping("login")
    public JsonResult<User> login(String username, String password, HttpSession session){
        User data = iUserService.login(username,password);
        session.setAttribute("uid",data.getUid());
        session.setAttribute("username",data.getUsername());
        //获取session中的绑定数据
        return new JsonResult<User>(OK,data);
    }

    @RequestMapping("update_password")
    public JsonResult<Void> updatePassword(String password,String newPassword,HttpSession session) {

        Integer uid = getUidFromSession(session);
        String username = getUsernameFromSession(session);
        iUserService.updatePassword(uid,username,password,newPassword);
        return new JsonResult<>(OK);

    }


    @RequestMapping("get_by_uid")
    public JsonResult<User> getByUid(HttpSession session){
        User data = iUserService.getByUid(getUidFromSession(session));
        return new JsonResult<>(OK,data);

    }

    @RequestMapping("update_info")
    public JsonResult<Void> updateInfo(User user, HttpSession session){
        iUserService.updateInfo(user ,getUsernameFromSession(session),getUidFromSession(session));
        return new JsonResult<>(OK);
    }

}
