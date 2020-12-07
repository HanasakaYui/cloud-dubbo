package com.smart.customer.controller;

import com.smart.customer.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Emilia
 * @Since: 2020.12.02 18:48
 */
@RestController
@RequestMapping("/cus")
public class CustomerController {
    @Resource
    CustomerService customerService;

    @GetMapping("/list")
    public String getList(int page, int size) {
        return customerService.getList(page, size);
    }

    @GetMapping("/path")
    public String path(int page, int size) {
        return customerService.path(page, size);
    }
}
