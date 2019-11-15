package com.glodon.gys.customization.schedule.jinchi.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhangb-h on 2018-07-11.
 * Project name:customizations.
 * Package name:com.glodon.gys.customization.schedule.jinchi.model.
 * Summary:
 */
public class ResponseModel implements ResponseData,Serializable {
    private int code;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date timestramp;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getTimestramp() {
        return timestramp;
    }

    public void setTimestramp(Date timestramp) {
        this.timestramp = timestramp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
