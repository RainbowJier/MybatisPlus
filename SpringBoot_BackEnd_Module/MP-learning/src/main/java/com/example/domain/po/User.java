package com.example.domain.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.enums.UserStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * 用户表(User)实体类
 *
 * @author RainbowJier
 * @since 2024-04-17 13:07:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "User对象", description = "用户表")
@TableName(value = "user", autoResultMap = true)  // open the Handler
public class User {
    @ApiModelProperty(value = "用户id")
    @TableId(value = "id")
    private Long id;

    @ApiModelProperty(value = "用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "密码")
    @TableField("password")
    private String password;

    @ApiModelProperty(value = "注册手机号")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "详细信息")
    private String info;

    @ApiModelProperty(value = "使用状态（1正常 2冻结）")
    @TableField("status")
    private UserStatus status;

    @ApiModelProperty(value = "账户余额")
    @TableField("balance")
    private Integer balance;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;

}

