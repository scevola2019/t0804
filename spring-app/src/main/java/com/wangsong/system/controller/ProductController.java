package com.wangsong.system.controller;

import com.wangsong.common.controller.BaseController;
import com.wangsong.common.model.CodeEnum;
import com.wangsong.common.model.Result;
import com.wangsong.system.model.Product;
import com.wangsong.system.model.ProductPage;
import com.wangsong.system.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/system/product")
@Api(value = "产品管理")
public class ProductController extends BaseController {
    @Autowired
    private ProductService productService;

    @ApiOperation(value = "列表", httpMethod = "POST")
    @PreAuthorize("hasAuthority('/system/product/list')")
    @RequestMapping(value = "/list")
    @ResponseBody
    public Result list(@ModelAttribute ProductPage productPage) {
        return new Result(CodeEnum.SUCCESS.getCode(), productService.findTByPage(productPage));
    }

    @ApiOperation(value = "增加", httpMethod = "POST")
    @PreAuthorize("hasAuthority('/system/product/add')")
    @RequestMapping(value = "/add")
    @ResponseBody
    public Result add(@ModelAttribute Product product) {
        productService.insertProduct(product);
        return new Result(CodeEnum.SUCCESS.getCode(), null);
    }

    @ApiOperation(value = "更新", httpMethod = "POST")
    @PreAuthorize("hasAuthority('/system/product/update')")
    @RequestMapping(value = "/update")
    @ResponseBody
    public Result update(@ModelAttribute Product product) {
        Assert.notNull(product.getId(), CodeEnum.NO_NULL.getCode());
        productService.updateByPrimaryKeyProduct(product);
        return new Result(CodeEnum.SUCCESS.getCode(), null);

    }

    @ApiOperation(value = "删除", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", paramType = "form"),
    })
    @PreAuthorize("hasAuthority('/system/product/delete')")
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Result delete(String[] id) {
        productService.deleteByPrimaryKeyProduct(id);
        return new Result(CodeEnum.SUCCESS.getCode(), null);

    }

    @ApiOperation(value = "复选框", httpMethod = "POST")
    @RequestMapping(value = "/findProductByProduct")
    @ResponseBody
    public Result findProductByProduct(@ModelAttribute Product product) {
        return new Result(CodeEnum.SUCCESS.getCode(), productService.findTByT(product));
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", paramType = "form"),
    })
    @ApiOperation(value = "单条", httpMethod = "POST")
    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public Result selectByPrimaryKey(String id) {
        return new Result(CodeEnum.SUCCESS.getCode(), productService.selectByPrimaryKey(id));
    }

}
