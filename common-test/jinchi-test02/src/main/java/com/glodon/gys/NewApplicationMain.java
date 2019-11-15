package com.glodon.gys;

import com.alibaba.fastjson.JSONObject;
import com.glodon.gys.model.ResponseMaterial;
import com.glodon.gys.webservice.material.ShareMaterialCodeStub;
import com.glodon.gys.webservice.vendor.SupplierCodeStub;

/**
 * @Author:qutt
 * @Date:2019/9/27
 * @project: test
 * @package:com.glodon.gys
 * @description: insert description of this class
 */
public class NewApplicationMain {
    public static void main(String[] args) {
//        testMaterial("19700101080000000","201901010000000000");
//        testVendor("003001070","20191019153947","201912010000000000");
          //19700101080000000
//        testVendor("003001051","20191019153947","20191021171241287");
        testVendor("003001070","20191019153947","201912010000000000");
        //19700101080000000
//        testVendor("003001051","20191019153947","20191021171241287");

        testVendor("003001070","20190819153947000","20191121171241287");

        //

        /**
         "003001070",
         "003001060",
         "003001058",
         "003001051",
         "003001049",
         "003001036",
         "003001041",
         "003001033",
         "003002072"

         *
         */
    }
    public static void testVendor(String syncCode,String beginTimestamp,String endTimestamp) {
        try{
            String user ="Crssg14!@#";
            String user_password="Crssg14!@#";

            SupplierCodeStub supplierCodeStub = new SupplierCodeStub();
            SupplierCodeStub.GetItemSupplieresByPage methodInfo = new SupplierCodeStub.GetItemSupplieresByPage();
            methodInfo.setItemDbCode(syncCode);
            methodInfo.setBeginTimestamp(beginTimestamp);
            methodInfo.setEndTimestamp(endTimestamp);
            methodInfo.setPageIndex(0);
            methodInfo.setPageSize(50);

            SupplierCodeStub.MySoapHeaderE headerE = new SupplierCodeStub.MySoapHeaderE();
            SupplierCodeStub.MySoapHeader header = new SupplierCodeStub.MySoapHeader();
            //设置用户名、密码
            header.setUserId(user);
            header.setUserPW(user_password);
            headerE.setMySoapHeader(header);
            SupplierCodeStub.GetItemSupplieresByPageResponse response = supplierCodeStub.getItemSupplieresByPage(methodInfo, headerE);
            String re = response.getGetItemSupplieresByPageResult();
            System.out.println(re);
        }   catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void testMaterial(String beginTimestamp,String endTimestamp){
        try{
            String user ="Crssg14!@#";
            String user_password="Crssg14!@#";
            ShareMaterialCodeStub post = new ShareMaterialCodeStub();
            ShareMaterialCodeStub.GetCodesByPage itemCodes = new ShareMaterialCodeStub.GetCodesByPage();

            itemCodes.setBeginTimestamp(beginTimestamp);
            itemCodes.setEndTimestamp(endTimestamp);
            itemCodes.setPageIndex(0);        //共计21840条     y
            itemCodes.setPageSize(50);
            ShareMaterialCodeStub.MySoapHeaderE headerE = new ShareMaterialCodeStub.MySoapHeaderE();
            ShareMaterialCodeStub.MySoapHeader header = new ShareMaterialCodeStub.MySoapHeader();
            //设置用户名、密码
            header.setUserId(user);
            header.setUserPW(user_password);
            headerE.setMySoapHeader(header);
            ShareMaterialCodeStub.GetCodesByPageResponse codesByPage = post.getCodesByPage(itemCodes, headerE);
            String res = codesByPage.getGetCodesByPageResult();
            ResponseMaterial model = JSONObject.parseObject(res,ResponseMaterial.class);
            System.out.println(model.getData().size()+"---->"+model.getMaxstramp());

        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
