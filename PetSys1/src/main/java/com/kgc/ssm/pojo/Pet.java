package com.kgc.ssm.pojo;

import java.util.Date;

public class Pet {
    private Long petid;

    private String petname;

    private String petbreed;

    private String petsex;

    private String birthday;

    private String describle;

    public Long getPetid() {
        return petid;
    }

    public void setPetid(Long petid) {
        this.petid = petid;
    }

    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname == null ? null : petname.trim();
    }

    public String getPetbreed() {
        return petbreed;
    }

    public void setPetbreed(String petbreed) {
        this.petbreed = petbreed == null ? null : petbreed.trim();
    }

    public String getPetsex() {
        return petsex;
    }

    public void setPetsex(String petsex) {
        this.petsex = petsex == null ? null : petsex.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle == null ? null : describle.trim();
    }

}