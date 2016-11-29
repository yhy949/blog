package com.blitz.blog.utils.message;

import java.io.Serializable;

/**
 * Created by yhy on 2016/6/29.
 */

/**
 * 返回消息信息类
 *
 * @author yhy
 * @since 2016-6-29
 */
public class ResultMessage implements Serializable{
    private static final long serialVersionUID = 6288374846131788743L;
    /**
     * 信息
     */
    private String message;

    /**
     * 状态码
     */
    private int statusCode;

    /**
     * 是否成功
     */
    private boolean success;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public ResultMessage() {

    }

    public ResultMessage(String message, int statusCode, boolean success) {
        this.message = message;
        this.statusCode = statusCode;
        this.success = success;
    }

}
