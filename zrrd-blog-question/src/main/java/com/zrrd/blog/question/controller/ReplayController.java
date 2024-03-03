package com.zrrd.blog.question.controller;


import com.zrrd.blog.question.service.IReplayService;
import com.zrrd.blog.util.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 回答信息表 前端控制器
 * </p>
 *
 * @author chen
 * @since 2023-04-28
 */
@Api(value = "问答管理API接口")
@RestController
@RequestMapping("/replay")
public class ReplayController {


    @Autowired
    private IReplayService replayService;

    @ApiOperation("根据id删除评论")
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id) {
        return replayService.deleteById(id);
    }
}
