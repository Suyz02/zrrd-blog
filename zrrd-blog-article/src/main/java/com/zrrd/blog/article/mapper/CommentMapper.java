package com.zrrd.blog.article.mapper;

import com.zrrd.blog.entities.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 评论信息表 Mapper 接口
 * </p>
 *
 * @author chen
 * @since 2024-03-03
 */
public interface CommentMapper extends BaseMapper<Comment> {

    List<Comment> findByArticleId(@Param("articleId") String articleId);

}
