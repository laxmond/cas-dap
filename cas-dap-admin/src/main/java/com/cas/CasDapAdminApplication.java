package com.cas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cas.mapper")
public class CasDapAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(CasDapAdminApplication.class, args);
    }
}
