package com.zrrd.blog.article.service.impl;

import com.zrrd.blog.entities.Question;
import com.zrrd.blog.article.mapper.QuestionMapper;
import com.zrrd.blog.article.service.IQuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 问题信息表 服务实现类
 * </p>
 *
 * @author chen
 * @since 2024-03-03
 */
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements IQuestionService {

}
