package com.example.domain.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Address)实体类
 *
 * @author RainbowJier
 * @since 2024-04-24 16:19:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("address")
public class Address implements Serializable {
    @TableId
    private Long id;
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 省
     */
    private String province;
    /**
     * 市
     */
    private String city;
    /**
     * 县/区
     */
    private String town;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 详细地址
     */
    private String street;
    /**
     * 联系人
     */
    private String contact;
    /**
     * 是否是默认 1默认 0否
     */
    private String isDefault;
    /**
     * 备注
     */
    private String notes;
    /**
     * 逻辑删除
     */
    private String deleted;

}

