package com.example.domain.dto;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;


/**
 * @Description：TODO
 * @Author： RainbowJier
 * @Data： 2024/4/29 15:15
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Page Result")
public class PageDTO<T> {
    @ApiModelProperty("Page Size")
    private Long total;

    @ApiModelProperty("Total Pages")
    private Long pages;

    @ApiModelProperty("Result List")
    private List<T> list;


    /**
     * 泛型方法
     * Process null page
     *
     * @param page
     * @param <P>  只有加上这个，说明这个方法是泛型方法
     * @return
     */
    public static <P, V> PageDTO<V> empty(Page<P> page) {
        return new PageDTO<>(page.getPages(), page.getTotal(), Collections.emptyList());
    }


    /**
     * Convert data
     *
     * @param page
     * @param voClass
     * @param <P>
     * @param <V>
     * @return
     */
    public static <P, V> PageDTO<V> of(Page<P> page, Class<V> voClass) {
        List<P> records = page.getRecords();
        if (records.isEmpty()) {
            return empty(page);
        }

        // Convert data
        List<V> vos = BeanUtil.copyToList(records, voClass);

        // Return
        return new PageDTO<>(page.getPages(), page.getTotal(), vos);
    }

}