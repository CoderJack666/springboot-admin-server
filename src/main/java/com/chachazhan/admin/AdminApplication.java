package com.chachazhan.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * @author jack
 * @date 30/01/2018
 * @time 10:50
 */
@EnableAdminServer
@SpringBootApplication
public class AdminApplication {

  public static void main(String[] args) {
    SpringApplication.run(AdminApplication.class, args);
  }

}
