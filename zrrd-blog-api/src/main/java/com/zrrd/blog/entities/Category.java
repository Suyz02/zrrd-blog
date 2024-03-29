package com.zrrd.blog.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@ApiModel("文章文类实体")
@TableName("zrrd_category")
@Data
public class Category implements Serializable {

    private static final  long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty(value = "分类名称")
    private String name;
    @ApiModelProperty(value = "备注")
    private String remark;
    @ApiModelProperty(value = "分类状态")
    private Integer status;
    @ApiModelProperty(value = "排序序号")
    private Integer sort;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_date")
    private Date createDate;

    @ApiModelProperty(value = "修改时间")
    @TableField(value = "update_date")
    private Date updateDate;

    @ApiModelProperty(value = "该分类下的二级菜单标签集合")
    @TableField(exist = false)
    private List<Label> labelList;

}
