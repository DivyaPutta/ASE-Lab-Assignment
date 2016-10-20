/**
 * Exp8Service1ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.visualstudio.DivyaPutta.experiment8;

public class Exp8Service1ServiceLocator extends org.apache.axis.client.Service implements com.visualstudio.DivyaPutta.experiment8.Exp8Service1Service {

    public Exp8Service1ServiceLocator() {
    }


    public Exp8Service1ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Exp8Service1ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Exp8Service1
    private java.lang.String Exp8Service1_address = "http://localhost:8080/Experiment_8/services/Exp8Service1";

    public java.lang.String getExp8Service1Address() {
        return Exp8Service1_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Exp8Service1WSDDServiceName = "Exp8Service1";

    public java.lang.String getExp8Service1WSDDServiceName() {
        return Exp8Service1WSDDServiceName;
    }

    public void setExp8Service1WSDDServiceName(java.lang.String name) {
        Exp8Service1WSDDServiceName = name;
    }

    public com.visualstudio.DivyaPutta.experiment8.Exp8Service1 getExp8Service1() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Exp8Service1_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExp8Service1(endpoint);
    }

    public com.visualstudio.DivyaPutta.experiment8.Exp8Service1 getExp8Service1(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.visualstudio.DivyaPutta.experiment8.Exp8Service1SoapBindingStub _stub = new com.visualstudio.DivyaPutta.experiment8.Exp8Service1SoapBindingStub(portAddress, this);
            _stub.setPortName(getExp8Service1WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExp8Service1EndpointAddress(java.lang.String address) {
        Exp8Service1_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.visualstudio.DivyaPutta.experiment8.Exp8Service1.class.isAssignableFrom(serviceEndpointInterface)) {
                com.visualstudio.DivyaPutta.experiment8.Exp8Service1SoapBindingStub _stub = new com.visualstudio.DivyaPutta.experiment8.Exp8Service1SoapBindingStub(new java.net.URL(Exp8Service1_address), this);
                _stub.setPortName(getExp8Service1WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Exp8Service1".equals(inputPortName)) {
            return getExp8Service1();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://experiment8.DivyaPutta.visualstudio.com", "Exp8Service1Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://experiment8.DivyaPutta.visualstudio.com", "Exp8Service1"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Exp8Service1".equals(portName)) {
            setExp8Service1EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
