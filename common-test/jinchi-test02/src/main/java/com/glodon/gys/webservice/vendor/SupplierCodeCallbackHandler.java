/**
 * SupplierCodeCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.glodon.gys.webservice.vendor;


/**
 *  SupplierCodeCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class SupplierCodeCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public SupplierCodeCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public SupplierCodeCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getItemSupplieres method
     * override this method for handling normal response from getItemSupplieres operation
     */
    public void receiveResultgetItemSupplieres(
        SupplierCodeStub.GetItemSupplieresResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getItemSupplieres operation
     */
    public void receiveErrorgetItemSupplieres(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getItemSupplieresByPage method
     * override this method for handling normal response from getItemSupplieresByPage operation
     */
    public void receiveResultgetItemSupplieresByPage(
        SupplierCodeStub.GetItemSupplieresByPageResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getItemSupplieresByPage operation
     */
    public void receiveErrorgetItemSupplieresByPage(java.lang.Exception e) {
    }
}
