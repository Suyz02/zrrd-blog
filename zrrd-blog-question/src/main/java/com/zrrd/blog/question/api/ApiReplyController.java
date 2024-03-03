package com.zrrd.blog.question.api;


import com.zrrd.blog.question.service.IReplayService;
import com.zrrd.blog.util.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "问答管理公共API接口")
@RestController
@RequestMapping("/replay/api")
public class ApiReplyController {

    @Autowired
    private IReplayService replayService;

    @ApiOperation("根据问答ID查询所有评论")
    @GetMapping("/list/{questionId}")
    public Result findByQuestionId(@PathVariable String questionId) {
        return replayService.findByQuestionId(questionId);
    }
}
