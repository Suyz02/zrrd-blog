package com.zrrd.blog.question.service;

import com.zrrd.blog.entities.Replay;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zrrd.blog.util.base.Result;

/**
 * <p>
 * 回答信息表 服务类
 * </p>
 *
 * @author chen
 * @since 2023-04-28
 */
public interface IReplayService extends IService<Replay> {

    /**
     * 根据问答ID查询所有评论
     */
    Result findByQuestionId(String questionId);

    /**
     * \
     * 批量删除评论
     */
    Result deleteById(String id);
}
