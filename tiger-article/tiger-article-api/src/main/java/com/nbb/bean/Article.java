package com.nbb.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Article implements Serializable{
    private Integer id;
    private String title;
    private Integer commentnum;
    private Integer type;
    private Integer readsum;
    private Integer sharenum;
    private Integer playnum;
    private Date releasetime;
    private Integer awardreadsum;
    private Integer price;
    private Integer awardsum;
    private Integer awardgetnum;
    private String sharedetails;
    private String headtitle;
    private String sort;
    private Date modifytime;
    private String shareurl;
    private String appurl;
    private String img1;
    private String img2;
    private Boolean iswechat;
    private Boolean awardtype;
    private String img3;
    private String img4;
    private Double focustime;
    private Boolean isload;
    private Integer minmoney;
    private Integer randomnum;
    private Boolean free;
    private String videourl;
    private String videolength;
    private String detailpageurl;
    private Integer issort;
    private String img;
    private String lableid;
    private Integer likenum;
    private String channelid;
    private Integer count;
}