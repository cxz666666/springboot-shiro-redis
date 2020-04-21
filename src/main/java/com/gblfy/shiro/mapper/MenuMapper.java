package com.gblfy.shiro.mapper;


import com.gblfy.shiro.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * @author http://gblfy.com
 * @Description TODO
 * @Date 2019/9/14 15:34
 * @version1.0
 */
@Mapper
public interface MenuMapper {

    int delete(Long menuId);

    int insert(Menu menu);

    Menu findById(Long menuId);

    int updateByParams(Menu menu);

    List<Menu> listMenuByRoleId(Long roleId);

}