package com.smart.customer.feign;

import com.smart.customer.entity.Provider;
import com.smart.customer.request.ProviderParams;
import com.smart.customer.results.BaseResults;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Emilia
 * @Since: 2020.12.02 19:24
 */
@FeignClient(value = "cloud-feign-provider",path = "/api/pro")
public interface ProviderService {
    /**
     * ..
     * @param page
     * @param size
     * @return
     */
    @GetMapping("/test")
    BaseResults<List<Provider>> getProviders(@RequestParam int page, @RequestParam int size);

    /**
     * ...
     * @param page
     * @param size
     * @return
     */
    @GetMapping("/{page}/{size}")
    String path(@PathVariable int page, @PathVariable int size);

    /**
     * ...
     * @param providerParams
     * @return
     */
    @PostMapping("/")
    String provider(@RequestBody ProviderParams providerParams);
}
