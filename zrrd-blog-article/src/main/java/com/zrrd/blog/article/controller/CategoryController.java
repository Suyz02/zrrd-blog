package com.zrrd.blog.article.controller;

import com.zrrd.blog.article.req.CategoryREQ;
import com.zrrd.blog.article.service.ICategoryService;
import com.zrrd.blog.entities.Category;
import com.zrrd.blog.util.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(value = "分类管理接口",description = "分类管理接口，提供分类处理的增删改查")
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @ApiOperation("根据分类名称与状态查询分类")
    @PostMapping("/search")
    public Result search(@RequestBody CategoryREQ req){
        return categoryService.querPage(req);
    }

    @ApiOperation("查询分类详情")
    @ApiImplicitParam(name = "id",value = "分类id",required = true)
    @GetMapping("/{id}")
    public Result view(@PathVariable("id") String id) {
        Category category = categoryService.getById(id);
        return Result.ok(category);
    }

    @ApiOperation("修改分类信息接口")
    @PutMapping
    public Result update(@RequestBody Category category) {
        categoryService.updateById(category);
        return Result.ok();
    }

    @ApiOperation("新增分类信息接口")
    @PostMapping
    public Result save(Category category) {
        categoryService.save(category);
        return Result.ok();
    }

    @ApiOperation("删除分类信息接口")
    @DeleteMapping("{id}")
    public Result delete(@PathVariable("id") String id) {
        categoryService.removeById(id);
        return Result.ok();
    }

    @ApiOperation("获取所有正常状态分类接口")
    @GetMapping("/list")
    public Result list() {
        return categoryService.findAllNormal();
    }

    @ApiOperation("查询正常状态分类下的所有标签")
    @GetMapping("/label/list")
    public Result findCategoryAndLabel() {
        return categoryService.findCategoryAndLabel();
    }
}
