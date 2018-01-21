/**
 * Chengzai.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.jzwx.repository.Impl;

import com.jzwx.converter.UserInfoConverter;
import com.jzwx.dao.UserInfoDAO;
import com.jzwx.domain.UserInfo;
import com.jzwx.entity.UserInfoDO;
import com.jzwx.info.UserInfoSearch;
import com.jzwx.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jzwx
 * @version $Id: UserInfoRepositoryImpl, v 0.1 2017-12-11 16:58 jzwx Exp $
 */
@Service
public class UserInfoRepositoryImpl implements UserInfoRepository {

    /**
     * 用户信息DAO
     */
    @Autowired
    private UserInfoDAO userInfoDAO;

    /**
     * 注册用户
     *
     * @param userInfo 用户信息
     * @return
     */
    @Override
    public UserInfo createUserInfo(UserInfo userInfo) {
        userInfoDAO.insert(UserInfoConverter.convertToUserInfoDO(userInfo));
        return userInfo;
    }

    /**
     * 更新用户信息
     *
     * @param userInfo 用户信息
     * @return
     */
    @Override
    public UserInfo updateUserInfo(UserInfo userInfo) {
        userInfoDAO.update(UserInfoConverter.convertToUserInfoDO(userInfo));
        return userInfo;
    }

    /**
     * 根据id获删除用户信息
     *
     * @param id
     * @return
     */
    @Override
    public boolean deleteUserInfo(int id) {
        Long result = userInfoDAO.deleteByPrimary(id);
        return result > 0 ? Boolean.TRUE : Boolean.FALSE;
    }

    /**
     * 根据id获取到用户信息
     *
     * @param id
     * @return
     */
    @Override
    public UserInfo getUserInfo(int id) {
        return UserInfoConverter.convertToUserInfo(userInfoDAO.getByPrimary(id));
    }

    /**
     * 查询用户列表信息
     *
     * @param userInfoSearch
     * @return
     */
    @Override
    public List<UserInfo> queryUserInfo(UserInfoSearch userInfoSearch) {
        List<UserInfoDO> userInfoDOList=userInfoDAO.queryUserInfo(userInfoSearch);
        return UserInfoConverter.convertToUserInfoList(userInfoDOList);
    }
}