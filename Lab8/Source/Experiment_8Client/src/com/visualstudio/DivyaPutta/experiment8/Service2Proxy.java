package com.visualstudio.DivyaPutta.experiment8;

public class Service2Proxy implements com.visualstudio.DivyaPutta.experiment8.Service2 {
  private String _endpoint = null;
  private com.visualstudio.DivyaPutta.experiment8.Service2 service2 = null;
  
  public Service2Proxy() {
    _initService2Proxy();
  }
  
  public Service2Proxy(String endpoint) {
    _endpoint = endpoint;
    _initService2Proxy();
  }
  
  private void _initService2Proxy() {
    try {
      service2 = (new com.visualstudio.DivyaPutta.experiment8.Service2ServiceLocator()).getService2();
      if (service2 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)service2)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)service2)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (service2 != null)
      ((javax.xml.rpc.Stub)service2)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.visualstudio.DivyaPutta.experiment8.Service2 getService2() {
    if (service2 == null)
      _initService2Proxy();
    return service2;
  }
  
  public java.lang.String helloName(java.lang.String enter_your_name) throws java.rmi.RemoteException{
    if (service2 == null)
      _initService2Proxy();
    return service2.helloName(enter_your_name);
  }
  
  
}