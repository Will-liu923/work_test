package com.lw.pojo;

import java.util.Date;

/**
 * @className: ScoreDetail
 * @description: TODO 类描述
 * @author: wei.liu2mars@outlook.com  lw
 * @date: 2021/11/3 10:05
 **/
public class ScoreDetail {
    private String odlValue;
    private String newValue;
    private String creatUser;
    private Date creatDate;
    private Date updateDate;
    private String updateUser;

    public String getOdlValue() {
        return odlValue;
    }

    public void setOdlValue(String odlValue) {
        this.odlValue = odlValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getCreatUser() {
        return creatUser;
    }

    public void setCreatUser(String creatUser) {
        this.creatUser = creatUser;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}
