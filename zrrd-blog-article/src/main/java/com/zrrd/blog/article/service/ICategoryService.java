package com.zrrd.blog.article.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zrrd.blog.article.req.CategoryREQ;
import com.zrrd.blog.entities.Category;
import com.zrrd.blog.util.base.Result;

public interface ICategoryService extends IService<Category> {

    Result querPage(CategoryREQ req);

    Result findCategoryAndLabel();
    Result findAllNormal();
}
