/**
 * Chengzai.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.jzwx.domain;

import lombok.Data;

/**
 *
 * @author jzwx
 * @version $Id: UserInfo, v 0.1 2017-12-11 17:01 jzwx Exp $
 */
@Data
public class UserInfo {
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