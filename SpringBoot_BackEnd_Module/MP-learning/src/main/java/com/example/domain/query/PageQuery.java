package com.example.domain.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Description：TODO
 * @Author： RainbowJier
 * @Data： 2024/4/29 15:12
 */
@Data
@Accessors(chain = true)
@ApiModel(description = "分页查询实体")
@AllArgsConstructor
@NoArgsConstructor
public class PageQuery {
    @ApiModelProperty("Page No")
    private Integer pageNo;

    @ApiModelProperty("Page size")
    private Integer pageSize;

    @ApiModelProperty("Sorted filed")
    private String sortBy;

    @ApiModelProperty("Asc")
    private Boolean isAsc;
}