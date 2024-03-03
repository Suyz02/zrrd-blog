package com.zrrd.blog.article.controller;


import com.zrrd.blog.article.req.LabelREQ;
import com.zrrd.blog.article.service.ILabelService;
import com.zrrd.blog.entities.Label;
import com.zrrd.blog.util.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 标签表 前端控制器
 * </p>
 *
 * @author chen
 * @since 2024-02-18
 */
@Api(value = "二级菜单Label通用查询对象",description = "二级菜单查询条件")
@RestController
@RequestMapping("/label")
public class LabelController {

    @Autowired
    private ILabelService labelService;

    @ApiOperation("根据标签名称与分类id查询页面列表")
    @PostMapping("/search")
    public Result search(@RequestBody LabelREQ req) {
        return labelService.queryPage(req);
    }

    @ApiOperation(value = "修改标签信息接口")
    @PutMapping
    public Result update(@RequestBody Label label) {
        labelService.updateById(label);
        return Result.ok();
    }

    @ApiOperation("删除标签接口")
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id) {
        labelService.removeById(id);
        return Result.ok();
    }

    @ApiOperation("新增标签信息接口")
    @PostMapping
    public Result save(@RequestBody Label label) {
        labelService.save(label);
        return Result.ok();
    }
}
