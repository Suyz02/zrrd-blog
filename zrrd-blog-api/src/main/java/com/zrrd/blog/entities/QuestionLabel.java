package com.zrrd.blog.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 问题标签中间表
 * </p>
 *
 * @author chen
 * @since 2024-03-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("zrrd_question_label")
@ApiModel(value="QuestionLabel对象", description="问题标签中间表")
public class QuestionLabel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty(value = "文章 id")
    private String questionId;

    @ApiModelProperty(value = "标签id")
    private String labelId;

    @ApiModelProperty(value = "创建时间")
    private Date createDate;


}
