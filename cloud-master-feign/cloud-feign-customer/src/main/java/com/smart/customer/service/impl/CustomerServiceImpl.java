package com.smart.customer.service.impl;

import com.smart.customer.entity.Provider;
import com.smart.customer.feign.ProviderService;
import com.smart.customer.results.BaseResults;
import com.smart.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Emilia
 * @Since: 2020.12.02 18:49
 */
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Resource
    ProviderService providerService;

    @Override
    public String getList(int page, int size) {
        BaseResults<List<Provider>> providers = providerService.getProviders(page, size);
        providers.getData().forEach(provider -> log.info(provider.toString()));
        return "伊蕾娜天下第一";
    }

    @Override
    public String path(int page, int size) {
        return providerService.path(page, size);
    }
}
