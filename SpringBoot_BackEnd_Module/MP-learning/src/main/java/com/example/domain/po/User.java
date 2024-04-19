package com.example.domain.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表(User)实体类
 *
 * @author makejava
 * @since 2024-04-17 13:07:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class User implements Serializable {
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 注册手机号
     */
    private String phone;
    /**
     * 详细信息
     */
    private String info;
    /**
     * 使用状态（1正常 2冻结）
     */
    private Integer status;
    /**
     * 账户余额
     */
    private Integer balance;

    private Date createTime;

    private Date updateTime;

}

