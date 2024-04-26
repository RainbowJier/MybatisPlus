package com.example.domain.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.example.enums.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户表(User)实体类
 *
 * @author RainbowJier
 * @since 2024-04-17 13:07:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user", autoResultMap = true)
public class User {
    @TableId(value = "id")
    private Long id;

    private String username;

    private String password;

    private String phone;

    @TableField(typeHandler = JacksonTypeHandler.class)
    private UserInfo info;

    private UserStatus status;

    private Integer balance;

    private Date createTime;

    private Date updateTime;
}

