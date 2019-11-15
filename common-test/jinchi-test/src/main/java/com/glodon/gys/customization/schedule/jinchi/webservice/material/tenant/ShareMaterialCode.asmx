<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://wz.crssg.com/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://wz.crssg.com/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://wz.crssg.com/">
      <s:element name="GetCodes">
        <s:complexType />
      </s:element>
      <s:element name="GetCodesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCodesResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="MySoapHeader" type="tns:MySoapHeader" />
      <s:complexType name="MySoapHeader">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="UserId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="UserPW" type="s:string" />
        </s:sequence>
        <s:anyAttribute />
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="GetCodesSoapIn">
    <wsdl:part name="parameters" element="tns:GetCodes" />
  </wsdl:message>
  <wsdl:message name="GetCodesSoapOut">
    <wsdl:part name="parameters" element="tns:GetCodesResponse" />
  </wsdl:message>
  <wsdl:message name="GetCodesMySoapHeader">
    <wsdl:part name="MySoapHeader" element="tns:MySoapHeader" />
  </wsdl:message>
  <wsdl:portType name="ShareMaterialCodeSoap">
    <wsdl:operation name="GetCodes">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取物资编码</wsdl:documentation>
      <wsdl:input message="tns:GetCodesSoapIn" />
      <wsdl:output message="tns:GetCodesSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="ShareMaterialCodeSoap" type="tns:ShareMaterialCodeSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetCodes">
      <soap:operation soapAction="http://wz.crssg.com/GetCodes" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
        <soap:header message="tns:GetCodesMySoapHeader" part="MySoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="ShareMaterialCodeSoap12" type="tns:ShareMaterialCodeSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetCodes">
      <soap12:operation soapAction="http://wz.crssg.com/GetCodes" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
        <soap12:header message="tns:GetCodesMySoapHeader" part="MySoapHeader" use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="ShareMaterialCode">
    <wsdl:port name="ShareMaterialCodeSoap" binding="tns:ShareMaterialCodeSoap">
      <soap:address location="http://wz.crssg.com:8088/WebServices/ShareMaterialCode.asmx" />
    </wsdl:port>
    <wsdl:port name="ShareMaterialCodeSoap12" binding="tns:ShareMaterialCodeSoap12">
      <soap12:address location="http://wz.crssg.com:8088/WebServices/ShareMaterialCode.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>