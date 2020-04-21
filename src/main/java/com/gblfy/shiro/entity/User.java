package com.gblfy.shiro.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author http://gblfy.com
 * @Description 用户
 * @Date 2019/9/14 15:34
 * @version1.0
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -7090758275076388365L;
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 姓名
     */
    private String name;

    /**
     * 状态  0：禁用   1：正常
     */
    private Integer status;

    /**
     * 创建者ID
     */
    private Long createUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
