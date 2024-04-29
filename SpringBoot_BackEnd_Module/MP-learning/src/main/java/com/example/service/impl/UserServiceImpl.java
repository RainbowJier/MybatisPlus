package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.domain.dto.PageDTO;
import com.example.domain.po.ResponseResult;
import com.example.domain.po.User;
import com.example.domain.query.UserQuery;
import com.example.domain.vo.UserVo;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author RainbowJier
 * @since 2024-04-29
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public ResponseResult userQuery(UserQuery userQuery) {
        Page<User> page = Page.of(userQuery.getPageNo(), userQuery.getPageSize());
        // Order
        OrderItem orderItem = new OrderItem();
        if (userQuery.getSortBy() != null) {
            orderItem.setColumn(userQuery.getSortBy())
                    .setAsc(userQuery.getIsAsc());
        } else {
            orderItem.setColumn("update_time")
                    .setAsc(userQuery.getIsAsc());
        }
        page.addOrder(orderItem);


        // Query Page
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();   //Query Wrapper
        Page<User> userPage = userMapper.selectPage(page, null);

        PageDTO<UserVo> userPageDTO = PageDTO.of(userPage, UserVo.class);

        //Store to Result
        ResponseResult<PageDTO> responseResult = new ResponseResult<>(200, "Response Successfully.", userPageDTO);

        return responseResult;
    }
}
