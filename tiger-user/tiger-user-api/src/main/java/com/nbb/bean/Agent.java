package com.nbb.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * User: steak-yuqi
 * Date: 2017/9/12
 * Time: 14:55
 * Desc:
 */
@Data
public class Agent implements Serializable{
    private long id;
    private String nickName;
    private String trueName;
    private int money;//余额
    private Date regeditTime;
    private int sex;
    private int lv;
    private String phone;
    private String img;
    private String agentId;
    private String payPassWord;
    private String passWord;
    private Date modifyTime;
    private String address;
    //0为正常 1冻结
    private int frozen;
    //学历
    private String education;
    //年龄区间
    private String age;
    //职业
    private String occupation;
    //爱好
    private String hobby;
    //分享次数
    private int shareNum;

}
