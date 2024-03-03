package com.zrrd.blog.question.service.impl;

import com.zrrd.blog.entities.QuestionLabel;
import com.zrrd.blog.question.mapper.QuestionLabelMapper;
import com.zrrd.blog.question.service.IQuestionLabelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 问题标签中间表 服务实现类
 * </p>
 *
 * @author chen
 * @since 2023-04-28
 */
@Service
public class QuestionLabelServiceImpl extends ServiceImpl<QuestionLabelMapper, QuestionLabel> implements IQuestionLabelService {

}
