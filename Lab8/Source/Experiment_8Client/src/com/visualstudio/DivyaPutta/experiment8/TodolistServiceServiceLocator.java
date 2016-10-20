/**
 * TodolistServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.visualstudio.DivyaPutta.experiment8;

public class TodolistServiceServiceLocator extends org.apache.axis.client.Service implements com.visualstudio.DivyaPutta.experiment8.TodolistServiceService {

    public TodolistServiceServiceLocator() {
    }


    public TodolistServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TodolistServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TodolistService
    private java.lang.String TodolistService_address = "http://localhost:8080/Experiment_8/services/TodolistService";

    public java.lang.String getTodolistServiceAddress() {
        return TodolistService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TodolistServiceWSDDServiceName = "TodolistService";

    public java.lang.String getTodolistServiceWSDDServiceName() {
        return TodolistServiceWSDDServiceName;
    }

    public void setTodolistServiceWSDDServiceName(java.lang.String name) {
        TodolistServiceWSDDServiceName = name;
    }

    public com.visualstudio.DivyaPutta.experiment8.TodolistService getTodolistService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TodolistService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTodolistService(endpoint);
    }

    public com.visualstudio.DivyaPutta.experiment8.TodolistService getTodolistService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.visualstudio.DivyaPutta.experiment8.TodolistServiceSoapBindingStub _stub = new com.visualstudio.DivyaPutta.experiment8.TodolistServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTodolistServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTodolistServiceEndpointAddress(java.lang.String address) {
        TodolistService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.visualstudio.DivyaPutta.experiment8.TodolistService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.visualstudio.DivyaPutta.experiment8.TodolistServiceSoapBindingStub _stub = new com.visualstudio.DivyaPutta.experiment8.TodolistServiceSoapBindingStub(new java.net.URL(TodolistService_address), this);
                _stub.setPortName(getTodolistServiceWSDDServiceName());
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
        if ("TodolistService".equals(inputPortName)) {
            return getTodolistService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://experiment8.DivyaPutta.visualstudio.com", "TodolistServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://experiment8.DivyaPutta.visualstudio.com", "TodolistService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TodolistService".equals(portName)) {
            setTodolistServiceEndpointAddress(address);
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
