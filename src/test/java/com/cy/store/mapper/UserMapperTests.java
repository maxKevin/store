package com.cy.store.mapper;

import com.cy.store.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest
//@RunWith注解：表示启动这个单元测试类（单元测试类是不能够运行的），需要传递一个参数，必须是SpringRunner的实例类型
@RunWith(SpringRunner.class)
public class UserMapperTests {
    //idea有检测功能，接口是不能直接创建Bean的（动态代理技术来解决实现类的装载）
    @Autowired
    private UserMapper userMapper;

    /**
     * 单元测试方法要求：就可以单独独立运行，不急用启动珍格格项目，就可以单独做测试
     *1.必须被@Test注解所修饰
     * 2.返回值必须是void
     * 3.方法的参数列表不指定任何值
     * 4.方法的访问修饰符必须是public
     */
    @Test
    public void insert() {
        List<String> nameList=new ArrayList<String>(Arrays.asList("dsad", "dsadasdqw","weeqqweqw"));
        for(String name : nameList) {
            User user = new User();
            user.setUsername(name);
            user.setPassword("123456");
            int rows = userMapper.insert(user);
            System.out.println(rows);
        }
    }


    @Test
    public void updateInfoByUid(){
        User user = new User();
        user.setUid(10);
        user.setEmail("dsadsa@163.com");
        user.setPhone("123456789");
        user.setGender(1);
        user.setIsDelete(0);
        user.setModifiedUser("admin");
        user.setModifiedTime(new Date());
        Integer rows = userMapper.updateInfoByUid(user);
        System.out.println(rows);
    }



    @Test
    public void findByUsername(){
        String name = "tony";
        User user = userMapper.findUserByUsername(name);
        System.out.println(user.toString());
    }

    @Test
    public void findByPassword(){
        String password = "123456";
        List<User> userList = userMapper.findUserByPassword(password);
        for(User user : userList){
            System.out.println(user.toString());
        }

    }







}
