package com.wangsong.system.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Dict", description = "字典")
public class Product implements Serializable {
    @ApiModelProperty(value = "id")
    private String id;
    @ApiModelProperty(value = "产品名称")
    private String name;
    @ApiModelProperty(value = "品类")
    private String type;
    @ApiModelProperty(value = "型号")
    private String code;
    @ApiModelProperty(value = "功能入口")
    private String access;



}