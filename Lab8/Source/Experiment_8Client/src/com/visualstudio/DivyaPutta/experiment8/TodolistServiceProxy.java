package com.visualstudio.DivyaPutta.experiment8;

public class TodolistServiceProxy implements com.visualstudio.DivyaPutta.experiment8.TodolistService {
  private String _endpoint = null;
  private com.visualstudio.DivyaPutta.experiment8.TodolistService todolistService = null;
  
  public TodolistServiceProxy() {
    _initTodolistServiceProxy();
  }
  
  public TodolistServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initTodolistServiceProxy();
  }
  
  private void _initTodolistServiceProxy() {
    try {
      todolistService = (new com.visualstudio.DivyaPutta.experiment8.TodolistServiceServiceLocator()).getTodolistService();
      if (todolistService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)todolistService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)todolistService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (todolistService != null)
      ((javax.xml.rpc.Stub)todolistService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.visualstudio.DivyaPutta.experiment8.TodolistService getTodolistService() {
    if (todolistService == null)
      _initTodolistServiceProxy();
    return todolistService;
  }
  
  public java.lang.String todolist(java.lang.String input_your_list_items) throws java.rmi.RemoteException{
    if (todolistService == null)
      _initTodolistServiceProxy();
    return todolistService.todolist(input_your_list_items);
  }
  
  
}