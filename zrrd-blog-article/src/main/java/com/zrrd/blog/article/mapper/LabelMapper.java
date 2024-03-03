package com.zrrd.blog.article.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zrrd.blog.article.req.LabelREQ;
import com.zrrd.blog.entities.Label;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import feign.Param;

/**
 * <p>
 * 标签表 Mapper 接口
 * </p>
 *
 * @author chen
 * @since 2024-02-18
 */
public interface LabelMapper extends BaseMapper<Label> {

    IPage<Label> queryPage(IPage<Label> page, @Param("req")LabelREQ req);

}
