package com.webservice;

public class HelloWorldImplProxy implements com.webservice.HelloWorldImpl {
  private String _endpoint = null;
  private com.webservice.HelloWorldImpl helloWorldImpl = null;
  
  public HelloWorldImplProxy() {
    _initHelloWorldImplProxy();
  }
  
  public HelloWorldImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWorldImplProxy();
  }
  
  private void _initHelloWorldImplProxy() {
    try {
      helloWorldImpl = (new com.webservice.HelloWorldImplServiceLocator()).getHelloWorldImpl();
      if (helloWorldImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWorldImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWorldImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWorldImpl != null)
      ((javax.xml.rpc.Stub)helloWorldImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.webservice.HelloWorldImpl getHelloWorldImpl() {
    if (helloWorldImpl == null)
      _initHelloWorldImplProxy();
    return helloWorldImpl;
  }
  
  public java.lang.String getHelloWorldAsString(java.lang.String name) throws java.rmi.RemoteException{
    if (helloWorldImpl == null)
      _initHelloWorldImplProxy();
    return helloWorldImpl.getHelloWorldAsString(name);
  }
  
  
}