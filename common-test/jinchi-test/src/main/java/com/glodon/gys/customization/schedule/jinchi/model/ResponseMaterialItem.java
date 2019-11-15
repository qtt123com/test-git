package com.glodon.gys.customization.schedule.jinchi.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * Created by zhangb-h on 2018-07-04.
 * Project name:customizations.
 * Package name:com.glodon.gys.customization.schedule.model.
 * Summary:
 */
public class ResponseMaterialItem implements ResponseItemData,Serializable {
    @JSONField(name="KeyCode")
    private String keyCode;
    @JSONField(name="MateName")
    private String mateName;
    @JSONField(name="MateSpec")
    private String mateSpec;
    @JSONField(name="MateUnit")
    private String mateUnit;
    @JSONField(name="MatePinYin")
    private String matePinYin;
    @JSONField(name="MateCategory")
    private String mateCategory;
    @JSONField(name="CategoryNum")
    private int categoryNum;
    @JSONField(name="MateClassify")
    private String mateClassify;
    @JSONField(name="FinalLevel")
    private String finalLevel;
    @JSONField(name="isStop")
    private Boolean isStop;

    public String getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(String keyCode) {
        this.keyCode = keyCode;
    }

    public String getMateName() {
        return mateName;
    }

    public void setMateName(String mateName) {
        this.mateName = mateName;
    }

    public String getMateSpec() {
        return mateSpec;
    }

    public void setMateSpec(String mateSpec) {
        this.mateSpec = mateSpec;
    }

    public String getMateUnit() {
        return mateUnit;
    }

    public void setMateUnit(String mateUnit) {
        this.mateUnit = mateUnit;
    }

    public String getMatePinYin() {
        return matePinYin;
    }

    public void setMatePinYin(String matePinYin) {
        this.matePinYin = matePinYin;
    }

    public String getMateCategory() {
        return mateCategory;
    }

    public void setMateCategory(String mateCategory) {
        this.mateCategory = mateCategory;
    }

    public int getCategoryNum() {
        return categoryNum;
    }

    public void setCategoryNum(int categoryNum) {
        this.categoryNum = categoryNum;
    }

    public String getMateClassify() {
        return mateClassify;
    }

    public void setMateClassify(String mateClassify) {
        this.mateClassify = mateClassify;
    }

    public String getFinalLevel() {
        return finalLevel;
    }

    public Boolean getIsStop() {
        return isStop;
    }

    public void setIsStop(Boolean stop) {
        isStop = stop;
    }

    public void setFinalLevel(String finalLevel) {
        this.finalLevel = finalLevel;
    }
    //金驰系统中根类别ID为0
    public static final String ROOT_CATALOG_ID =  "0";
  /*  public ImportDicCataLog getImportDicCatalog(){
        ImportDicCataLog i = new ImportDicCataLog();
        //FinalLevel == False 类别；FinalLevel == True 材料；
        if("False".equals(this.getFinalLevel())){
            i.setDicType("消耗材料");
        }else if("True".equals(this.getFinalLevel())){
            i.setDicType(StringUtils.EMPTY);  //区分类别还是材料 材料为空
            i.setUnit(this.getMateUnit()); //
        }
        i.setName(this.getMateName());
        i.setCode(this.getKeyCode());
        if(this.getIsStop()){
            i.setOptFlag(2);
        }
        if(null == this.getIsStop() || !this.getIsStop()) {
            i.setOptFlag(0);
        }
        i.setRemark("");
        i.setRule(this.getMateSpec());
        i.setModel(StringUtils.EMPTY);
        i.setUnitId(this.getKeyCode());
        if(ROOT_CATALOG_ID.equals(this.getMateCategory())){
            i.setUnitPid(null);
        }else{
            i.setUnitPid(this.getMateCategory());
        }
        return i;
    }*/
}
