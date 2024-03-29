package com.zrrd.blog.question.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zrrd.blog.entities.Question;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zrrd.blog.entities.Replay;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 问题信息表 Mapper 接口
 * </p>
 *
 * @author chen
 * @since 2023-04-28
 */
public interface QuestionMapper extends BaseMapper<Question> {

    IPage<Question> findListByLabelId(IPage<Question> page, @Param("labelId") String labelId);

    Question findQuestionAndLabelIdsById(String id);

    boolean deleteQuestionLabel(@Param("questionId") String questionId);

    boolean saveQuestionLabel(@Param("questionId") String questionId, @Param("labelIds") List<String> labelIds);

}
