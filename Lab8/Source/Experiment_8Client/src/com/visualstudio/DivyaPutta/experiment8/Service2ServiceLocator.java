/**
 * Service2ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.visualstudio.DivyaPutta.experiment8;

public class Service2ServiceLocator extends org.apache.axis.client.Service implements com.visualstudio.DivyaPutta.experiment8.Service2Service {

    public Service2ServiceLocator() {
    }


    public Service2ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Service2ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Service2
    private java.lang.String Service2_address = "http://localhost:8080/Experiment_8/services/Service2";

    public java.lang.String getService2Address() {
        return Service2_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Service2WSDDServiceName = "Service2";

    public java.lang.String getService2WSDDServiceName() {
        return Service2WSDDServiceName;
    }

    public void setService2WSDDServiceName(java.lang.String name) {
        Service2WSDDServiceName = name;
    }

    public com.visualstudio.DivyaPutta.experiment8.Service2 getService2() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Service2_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getService2(endpoint);
    }

    public com.visualstudio.DivyaPutta.experiment8.Service2 getService2(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.visualstudio.DivyaPutta.experiment8.Service2SoapBindingStub _stub = new com.visualstudio.DivyaPutta.experiment8.Service2SoapBindingStub(portAddress, this);
            _stub.setPortName(getService2WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setService2EndpointAddress(java.lang.String address) {
        Service2_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.visualstudio.DivyaPutta.experiment8.Service2.class.isAssignableFrom(serviceEndpointInterface)) {
                com.visualstudio.DivyaPutta.experiment8.Service2SoapBindingStub _stub = new com.visualstudio.DivyaPutta.experiment8.Service2SoapBindingStub(new java.net.URL(Service2_address), this);
                _stub.setPortName(getService2WSDDServiceName());
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
        if ("Service2".equals(inputPortName)) {
            return getService2();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://experiment8.DivyaPutta.visualstudio.com", "Service2Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://experiment8.DivyaPutta.visualstudio.com", "Service2"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Service2".equals(portName)) {
            setService2EndpointAddress(address);
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
