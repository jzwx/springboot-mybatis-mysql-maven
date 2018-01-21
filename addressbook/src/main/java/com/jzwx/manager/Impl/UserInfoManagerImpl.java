/**
 * Chengzai.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.jzwx.manager.Impl;

import com.jzwx.domain.UserInfo;
import com.jzwx.info.UserInfoSearch;
import com.jzwx.manager.UserInfoManager;
import com.jzwx.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author jzwx
 * @version $Id: UserInfoManagerImpl, v 0.1 2017-12-11 18:01 jzwx Exp $
 */
@Service
public class UserInfoManagerImpl implements UserInfoManager {

    /**
     * 用户信息仓储接口
     * */
    @Autowired
    private UserInfoRepository userInfoRepository;

    /**
     * 注册用户
     *
     * @param userInfo 用户信息
     * @return
     */
    @Override
    public UserInfo reqistrationUserInfo(UserInfo userInfo) {
        return userInfoRepository.createUserInfo(userInfo);
    }

    /**
     * 更新用户信息
     *
     * @param userInfo 用户信息
     * @return
     */
    @Override
    public UserInfo updateUserInfo(UserInfo userInfo) {
        return userInfoRepository.updateUserInfo(userInfo);
    }

    /**
     * 根据id获删除用户信息
     *
     * @param id
     * @return
     */
    @Override
    public boolean deleteUserInfo(int id) {
        return userInfoRepository.deleteUserInfo(id);
    }

    /**
     * 根据id获取到用户信息
     *
     * @param id
     * @return
     */
    @Override
    public UserInfo getUserInfo(int id) {
        return userInfoRepository.getUserInfo(id);
    }

    /**
     * 查询用户列表信息
     *
     * @param userInfoSearch
     * @return
     */
    @Override
    public List<UserInfo> queryUserInfo(UserInfoSearch userInfoSearch) {
        return userInfoRepository.queryUserInfo(userInfoSearch);
    }
}