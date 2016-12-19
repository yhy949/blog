package com.blitz.blog.web.model.blog;

import java.util.Date;

public class BlogPhoto {
    private String albumid;
    private String id;
    private String photourl;
    private Date createTime;

    public String getAlbumid() {
        return albumid;
    }

    public void setAlbumid(String albumid) {
        this.albumid = albumid == null ? null : albumid.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl == null ? null : photourl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "BlogPhoto [albumid=" + albumid + ", id=" + id + ", photourl=" + photourl + ", createTime=" + createTime + "]";
    }
}