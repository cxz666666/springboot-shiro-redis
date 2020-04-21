package com.gblfy.shiro.util;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author http://gblfy.com
 * @Description 缓存用户信息
 * @Date 2019/9/14 15:34
 * @version1.0
 */
@Data
@Builder
public class CacheUser implements Serializable {


    private static final long serialVersionUID = -3977272347775243323L;
    private String email;

    private String name;

    private Integer state;

    private String username;

    private String token;
}
