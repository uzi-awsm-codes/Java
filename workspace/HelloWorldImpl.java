package com.webservice;

//Service Implementation  

public class HelloWorldImpl implements HelloWorld {

	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}
}
