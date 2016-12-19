package com.blitz.blog.web.model.blog;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BlogFriendKey implements Serializable {
    private String userid;
    private String friendid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getFriendid() {
        return friendid;
    }

    public void setFriendid(String friendid) {
        this.friendid = friendid == null ? null : friendid.trim();
    }

    @Override
    public String toString() {
        return "BlogFriendKey [userid=" + userid + ", friendid=" + friendid + "]";
    }
}