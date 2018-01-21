/**
 * Chengzai.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.jzwx.mapper;

import com.jzwx.entity.UserInfoDO;
import com.jzwx.info.UserInfoSearch;

import java.util.List;

/**
 *
 * @author jzwx
 * @version $Id: UserInfoDOMapper, v 0.1 2017-12-11 16:20 jzwx Exp $
 */
public interface UserInfoDOMapper {

    Long insert(UserInfoDO entity);

    Long update(UserInfoDO entity);

    Long deleteByPrimary(int id);

    UserInfoDO getByPrimary(int id);

    List<UserInfoDO> queryUserInfo(UserInfoSearch userInfoSearch);
}