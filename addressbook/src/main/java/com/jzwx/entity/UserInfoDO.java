/**
 * Chengzai.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.jzwx.entity;

import lombok.Data;

/**
 *
 * @author jzwx
 * @version $Id: UserInfoDO, v 0.1 2017-12-11 14:54 jzwx Exp $
 */
@Data
public class UserInfoDO {
    /**
     * 用户id
     * */
    private int id;

    /**
     * 用户名
     * */
    private String userName;

    /**
     * 用户密码
     * */
    private String passWord;

    /**
     * 备注
     * */
    private String remark;
}