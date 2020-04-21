package com.gblfy.shiro.controller;

import com.gblfy.shiro.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author http://gblfy.com
 * @Description 测试主方法
 * @Date 2019/9/14 15:34
 * @version1.0
 */
@RestController
@Slf4j
@RequestMapping("user")
public class UserController {


    @Autowired
    private Response response;


    @GetMapping("list")
    @RequiresPermissions("user:list")
    public Response listUser() {
        return response.success("用户列表");
    }


    @GetMapping("{userId}")
    @RequiresPermissions("user:detail")
    public Response detailUser(@PathVariable("userId") Long userId) {
        return response.success("用户详情");
    }


    @PostMapping("add")
    @RequiresRoles("admin")
    @RequiresPermissions("user:add")
    public Response addUser() {
        return response.success("添加用户成功");
    }

    @DeleteMapping("del")
    @RequiresRoles("role")
    public Response delUser() {
        return response.success("删除用户");
    }


}
