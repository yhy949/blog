package com.blitz.blog.web.model.blog;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BlogAlbumKey implements Serializable {
    private String userid;
    private String coverid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getCoverid() {
        return coverid;
    }

    public void setCoverid(String coverid) {
        this.coverid = coverid == null ? null : coverid.trim();
    }

    @Override
    public String toString() {
        return "BlogAlbumKey [userid=" + userid + ", coverid=" + coverid + "]";
    }
}