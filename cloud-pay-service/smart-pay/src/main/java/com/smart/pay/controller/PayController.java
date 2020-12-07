package com.smart.pay.controller;

import com.smart.pay.service.PayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Emilia
 * @Since: 2020.12.02 20:19
 */
@RestController
@RequestMapping("/pay")
public class PayController {
    @Resource
    PayService payService;

    @GetMapping("/")
    public String test(int type) {
        return payService.test();
    }
}
