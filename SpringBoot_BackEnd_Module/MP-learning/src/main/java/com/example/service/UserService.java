package com.example.service;

import com.example.domain.po.ResponseResult;
import com.example.domain.query.UserQuery;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author RainbowJier
 * @since 2024-04-29
 */
public interface UserService {

    ResponseResult userQuery(UserQuery query);

}
