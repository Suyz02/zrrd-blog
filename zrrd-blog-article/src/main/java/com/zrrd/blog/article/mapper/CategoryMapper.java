package com.zrrd.blog.article.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zrrd.blog.entities.Category;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

    List<Category> findCategoryAndLabel();
}
