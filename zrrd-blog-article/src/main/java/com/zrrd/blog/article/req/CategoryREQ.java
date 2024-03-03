package com.zrrd.blog.article.req;

import com.zrrd.blog.entities.Category;
import com.zrrd.blog.util.base.BaseRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "categoryREQ条件对象",description = "分类条件查询")
@Data
public class CategoryREQ extends BaseRequest<Category> {

    //分类名称
    @ApiModelProperty(value = "分类名称")
    private String name;

    //分类状态（1：正常，0：禁用）
    @ApiModelProperty(value = "分类状态(1：正常, 0：禁用)")
    private Integer status;
}
