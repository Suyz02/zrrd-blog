package com.zrrd.blog.question.mapper;

import com.zrrd.blog.entities.Replay;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 回答信息表 Mapper 接口
 * </p>
 *
 * @author chen
 * @since 2023-04-28
 */
public interface ReplayMapper extends BaseMapper<Replay> {


    List<Replay> findByQuestionId(@Param("questionId") String questionId);
}
