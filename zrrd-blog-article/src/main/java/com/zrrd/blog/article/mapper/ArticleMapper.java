package com.zrrd.blog.article.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zrrd.blog.article.req.ArticleListREQ;
import com.zrrd.blog.entities.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import feign.Param;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 文章信息表 Mapper 接口
 * </p>
 *
 * @author chen
 * @since 2024-02-16
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
    Article findArticleAndLabelId(String id);

    /*
     * 新增文章标签中间表数据
     * */
    boolean saveArticleLabel(@Param("articleId") String articleId, @Param("labelIds") List<String> labelIds);

    /*
    * 通过文章id删除中间表数据
    * */
    boolean deleteArticleLabel(@Param("articleId") String articleId);

    /*
     * 查询分类或标签下文章
     * */
    IPage<Article> findListByLabelIdOrCategoryId(IPage<Article> id, @Param("req") ArticleListREQ req);

    /*
     * 查询每个分类下的文章数量
     * */
    List<Map<String,Object>> selectCategoryTotal();
}