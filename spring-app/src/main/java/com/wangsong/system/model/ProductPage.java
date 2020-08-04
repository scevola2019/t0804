package com.wangsong.system.model;

import com.wangsong.common.model.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ProductPage", description = "产品分页")
public class ProductPage extends Page implements Serializable {

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
    @ApiModelProperty(value = "操作")
    private String todo;
}