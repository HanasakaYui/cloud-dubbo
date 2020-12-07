package com.smart.alipay.service.impl;

import com.smart.pay.service.AlipayService;
import org.apache.dubbo.config.annotation.Service;


/**
 * @Author: Emilia
 * @Since: 2020.12.02 20:27
 *  service 注解为 dubbo 不是 spring
 */
@Service
public class AlipayServiceImpl implements AlipayService {

    @Override
    public String test() {
        return "伊蕾娜天下第一";
    }
}
