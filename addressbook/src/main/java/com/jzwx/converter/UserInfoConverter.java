/**
 * Chengzai.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.jzwx.converter;

import com.jzwx.domain.UserInfo;
import com.jzwx.entity.UserInfoDO;
import org.springframework.beans.BeanUtils;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jzwx
 * @version $Id: UserInfoConverter, v 0.1 2017-12-11 17:19 jzwx Exp $
 */
public class UserInfoConverter {
    /**
     * 根据UserInfo转换为UserInfoDO
     *
     * @param userInfo
     * @return
     */
    public static UserInfoDO convertToUserInfoDO(UserInfo userInfo) {
        if(userInfo == null){
            return null;
        }
        UserInfoDO userInfoDO = new UserInfoDO();
        BeanUtils.copyProperties(userInfo, userInfoDO);
        return userInfoDO;
    }

    /**
     * 根据UserInfoDO转换为UserInfo
     *
     * @param userInfoDO
     * @return
     */
    public static UserInfo convertToUserInfo(UserInfoDO userInfoDO) {
        if(userInfoDO == null){
            return null;
        }
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoDO, userInfo);
        return userInfo;
    }

    /***************************************************/
    /**
     * 根据userInfoDOList列表转换为userInfoList列表,分页时用
     *
     * @return
     */
    public static List<UserInfo> convertToUserInfoList(List<UserInfoDO> userInfoDOList) {

        List<UserInfo> userInfoList = new ArrayList<>();
        BeanUtils.copyProperties(userInfoDOList, userInfoList);
        if (userInfoDOList != null && userInfoDOList.size() > 0) {
            for (UserInfoDO userInfoDO : userInfoDOList) {
                userInfoList.add(convertToUserInfo(userInfoDO));
            }
        }
        return userInfoList;
    }
}