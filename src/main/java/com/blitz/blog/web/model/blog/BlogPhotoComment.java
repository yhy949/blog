package com.blitz.blog.web.model.blog;

import java.util.Date;

@SuppressWarnings("serial")
public class BlogPhotoComment extends BlogPhotoCommentKey {
    private String id;
    private String parentid;
    private String content;
    private Date commentTime;
    private Date replyTime;
    private String state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
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
        return "BlogPhotoComment [id=" + id + ", parentid=" + parentid + ", content=" + content + ", commentTime=" + commentTime + ", replyTime=" + replyTime + ", state=" + state + "]";
    }
}