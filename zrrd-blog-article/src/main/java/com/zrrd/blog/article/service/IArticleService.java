package com.zrrd.blog.article.service;

import com.zrrd.blog.article.req.ArticleListREQ;
import com.zrrd.blog.article.req.ArticleREQ;
import com.zrrd.blog.article.req.ArticleUserREQ;
import com.zrrd.blog.entities.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zrrd.blog.util.base.Result;

/**
 * <p>
 * 文章信息表 服务类
 * </p>
 *
 * @author chen
 * @since 2024-02-16
 */
public interface IArticleService extends IService<Article> {

    Result queryPage(ArticleREQ req);

    Result findArticleAndLabelById(String id);

    Result updateOrSave(Article article);

    Result updateStatus(String id, int code);

    Result findListByUserId(ArticleUserREQ req);

    Result updateThumhup(String id, int count);

    Result updateViewCount(String id);

    Result findListByLabelIdOrCategoryId(ArticleListREQ req);

    Result getArticleTotal();

    Result selectCategoryTotal();

}
