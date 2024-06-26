package com.example.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description：TODO
 * @Author： RainbowJier
 * @Data： 2024/4/26 18:44
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressVo {
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
}
