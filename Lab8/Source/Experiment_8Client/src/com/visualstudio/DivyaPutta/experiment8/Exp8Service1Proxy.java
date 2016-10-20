package com.visualstudio.DivyaPutta.experiment8;

public class Exp8Service1Proxy implements com.visualstudio.DivyaPutta.experiment8.Exp8Service1 {
  private String _endpoint = null;
  private com.visualstudio.DivyaPutta.experiment8.Exp8Service1 exp8Service1 = null;
  
  public Exp8Service1Proxy() {
    _initExp8Service1Proxy();
  }
  
  public Exp8Service1Proxy(String endpoint) {
    _endpoint = endpoint;
    _initExp8Service1Proxy();
  }
  
  private void _initExp8Service1Proxy() {
    try {
      exp8Service1 = (new com.visualstudio.DivyaPutta.experiment8.Exp8Service1ServiceLocator()).getExp8Service1();
      if (exp8Service1 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)exp8Service1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)exp8Service1)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (exp8Service1 != null)
      ((javax.xml.rpc.Stub)exp8Service1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.visualstudio.DivyaPutta.experiment8.Exp8Service1 getExp8Service1() {
    if (exp8Service1 == null)
      _initExp8Service1Proxy();
    return exp8Service1;
  }
  
  public java.lang.String helloName(java.lang.String enter_your_name) throws java.rmi.RemoteException{
    if (exp8Service1 == null)
      _initExp8Service1Proxy();
    return exp8Service1.helloName(enter_your_name);
  }
  
  
}