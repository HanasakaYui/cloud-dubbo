package com.smart.alipay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Emilia
 * @Since: 2020.12.02 20:34
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlipayApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlipayApplication.class, args);
    }
}
