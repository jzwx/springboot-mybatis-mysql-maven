/**
 * Chengzai.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.jzwx.controller;

import com.jzwx.domain.UserInfo;
import com.jzwx.form.UserInfoForm;
import com.jzwx.info.UserInfoSearch;
import com.jzwx.manager.UserInfoManager;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author jzwx
 * @version $Id: UserInfoController, v 0.1 2017-12-11 18:09 jzwx Exp $
 */
@Controller
@RequestMapping("/jzwx/userInfo")
public class UserInfoController {

    /** 用户信息管理接口*/
    @Autowired
    private UserInfoManager userInfoManager;

    /**
     * 根据id获取用户详情信息
     *
     * @return
     */
    @RequestMapping(value = "/getUserInfo",method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody UserInfo getUserInfo(@RequestParam int id){
        UserInfo userInfo=null;
        try{
            userInfo=userInfoManager.getUserInfo(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return userInfo;
    }

    /**
     * 创建用户详情信息
     *
     * @return
     */
    @RequestMapping(value = "/create",method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody UserInfo createUserInfo(@Validated UserInfoForm userInfoForm){
        UserInfo userInfo = getUserInfo(userInfoForm);
        userInfo=userInfoManager.reqistrationUserInfo(userInfo);
        return userInfo;
    }

    /**
     * 更新用户详情信息
     *
     * @return
     */
    @RequestMapping(value = "/update",method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody UserInfo updateUserInfo(@Validated UserInfoForm userInfoForm){
        UserInfo userInfo = getUserInfo(userInfoForm);
        userInfo=userInfoManager.updateUserInfo(userInfo);
        return userInfo;
    }

    /**
     * 删除用户详情信息
     *
     * @return
     */
    @RequestMapping(value = "/delete",method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody boolean deleteUserInfo(@RequestParam int id){
        boolean result = userInfoManager.deleteUserInfo(id);
        return result;
    }

    /**
     * 获取用户列表信息
     *
     * @return
     */
    @RequestMapping(value = "/queryUserInfo",method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody List<UserInfo> queryUserInfo(@Validated UserInfoSearch userInfoSearch){
        List<UserInfo> userInfoList = userInfoManager.queryUserInfo(userInfoSearch);
        return userInfoList;
    }

    public UserInfo getUserInfo(UserInfoForm userInfoForm){
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoForm,userInfo);
        return userInfo;
    }
}