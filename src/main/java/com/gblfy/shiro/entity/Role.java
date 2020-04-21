package com.gblfy.shiro.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author http://gblfy.com
 * @Description 角色
 * @Date 2019/9/14 15:34
 * @version1.0
 */
@Data
public class Role {
    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 备注
     */
    private String remark;

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