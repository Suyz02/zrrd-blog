package com.zrrd.blog.article.req;

import com.zrrd.blog.entities.Label;
import com.zrrd.blog.util.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "二级菜单Label通用查询对象",description = "二级菜单查询条件")
@Data
public class LabelREQ extends BaseRequest<Label> {

    @ApiModelProperty(value = "标签名称")
    private String name;

    @ApiModelProperty(value = "标签属性分类ID")
    private String categoryId;
}
