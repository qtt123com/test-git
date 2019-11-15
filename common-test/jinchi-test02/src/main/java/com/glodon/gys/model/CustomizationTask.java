package com.glodon.gys.model;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import org.apache.commons.lang.StringUtils;

import java.util.Date;

/**
 * Created by zhaoq-m.
 * Date: 2017/7/18
 * 客户化集成任务表
 */
@Data
public class CustomizationTask {

    //主键
    private Long id;
    //租户ID
    private long tenantId;
    //项目ID 默认为-1
    private long projectId =-1;
    //项目同步编码 默认为“”
    private String projectSyncCode ="";

    //类型:Material、Catalog、Vendor等
    private String taskType;

    //上次任务开始时间
    private Date taskProcessLastStartTime;

    //上次请求返回时间戳
    private Date taskProcessLastRequestSoapTime;

    //任务处理状态 1：处理成功 0：未处理 2：正在处理 3:处理失败
    private int taskProcessStatus;

    //备注
    private String remark;

    //时间戳
    private String timestamp;

    //扩展信息
    private String extension;


    public JSONObject getExtJb(){
        if(StringUtils.isNotEmpty(extension)){
            return JSONObject.parseObject(extension);
        }else{
            return null;
        }
    }
}
