package com.zrrd.blog.system.service;

import com.zrrd.blog.entities.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zrrd.blog.system.req.SysMenuREQ;
import com.zrrd.blog.util.base.Result;

/**
 * <p>
 * 菜单信息表 服务类
 * </p>
 *
 * @author chen
 * @since 2023-05-05
 */
public interface ISysMenuService extends IService<SysMenu> {

    /**
     * 根据菜单名称查询菜单列表
     * */
    Result queryList(SysMenuREQ req);

    /**
     * 根据菜单id删除
     */
    Result deleteById(String id);

}
