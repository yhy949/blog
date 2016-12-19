package com.blitz.blog.web.model.blog;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BlogLeaveMsgKey implements Serializable {
    private String userid;
    private String leaverid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getLeaverid() {
        return leaverid;
    }

    public void setLeaverid(String leaverid) {
        this.leaverid = leaverid == null ? null : leaverid.trim();
    }

    @Override
    public String toString() {
        return "BlogLeaveMsgKey [userid=" + userid + ", leaverid=" + leaverid + "]";
    }
}