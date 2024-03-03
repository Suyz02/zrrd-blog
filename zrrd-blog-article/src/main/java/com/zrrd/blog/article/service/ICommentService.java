package com.zrrd.blog.article.service;

import com.zrrd.blog.entities.Comment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zrrd.blog.util.base.Result;

/**
 * <p>
 * 评论信息表 服务类
 * </p>
 *
 * @author chen
 * @since 2024-03-03
 */
public interface ICommentService extends IService<Comment> {

    Result findByArticleId(String articleId);

    /**
     * 删除评论
     * */
    Result deleteById(String id);

}
