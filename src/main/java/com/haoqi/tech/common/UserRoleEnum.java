package com.haoqi.tech.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by suzhengxiao on 2018/7/30.
 */

@AllArgsConstructor
@Getter
public enum UserRoleEnum {
    REPAIR_WORKER (1,"维修人"),
    PROJECT_MANAGER (2,"项目经理"),
    AREA_MANAGER(3,"区域负责人");

    private Integer code;

    private String role;

    public static String getName(int code) {
        for (UserRoleEnum c : UserRoleEnum.values()) {
            if (c.getCode() == code) {
                return c.role;
            }
        }
        return null;
    }
}
