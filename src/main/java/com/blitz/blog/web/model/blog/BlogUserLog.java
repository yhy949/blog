package com.blitz.blog.web.model.blog;

import java.util.Date;

public class BlogUserLog {
    private String userid;
    private String id;
    private String title;
    private Date createTime;
    private Integer readtimes;
    private Integer goodtimes;
    private String content;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getReadtimes() {
        return readtimes;
    }

    public void setReadtimes(Integer readtimes) {
        this.readtimes = readtimes;
    }

    public Integer getGoodtimes() {
        return goodtimes;
    }

    public void setGoodtimes(Integer goodtimes) {
        this.goodtimes = goodtimes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "BlogUserLog [userid=" + userid + ", id=" + id + ", title=" + title + ", createTime=" + createTime + ", readtimes=" + readtimes + ", goodtimes=" + goodtimes + ", content=" + content + "]";
    }
}