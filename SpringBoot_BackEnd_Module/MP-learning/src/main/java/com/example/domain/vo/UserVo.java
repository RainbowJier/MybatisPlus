package com.example.domain.vo;

import com.example.enums.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description：TODO
 * @Author： RainbowJier
 * @Data： 2024/4/26 18:13
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserVo {
    private Long id;
    /**
     * 用户名
     */
    private String username;
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
    private UserStatus status;

    private List<AddressVo> address;
}
