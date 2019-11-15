package com.glodon.gys;

import com.alibaba.fastjson.JSONObject;
import com.glodon.gys.customization.schedule.jinchi.model.ResponseMaterial;
import com.glodon.gys.customization.schedule.jinchi.model.ResponseVendor;
import com.glodon.gys.customization.schedule.jinchi.webservice.material.tenant.ShareMaterialCodeStub;
import com.glodon.gys.customization.schedule.jinchi.webservice.vendor.SupplierCodeStub;

import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:qutt
 * @Date:2019/9/27
 * @project: test
 * @package:com.glodon.gys
 * @description: insert description of this class
 */
public class OldApplicationMain {
    public static void main(String[] args) throws Exception{
//        testDate();
       String[] syncCodes = new String[]{
               "003001070"
              /* "003001060",
               "003001058",
               "003001051",
               "003001049",
               "003001036",
               "003001041",
               "003001033",
               "003002072"*/
       };
        for (String syncCode : syncCodes) {
            getVendor(syncCode);
        }

//        getMaterial();
    }
    public static void testDate() throws ParseException {
        String str1 = "19000101000000000";
        String str2 = "190001010000000000" ;
        Date date = convertStringToDate(str1);
        Date date2 = convertStringToDate(str2);
        System.out.println(date.compareTo(date2));
        System.out.println(date2);
    }
    public static Date convertStringToDate(String dateStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS") ;
        Date date = sdf.parse(dateStr);
        return date   ;
    }
    public static void getVendor(String syncCode){
        try{
            String url =   "http://wz.crssg.com:8088";
            String user ="Crssg14!@#";
            String user_password="Crssg14!@#";
            SupplierCodeStub supplierCodeStub = new SupplierCodeStub(new URL(url));
            SupplierCodeStub.GetItemSupplieres itemCodes = new SupplierCodeStub.GetItemSupplieres();
//            itemCodes.setItemDbCode("003001058");    // ok
            itemCodes.setItemDbCode(syncCode);

            SupplierCodeStub.MySoapHeaderE headerE = new SupplierCodeStub.MySoapHeaderE();
            SupplierCodeStub.MySoapHeader header = new SupplierCodeStub.MySoapHeader();
            header.setUserId(user);
            header.setUserPW(user_password);

            headerE.setMySoapHeader(header);
            SupplierCodeStub.GetItemSupplieresResponse res = supplierCodeStub.getItemSupplieres(itemCodes,headerE);
            ResponseVendor model = JSONObject.parseObject(res.getGetItemSupplieresResult(), ResponseVendor.class);
            System.out.println(JSONObject.toJSONString(model));
            System.out.println(model.getData().size());
        }   catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void getMaterial() {
        try{
            String url =   "http://wz.crssg.com:8088";
            String user ="Crssg14!@#";
            String user_password="Crssg14!@#";
            ShareMaterialCodeStub post = new ShareMaterialCodeStub(new URL(url));

            ShareMaterialCodeStub.GetCodes itemCodes = new ShareMaterialCodeStub.GetCodes();
            ShareMaterialCodeStub.MySoapHeaderE headerE = new ShareMaterialCodeStub.MySoapHeaderE();
            ShareMaterialCodeStub.MySoapHeader header = new ShareMaterialCodeStub.MySoapHeader();
            //设置用户名、密码
            header.setUserId(user);
            header.setUserPW(user_password);
            headerE.setMySoapHeader(header);
            ShareMaterialCodeStub.GetCodesResponse res = post.getCodes(itemCodes,headerE);
            ResponseMaterial model = JSONObject.parseObject(res.getGetCodesResult(), ResponseMaterial.class);
            System.out.println(model.getData().size());
        }   catch (Exception e){
            e.printStackTrace();
        }

    }
}
