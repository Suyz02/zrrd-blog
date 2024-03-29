package com.zrrd.blog.system.req;

import com.zrrd.blog.entities.SysUser;
import com.zrrd.blog.util.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "通用用户查询对象",description = "用户条件查询对象")
public class SysUserREQ extends BaseRequest<SysUser> {

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "手机号")
    private String mobile;
}
