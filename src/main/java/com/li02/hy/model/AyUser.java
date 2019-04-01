package com.li02.hy.model;


/*
 *@Author: lihaoyu
 *@Date:2019/3/29,15:57
 *@Description:
 *@Modified:
 */  
public class AyUser {
    private String id;

    private String name;

    private String password;

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}