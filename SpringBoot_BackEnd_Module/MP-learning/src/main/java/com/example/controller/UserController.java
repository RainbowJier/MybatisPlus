package com.example.controller;


import com.example.domain.po.ResponseResult;
import com.example.domain.query.UserQuery;
import com.example.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author RainbowJier
 * @since 2024-04-29
 */
@Api(tags = "Test Swagger")
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("Test Controller")
    @PostMapping("query")
    public ResponseResult userQuery(@RequestBody UserQuery userQuery) {

        return userService.userQuery(userQuery);
    }

}
