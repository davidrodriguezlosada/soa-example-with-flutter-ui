package com.davidrl.sap.service.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
    basePackages = {"com.davidrl.sap"}
)
public class CustomerServiceApplication {

  /**
   * Start the Application
   *
   * @param args Application arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(CustomerServiceApplication.class);
  }
}
