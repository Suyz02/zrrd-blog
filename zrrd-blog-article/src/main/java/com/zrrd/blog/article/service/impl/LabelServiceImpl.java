package com.zrrd.blog.article.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zrrd.blog.article.req.LabelREQ;
import com.zrrd.blog.entities.Label;
import com.zrrd.blog.article.mapper.LabelMapper;
import com.zrrd.blog.article.service.ILabelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrrd.blog.util.base.Result;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 标签表 服务实现类
 * </p>
 *
 * @author chen
 * @since 2024-02-18
 */
@Service
public class LabelServiceImpl extends ServiceImpl<LabelMapper, Label> implements ILabelService {

    @Override
    public Result queryPage(LabelREQ req) {

        IPage<Label> page = baseMapper.queryPage(req.getPage(),req);
        return Result.ok(page);
    }

    @Override
    public boolean updateById(Label label) {
        label.setUpdateDate(new Date());
        return super.updateById(label);
    }
}
