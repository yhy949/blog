package com.blitz.blog.web.model.blog;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BlogUserLogCommentKey implements Serializable {
    private String blogid;
    private String commerterid;

    public String getBlogid() {
        return blogid;
    }

    public void setBlogid(String blogid) {
        this.blogid = blogid == null ? null : blogid.trim();
    }

    public String getCommerterid() {
        return commerterid;
    }

    public void setCommerterid(String commerterid) {
        this.commerterid = commerterid == null ? null : commerterid.trim();
    }

    @Override
    public String toString() {
        return "BlogUserLogCommentKey [blogid=" + blogid + ", commerterid=" + commerterid + "]";
    }
}