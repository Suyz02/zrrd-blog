package com.zrrd.blog.system.service;

import com.zrrd.blog.entities.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zrrd.blog.system.req.SysUserREQ;
import com.zrrd.blog.util.base.Result;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author chen
 * @since 2023-05-05
 */
public interface ISysUserService extends IService<SysUser> {

    Result queryPage(SysUserREQ req);

    /**
     * 根据用户id查询角色ids
     * */
    Result findRoleIdsById(String id);


    /**
     * 新增用户角色
     * */
    Result saveUserRole(String userId, List<String> roleIds);

    /**
     * 根据id删除角色
     */
    Result deleteById(String id);

}
