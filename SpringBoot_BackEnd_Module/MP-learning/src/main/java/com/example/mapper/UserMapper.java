package com.example.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.po.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description：TODO
 * @Author： RainbowJier
 * @Data： 2024/4/17 13:06
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
