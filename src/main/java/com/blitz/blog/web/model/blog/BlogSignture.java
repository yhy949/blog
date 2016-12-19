package com.blitz.blog.web.model.blog;

import java.util.Date;

public class BlogSignture {
    private String userid;
    private String id;
    private String replyid;
    private String parentid;
    private Date publishTime;
    private Date replyTime;
    private String state;

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

    public String getReplyid() {
        return replyid;
    }

    public void setReplyid(String replyid) {
        this.replyid = replyid == null ? null : replyid.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    @Override
    public String toString() {
        return "BlogSignture [userid=" + userid + ", id=" + id + ", replyid=" + replyid + ", parentid=" + parentid + ", publishTime=" + publishTime + ", replyTime=" + replyTime + ", state=" + state + "]";
    }
}