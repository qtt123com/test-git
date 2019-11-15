package com.glodon.gys.model;

import java.util.List;

/**
 * Created by zhangb-h on 2018-07-11.
 * Project name:customizations.
 * Package name:com.glodon.gys.customization.schedule.jinchi.model.
 * Summary:
 */
public class ResponseVendor extends  ResponseModel{

    private List<ResponseVendorItem> data;

    public List<ResponseVendorItem> getData() {
        return data;
    }

    public void setData(List<ResponseVendorItem> data) {
        this.data = data;
    }
}
