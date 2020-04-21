package com.gblfy.shiro.mapper;

import com.gblfy.shiro.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author http://gblfy.com
 * @Description TODO
 * @Date 2019/9/14 15:34
 * @version1.0
 */
@Mapper
public interface RoleMapper {

    int delete(Long roleId);

    int insert(Role role);

    Role findById(Long roleId);

    int updateByParams(Role role);


    List<Role> listRoleByUserId(Long userId);

}