package com.zrrd.blog.article.service.impl;

import com.zrrd.blog.entities.QuestionLabel;
import com.zrrd.blog.article.mapper.QuestionLabelMapper;
import com.zrrd.blog.article.service.IQuestionLabelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 问题标签中间表 服务实现类
 * </p>
 *
 * @author chen
 * @since 2024-03-03
 */
@Service
public class QuestionLabelServiceImpl extends ServiceImpl<QuestionLabelMapper, QuestionLabel> implements IQuestionLabelService {

}
