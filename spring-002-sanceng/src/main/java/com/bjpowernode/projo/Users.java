package com.bjpowernode.projo;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 10:53
 * 实体类
 */
public class Users {
    private Integer uid;
    private String uname;
    private Integer uage;

    public Users() {
    }

    public Users(Integer uid, String uname, Integer uage) {
        this.uid = uid;
        this.uname = uname;
        this.uage = uage;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                '}';
    }
}
