package com.zrrd.blog.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ArticleStatusEnum {

    DELETED(0,"已删除"),
    NOTCHECK(1,"未审核"),
    SUCCESS(3,"审核通过"),
    FAIL(3,"审核未通过");

    private int code;
    private String desc;

}
