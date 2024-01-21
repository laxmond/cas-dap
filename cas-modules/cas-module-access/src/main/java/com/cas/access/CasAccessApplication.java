package com.cas.access;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cas.access.mapper")
public class CasAccessApplication {
    public static void main(String[] args) {
        SpringApplication.run(CasAccessApplication.class, args);
    }
}
