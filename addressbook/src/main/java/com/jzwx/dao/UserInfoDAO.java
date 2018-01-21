/**
 * Chengzai.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.jzwx.dao;

import com.jzwx.entity.UserInfoDO;
import com.jzwx.info.UserInfoSearch;
import com.jzwx.mapper.UserInfoDOMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author jzwx
 * @version $Id: UserInfoDAO, v 0.1 2017-12-11 16:24 jzwx Exp $
 */
@Repository
public class UserInfoDAO {

    @Autowired
    private UserInfoDOMapper userInfoDOMapper;

    public Long insert(UserInfoDO entity){return userInfoDOMapper.insert(entity);}

    public Long update(UserInfoDO entity){return userInfoDOMapper.update(entity);}

    public Long deleteByPrimary(@Param("id") int id){return userInfoDOMapper.deleteByPrimary(id);}

    public UserInfoDO getByPrimary(@Param("id")int id){return userInfoDOMapper.getByPrimary(id);}

    public List<UserInfoDO> queryUserInfo(UserInfoSearch userInfoSearch){
        return userInfoDOMapper.queryUserInfo(userInfoSearch);
    }
}