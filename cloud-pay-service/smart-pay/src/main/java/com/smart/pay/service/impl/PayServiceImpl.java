package com.smart.pay.service.impl;

import com.smart.pay.service.PayService;
import com.smart.pay.service.AlipayService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @Author: Emilia
 * @Since: 2020.12.02 20:21
 */
@Service
public class PayServiceImpl implements PayService {
    @Reference
    private AlipayService alipayService;

    @Override
    public String test() {
        return alipayService.test();
    }
}
