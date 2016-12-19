package com.blitz.blog.web.model.blog;

@SuppressWarnings("serial")
public class BlogFriend extends BlogFriendKey {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Override
    public String toString() {
        return "BlogFriend [id=" + id + "]";
    }
}