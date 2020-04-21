package com.gblfy.shiro.service;

import com.gblfy.shiro.util.CacheUser;

/**
 * @author http://gblfy.com
 * @Description TODO
 * @Date 2019/9/14 15:34
 * @version1.0
 */
public interface UserService {

    /**
     * 登入
     * @param username
     * @param password
     * @return
     */
    CacheUser login(String username, String password);


    /**
     * 登出
     */
    void logout();



}
