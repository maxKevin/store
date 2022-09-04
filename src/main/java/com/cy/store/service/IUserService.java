package com.cy.store.service;

import com.cy.store.entity.User;

import javax.servlet.http.HttpSession;

/* 用户层接口*/
public interface IUserService {

    /**
     * 用户注册方法
     * @param user 用户注册对象
     */
    void reg(User user);

    /**
     * 用户的登录功能校验
     * @param username 用户账号
     * @param password 用户密码
     * @return 匹配成功则返回用户的数据，佩佩失败则返回null
     */
    User login(String username,String password);

    /**
     * 通过用户的id更新用户的信息
     * @param uid 数据id
     * @param username 使用者的名称
     * @param password 旧的密码
     * @param newPassword 新的密码
     */
    void updatePassword(Integer uid,String username,String password,String newPassword);

    /**
     * 更新用户的信息
     * @param user 需要更新的数据内容
     * @param username 操作人
     * @param uid 被更新的id
     */
    void updateInfo(User user, String username,Integer uid);

    /**
     * 通过uid寻找user对象
     * @param uid
     * @return
     */
    User getByUid(Integer uid);
}
