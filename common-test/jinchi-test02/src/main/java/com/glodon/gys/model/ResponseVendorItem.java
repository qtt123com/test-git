package com.glodon.gys.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhangb-h on 2018-07-11.
 * Project name:customizations.
 * Package name:com.glodon.gys.customization.schedule.jinchi.model.
 * Summary:
 */
@Data
public class ResponseVendorItem implements ResponseItemData,Serializable {

    //金驰供应商分类
    public static final String REMOTE_VENDOR_COMTYPE_HG = "合格供应商";
    public static final String REMOTE_VENDOR_COMTYPE_QT = "其他供应商";
    public static final String REMOTE_VENDOR_COMTYPE_LS = "临时供应商";

    public static final String OPT_TYPE_GL = "1";
    public static final String OPT_TYPE_YL = "2";

    public static final String NULL_STRING = "null";

    @JSONField(name="KeyCode")
    private String keyCode;                 //编码 主键
    @JSONField(name="ComName")
    private String comName;                 //供应商名称
    @JSONField(name="ComNameEng")
    private String comNameEng;              //供应商名称(英文)
    @JSONField(name="ComAddress")
    private String comAddress;              //地址
    @JSONField(name="ComWarehouseAddress")
    private String comWarehouseAddress;     //仓储地址
    @JSONField(name="ComBusinessLicense")
    private String comBusinessLicense;      //营业执照
    @JSONField(name="ComRegiCapital")
    private String comRegiCapital;          //注册资金
    @JSONField(name="ComOrganStruc")
    private String comOrganStruc;           //组织机构代码
    @JSONField(name="ComLegal")
    private String comLegal;                //法人
    @JSONField(name="ComFixedAssets")
    private String comFixedAssets;          //固定资产总额
    @JSONField(name="ComTurnover")
    private String comTurnover;             //年营业额
    @JSONField(name="ComManager")
    private String comManager;              //业务主管
    @JSONField(name="ComPhone")
    private String comPhone;                //电话
    @JSONField(name="ComEmail")
    private String comEmail;                //E_mail

    public String getComAddress() {
        return comAddress == null?"":comAddress;
    }

    public String getComBusinessLicense() {
        return comBusinessLicense == null?"":comBusinessLicense;
    }

    public String getComProductsClassify() {
        return NULL_STRING.equals(comProductsClassify)|| null == comProductsClassify?"":comProductsClassify;
    }

    public String getComMainProducts() {
        return NULL_STRING.equals(comMainProducts) || null == comMainProducts?"":comMainProducts;
    }

    @JSONField(name="ComProductsClassify")
    private String comProductsClassify ="";     //主供产品分类
    @JSONField(name="ComArea")
    private String comArea;                 //所在区域
    @JSONField(name="ComMainProducts")
    private String comMainProducts = "";         //主供产品
    @JSONField(name="ComMainCustomer")
    private String comMainCustomer;         //主要客户
    //供应商类型，此字段区分局级（租户层）还是项目级（项目层）
    // “合格供应商”：租户层；“其他供应商”、“临时供应商”：项目层
    @JSONField(name="ComType")
    private String comType;

    @JSONField(serialize = false)
    private String optType;                 //非三方返回，我方处理使用。合作单位类型 1：供料单位 2：用料单位
    @JSONField(serialize = false)
    private String projectId;               //非三方返回，我方处理使用。项目ID
    @JSONField(serialize = false)
    private String projectCode;             //非三方返回，我方处理使用。三方项目编码
}
