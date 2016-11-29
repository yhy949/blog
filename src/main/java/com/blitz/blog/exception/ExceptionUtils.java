package com.blitz.blog.exception;

/**
 * Created by yhy on 2016/6/29.
 */

/**
 * 异常信息工具类
 * @author yhy
 * @since 2016-6-29
 */
public class ExceptionUtils extends RuntimeException {

    public ExceptionUtils(String message) {
        super(message);
    }
}
