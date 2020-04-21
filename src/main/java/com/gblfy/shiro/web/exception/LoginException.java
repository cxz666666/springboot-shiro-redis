package com.gblfy.shiro.web.exception;

/**
 * @author http://gblfy.com
 * @Description 登录异常
 * @Date 2019/9/14 15:34
 * @version1.0
 */
public class LoginException extends RuntimeException {
    public LoginException() {
        super();
    }

    public LoginException(String message) {
        super(message);
    }

    public LoginException(String message, Throwable cause) {
        super(message, cause);
    }
}
