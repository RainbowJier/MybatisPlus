package com.example.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description：TODO
 * @Author： RainbowJier
 * @Data： 2024/4/26 20:02
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserInfo {
    private Integer age;
    private String intro;
    private String gender;
}
