package com.visualstudio.DivyaPutta.experiment8;

public class TodolistProxy implements com.visualstudio.DivyaPutta.experiment8.Todolist {
  private String _endpoint = null;
  private com.visualstudio.DivyaPutta.experiment8.Todolist todolist = null;
  
  public TodolistProxy() {
    _initTodolistProxy();
  }
  
  public TodolistProxy(String endpoint) {
    _endpoint = endpoint;
    _initTodolistProxy();
  }
  
  private void _initTodolistProxy() {
    try {
      todolist = (new com.visualstudio.DivyaPutta.experiment8.TodolistServiceLocator()).getTodolist();
      if (todolist != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)todolist)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)todolist)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (todolist != null)
      ((javax.xml.rpc.Stub)todolist)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.visualstudio.DivyaPutta.experiment8.Todolist getTodolist() {
    if (todolist == null)
      _initTodolistProxy();
    return todolist;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (todolist == null)
      _initTodolistProxy();
    todolist.main(args);
  }
  
  
}