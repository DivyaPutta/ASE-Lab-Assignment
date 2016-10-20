/**
 * TodolistServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.visualstudio.DivyaPutta.experiment8;

public class TodolistServiceLocator extends org.apache.axis.client.Service implements com.visualstudio.DivyaPutta.experiment8.TodolistService {

    public TodolistServiceLocator() {
    }


    public TodolistServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TodolistServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Todolist
    private java.lang.String Todolist_address = "http://localhost:8080/Experiment_8/services/Todolist";

    public java.lang.String getTodolistAddress() {
        return Todolist_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TodolistWSDDServiceName = "Todolist";

    public java.lang.String getTodolistWSDDServiceName() {
        return TodolistWSDDServiceName;
    }

    public void setTodolistWSDDServiceName(java.lang.String name) {
        TodolistWSDDServiceName = name;
    }

    public com.visualstudio.DivyaPutta.experiment8.Todolist getTodolist() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Todolist_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTodolist(endpoint);
    }

    public com.visualstudio.DivyaPutta.experiment8.Todolist getTodolist(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.visualstudio.DivyaPutta.experiment8.TodolistSoapBindingStub _stub = new com.visualstudio.DivyaPutta.experiment8.TodolistSoapBindingStub(portAddress, this);
            _stub.setPortName(getTodolistWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTodolistEndpointAddress(java.lang.String address) {
        Todolist_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.visualstudio.DivyaPutta.experiment8.Todolist.class.isAssignableFrom(serviceEndpointInterface)) {
                com.visualstudio.DivyaPutta.experiment8.TodolistSoapBindingStub _stub = new com.visualstudio.DivyaPutta.experiment8.TodolistSoapBindingStub(new java.net.URL(Todolist_address), this);
                _stub.setPortName(getTodolistWSDDServiceName());
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
        if ("Todolist".equals(inputPortName)) {
            return getTodolist();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://experiment8.DivyaPutta.visualstudio.com", "TodolistService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://experiment8.DivyaPutta.visualstudio.com", "Todolist"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Todolist".equals(portName)) {
            setTodolistEndpointAddress(address);
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
