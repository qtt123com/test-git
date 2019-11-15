/**
 * ShareMaterialCodeCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.5  Built on : May 06, 2017 (03:45:26 BST)
 */
package com.glodon.gys.customization.schedule.jinchi.webservice.material.tenant;


/**
 *  ShareMaterialCodeCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class ShareMaterialCodeCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public ShareMaterialCodeCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public ShareMaterialCodeCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getCodes method
     * override this method for handling normal response from getCodes operation
     */
    public void receiveResultgetCodes(
        com.glodon.gys.customization.schedule.jinchi.webservice.material.tenant.ShareMaterialCodeStub.GetCodesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getCodes operation
     */
    public void receiveErrorgetCodes(Exception e) {
    }
}
