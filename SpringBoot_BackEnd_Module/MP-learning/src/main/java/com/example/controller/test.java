package com.example.controller;

import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：TODO
 * @Author： RainbowJier
 * @Data： 2024/4/17 13:38
 */
@RestController
public class test {
    @Autowired
    private UserMapper userMapper;
}
