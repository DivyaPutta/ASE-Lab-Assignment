/**
 * Input_optionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.visualstudio.DivyaPutta.experiment8;

public class Input_optionResponse  implements java.io.Serializable {
    private java.lang.String input_optionReturn;

    public Input_optionResponse() {
    }

    public Input_optionResponse(
           java.lang.String input_optionReturn) {
           this.input_optionReturn = input_optionReturn;
    }


    /**
     * Gets the input_optionReturn value for this Input_optionResponse.
     * 
     * @return input_optionReturn
     */
    public java.lang.String getInput_optionReturn() {
        return input_optionReturn;
    }


    /**
     * Sets the input_optionReturn value for this Input_optionResponse.
     * 
     * @param input_optionReturn
     */
    public void setInput_optionReturn(java.lang.String input_optionReturn) {
        this.input_optionReturn = input_optionReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Input_optionResponse)) return false;
        Input_optionResponse other = (Input_optionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.input_optionReturn==null && other.getInput_optionReturn()==null) || 
             (this.input_optionReturn!=null &&
              this.input_optionReturn.equals(other.getInput_optionReturn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInput_optionReturn() != null) {
            _hashCode += getInput_optionReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Input_optionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://experiment8.DivyaPutta.visualstudio.com", ">input_optionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input_optionReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://experiment8.DivyaPutta.visualstudio.com", "input_optionReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
