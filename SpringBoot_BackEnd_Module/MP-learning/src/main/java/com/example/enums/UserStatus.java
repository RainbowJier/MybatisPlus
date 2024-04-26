package com.example.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Description：TODO
 * @Author： RainbowJier
 * @Data： 2024/4/26 18:13
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum UserStatus {
    NORMAL(1, "NORMAL"),
    FREEZE(2, "FREEZE");

    @EnumValue
    private int code;

    private String desc;

}
