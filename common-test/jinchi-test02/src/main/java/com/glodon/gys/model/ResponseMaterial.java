package com.glodon.gys.model;

import java.util.List;

/**
 * Created by zhangb-h on 2018-07-04.
 * Project name:customizations.
 * Package name:com.glodon.gys.customization.schedule.model.
 * Summary:
 */

public class ResponseMaterial extends ResponseModel {

    private List<ResponseMaterialItem> data;

    public List<ResponseMaterialItem> getData() {
        return data;
    }

    public void setData(List<ResponseMaterialItem> data) {
        this.data = data;
    }
}
