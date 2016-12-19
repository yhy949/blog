package com.blitz.blog.web.model.blog;

import java.util.Date;

@SuppressWarnings("serial")
public class BlogAlbum extends BlogAlbumKey {
    private String id;
    private String name;
    private Date createTime;
    private String islocked;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIslocked() {
        return islocked;
    }

    public void setIslocked(String islocked) {
        this.islocked = islocked == null ? null : islocked.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Override
    public String toString() {
        return "BlogAlbum [id=" + id + ", name=" + name + ", createTime=" + createTime + ", islocked=" + islocked + ", password=" + password + "]";
    }
}