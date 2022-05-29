package com.bjpowernode.pojo;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/28 19:16
 * 实体类
 */
public class Accounts {
    private int aid;
    private String aname;
    private String acontent;

    public Accounts() {
    }

    public Accounts(int aid, String aname, String acontent) {
        this.aid = aid;
        this.aname = aname;
        this.acontent = acontent;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAcontent() {
        return acontent;
    }

    public void setAcontent(String acontent) {
        this.acontent = acontent;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", acontent='" + acontent + '\'' +
                '}';
    }
}
