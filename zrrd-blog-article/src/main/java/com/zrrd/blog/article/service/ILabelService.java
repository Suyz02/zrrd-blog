package com.zrrd.blog.article.service;

import com.zrrd.blog.article.req.LabelREQ;
import com.zrrd.blog.entities.Label;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zrrd.blog.util.base.Result;

/**
 * <p>
 * 标签表 服务类
 * </p>
 *
 * @author chen
 * @since 2024-02-18
 */
public interface ILabelService extends IService<Label> {

    Result queryPage(LabelREQ req);

}
