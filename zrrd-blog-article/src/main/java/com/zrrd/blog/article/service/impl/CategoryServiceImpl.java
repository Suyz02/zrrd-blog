package com.zrrd.blog.article.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrrd.blog.article.mapper.CategoryMapper;
import com.zrrd.blog.article.req.CategoryREQ;
import com.zrrd.blog.article.service.ICategoryService;
import com.zrrd.blog.entities.Category;
import com.zrrd.blog.util.base.Result;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {
    @Override
    public Result querPage(CategoryREQ req) {

        QueryWrapper<Category> wrapper = new QueryWrapper<>();

        if (StringUtils.isNotEmpty(req.getName())){
            wrapper.like("name",req.getName());
        }
        if (req.getStatus() != null){
            wrapper.eq("status",req.getStatus());
        }
        wrapper.orderByDesc("status").orderByAsc("sort");

        IPage<Category> data = baseMapper.selectPage(req.getPage(),wrapper);

        return Result.ok(data);
    }

    @Override
    public Result findAllNormal() {
        QueryWrapper<Category> wrapper = new QueryWrapper<>();
        wrapper.eq("status",1);
        List<Category> list = baseMapper.selectList(wrapper);
        return Result.ok(list);
    }

    @Override
    public Result findCategoryAndLabel() {
        return Result.ok(baseMapper.findCategoryAndLabel());
    }

    @Override
    public boolean updateById(Category category) {
        category.setUpdateDate(new Date());
        return super.updateById(category);
    }
}
