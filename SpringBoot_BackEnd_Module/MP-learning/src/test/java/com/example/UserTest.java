package com.example;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.domain.dto.PageDTO;
import com.example.domain.po.User;
import com.example.domain.query.PageQuery;
import com.example.domain.query.UserQuery;
import com.example.domain.vo.UserVo;
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
        queryWrapper.eq(User::getStatus, UserStatus.NORMAL);

        List<User> list = userMapper.selectList(queryWrapper);

        list.forEach(System.out::println);
    }


    @Test
    void Pagination() {

        /**
         * Controller
         */
        // User query conditions
        UserQuery query = new UserQuery();
        String name = query.getName();
        Integer status = query.getStatus();

        //Pagination condition
        int pageNo = 1, pageSize = 3;
        PageQuery pageQuery = new PageQuery()
                .setPageNo(pageNo)
                .setPageSize(pageSize)
                .setSortBy("balance")
                .setIsAsc(false);
        /**
         *Service
         */
        Page<User> page = Page.of(pageQuery.getPageNo(), pageQuery.getPageSize());
        // Order
        OrderItem orderItem = new OrderItem();
        if (pageQuery.getSortBy() != null) {
            orderItem.setColumn(pageQuery.getSortBy())
                    .setAsc(pageQuery.getIsAsc());
        } else {
            orderItem.setColumn("update_time")
                    .setAsc(pageQuery.getIsAsc());
        }
        page.addOrder(orderItem);


        // Query Page
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();   //Query Wrapper
        Page<User> userPage = userMapper.selectPage(page, null);
        List<User> records = userPage.getRecords();
        // records.forEach(System.out::println);


        //Check if the result is null.
        if (records != null) {

        }

        // Convert records into UserVo
        List<UserVo> userVos = BeanUtil.copyToList(records, UserVo.class);

        //Store to PageDTO
        PageDTO<UserVo> userVoPageDTO = new PageDTO<UserVo>(userPage.getTotal(), userPage.getPages(), userVos);
        System.out.println(userVoPageDTO);

    }
}
