package com.zrrd.blog.article.req;

import com.zrrd.blog.entities.Article;
import com.zrrd.blog.util.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "查询用户文章通用对象")
public class ArticleUserREQ extends BaseRequest<Article> {

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "是否公开")
    private String isPublic;

}
