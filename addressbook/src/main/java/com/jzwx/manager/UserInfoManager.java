/**
 * Chengzai.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.jzwx.manager;

import com.jzwx.domain.UserInfo;
import com.jzwx.info.UserInfoSearch;

import java.util.List;

/**
 *
 * @author jzwx
 * @version $Id: UserInfoManager, v 0.1 2017-12-11 18:01 jzwx Exp $
 */
public interface UserInfoManager {
    /**
     * 注册用户
     *
     * @param userInfo 用户信息
     * @return
     */
    UserInfo reqistrationUserInfo(UserInfo userInfo);

    /**
     * 更新用户信息
     *
     * @param userInfo 用户信息
     * @return
     */
    UserInfo updateUserInfo(UserInfo userInfo);

    /**
     * 根据id获删除用户信息
     *
     * @param id
     * @return
     */
    boolean deleteUserInfo(int id);

    /**
     * 根据id获取到用户信息
     *
     * @param id
     * @return
     */
    UserInfo getUserInfo(int id);

    /**
     * 查询用户列表信息
     *
     * @param userInfoSearch
     * @return
     */
    List<UserInfo> queryUserInfo(UserInfoSearch userInfoSearch);
}