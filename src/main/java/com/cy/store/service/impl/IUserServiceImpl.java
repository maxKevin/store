package com.cy.store.service.impl;


import com.cy.store.entity.User;
import com.cy.store.mapper.UserMapper;
import com.cy.store.service.IUserService;
import com.cy.store.service.ex.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.UUID;


//用户实现接口
//且将该类添加给Service进行管理，能够自动创建对象以及对象的维护
@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 用户规则校验，并执行加密插入操作
     *
     * @param user 用户注册对象
     */
    @Override
    public void reg(User user) {
        //获取用户名
        String username = user.getUsername();

        //利用findByUsername查找是否符合规则
        User result = userMapper.findUserByUsername(username);

        if (result != null) {
            throw new UsernameDuplicateException("出现重名的用户，数据无法插入");
        }

        /**
         * 数据加密方式，对于用户的密码，我们必须要给予一定的加密处理，当前比较流行的加密方式是MD5加密方式
         * 常见的加密形式（串 + 密码 + 串） 然后这个组合进行三次加密运算
         * 之前在数据库中存储的盐值信息就是我们为用户随机生成的串
         */

        String salt = UUID.randomUUID().toString().toUpperCase();
        user.setPassword(getMD5Password(salt, user.getPassword()));
        user.setSalt(salt);
        user.setIsDelete(0);
        user.setCreatedUser(username);
        user.setModifiedUser(username);
        Date date = new Date();
        user.setCreatedTime(date);
        user.setModifiedTime(date);

        // 检测数据是否正常插入
        Integer rows = userMapper.insert(user);
        if (rows == 0) {
            throw new InsertException("用户数据插入异常，请查看数据库是否宕机");
        }
    }

    /**
     *
     * @param user 需要更新的数据内容
     * @param username 操作人
     * @param uid 被更新的id
     */
    @Override
    public void updateInfo(User user, String username, Integer uid) {
        User result = userMapper.findUserByUid(uid);
        if (result == null || result.getIsDelete() == 1){
            throw new UserNotFoundException("用户不存在");
        }
        user.setUid(uid);
        user.setModifiedUser(username);
        Date modifiedTime = new Date();
        user.setModifiedTime(modifiedTime);
        Integer rows = userMapper.updateInfoByUid(user);
        if (rows != 1){
            throw new UpdateException("数据更新异常");
        }
    }

    @Override
    public User getByUid(Integer uid) {
        User result = userMapper.findUserByUid(uid);
        if(result == null || result.getIsDelete() ==1){
            throw new UserNotFoundException("用户不存在");
        }
        User user = new User();
        user.setUid(uid);
        user.setUsername(result.getUsername());
        user.setPhone(result.getPhone());
        user.setEmail(result.getEmail());
        user.setGender(result.getGender());
        return result;
    }

    @Override
    public User login(String username, String password) {
        User result = userMapper.findUserByUsername(username);
        if (result == null) {
            throw new UserNotFoundException("未找到相应的用户");
        }
        String pwd = getMD5Password(result.getSalt(), password);
        if (!pwd.equals(result.getPassword())) {
            throw new PasswordNotMatchException("用户名和账号不匹配");
        }
        if (result.getIsDelete() == 1) {
            throw new UserNotFoundException("用户已删除");
        }
        User user = new User();
        user.setUsername(result.getUsername());
        user.setUid(result.getUid());
        user.setAvatar(result.getAvatar());
        return user;
    }


    @Override
    public void updatePassword(Integer uid, String username, String password, String newPassword) {
        User result = userMapper.findUserByUid(uid);
        if (result == null || result.getIsDelete() == 1){
            throw new UserNotFoundException("用户未找到");
        }
        password = getMD5Password(result.getSalt(),password);

        if (!password.equals(result.getPassword())){
            throw new PasswordNotMatchException("用户密码不匹配");
        }
        newPassword = getMD5Password(result.getSalt(),newPassword);
        Date modifiedTime = new Date();
        int rows = userMapper.updatePasswordByUid(uid,newPassword,username,modifiedTime);
        if (rows != 1){
            throw new UpdateException("数据更新时产生异常，请及时查看数据库");
        }
    }

    /**
     * 创建MD5密码
     *
     * @param salt     盐值
     * @param password 原始密码
     * @return 生成加密后的密码
     */
    private String getMD5Password(String salt, String password) {
        for (int i = 0; i < 3; i++) {
            password = DigestUtils.md5DigestAsHex((salt + password + salt).getBytes()).toUpperCase();
        }
        return password;
    }

}
