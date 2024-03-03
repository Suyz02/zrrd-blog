package com.zrrd.blog.question.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zrrd.blog.entities.Question;
import com.zrrd.blog.entities.Replay;
import com.zrrd.blog.question.mapper.ReplayMapper;
import com.zrrd.blog.question.service.IQuestionService;
import com.zrrd.blog.question.service.IReplayService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrrd.blog.util.base.Result;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 回答信息表 服务实现类
 * </p>
 *
 * @author chen
 * @since 2023-04-28
 */
@Service
public class ReplayServiceImpl extends ServiceImpl<ReplayMapper, Replay> implements IReplayService {

    @Override
    public Result findByQuestionId(String questionId) {
        if (StringUtils.isEmpty(questionId)) {
            return Result.error("问题不能为空");
        }
        return Result.ok(baseMapper.findByQuestionId(questionId));
    }

    @Autowired
    private IQuestionService questionService;

    @Transactional
    @Override
    public Result deleteById(String id) {
        if (StringUtils.isEmpty(id)) {
            return Result.error("评论id不能为空");
        }
        List<String> ids = new ArrayList<>();
        ids.add(id);

        this.getIds(ids, id);

        // 1. 查询回答信息
        Replay replay = baseMapper.selectById(id);
        //2. 批量删除评论信息
        int size = baseMapper.deleteBatchIds(ids);
        // 3. 通过1 中查询回答信息的问题id去查询问答信息
        if (size > 0) {
            Question question = (Question) questionService.findById(replay.getQuestionId()).getData();
            question.setReply(question.getReply() - size);
            questionService.updateById(question);
        }
        return Result.ok();
    }

    private void getIds(List<String> ids, String parentId) {
        QueryWrapper<Replay> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id", parentId);
        List<Replay> replayList = baseMapper.selectList(wrapper);
        if (CollectionUtils.isNotEmpty(replayList)) {
            for (Replay replay : replayList) {
                String id = replay.getId();
                ids.add(id);
                this.getIds(ids, id);
            }
        }
    }
}
