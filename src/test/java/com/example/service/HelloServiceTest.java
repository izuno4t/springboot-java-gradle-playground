package com.example.service;

import com.example.UnitTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@UnitTest
class HelloServiceTest {

  HelloService service;

  @BeforeEach
  void setUp() {
    service = new HelloService();
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void sayHello() {
    Assertions.assertThat(service.sayHello("bar")).isEqualTo("Hello, bar");
  }
}