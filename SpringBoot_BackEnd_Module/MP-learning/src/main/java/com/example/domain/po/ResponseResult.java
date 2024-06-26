package com.example.domain.po;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description：TODO
 * @Author： RainbowJier
 * @Data： 2024/4/29 16:56
 */
@Data
// If properties are null, and it is not converted into Json object.
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult<T> {
    private Integer code;
    private String msg;
    private T data;
}