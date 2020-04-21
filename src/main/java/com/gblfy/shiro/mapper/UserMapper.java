package com.gblfy.shiro.mapper;

import com.gblfy.shiro.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author http://gblfy.com
 * @Description TODO
 * @Date 2019/9/14 15:34
 * @version1.0
 */
@Mapper
public interface UserMapper {

    int delete(Long userId);

    int insert(User user);


    User findById(Long userId);


    User findByUsername(String username);



    int updateByParams(User record);
}