package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

  public String sayHello(final String message) {
    return String.format("Hello, %s", message);
  }

}
