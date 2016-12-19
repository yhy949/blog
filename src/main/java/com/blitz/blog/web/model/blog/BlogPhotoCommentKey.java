package com.blitz.blog.web.model.blog;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BlogPhotoCommentKey implements Serializable {
    private String albumid;
    private String commenterid;

    public String getAlbumid() {
        return albumid;
    }

    public void setAlbumid(String albumid) {
        this.albumid = albumid == null ? null : albumid.trim();
    }

    public String getCommenterid() {
        return commenterid;
    }

    public void setCommenterid(String commenterid) {
        this.commenterid = commenterid == null ? null : commenterid.trim();
    }

    @Override
    public String toString() {
        return "BlogPhotoCommentKey [albumid=" + albumid + ", commenterid=" + commenterid + "]";
    }
}