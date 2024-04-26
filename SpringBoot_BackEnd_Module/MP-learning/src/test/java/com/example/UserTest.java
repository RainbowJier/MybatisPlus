package com.example;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.domain.po.User;
import com.example.enums.UserStatus;
import com.example.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Description：TODO
 * @Author： RainbowJier
 * @Data： 2024/4/26 18:17
 */
@SpringBootTest
public class UserTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    void test() {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();

//        queryWrapper.eq(User::getStatus, 1);

        queryWrapper.eq(User::getStatus, UserStatus.NORMAL);

        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }
}
