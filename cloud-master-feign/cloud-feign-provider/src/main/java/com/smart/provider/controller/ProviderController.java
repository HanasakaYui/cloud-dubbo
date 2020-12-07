package com.smart.provider.controller;

import com.smart.provider.entity.Provider;
import com.smart.provider.request.ProviderParams;
import com.smart.provider.results.BaseResults;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * @Author: Emilia
 * @Since: 2020.12.02 18:52
 */
@RestController
@RequestMapping("/pro")
public class ProviderController {

    @GetMapping("/test")
    public BaseResults<List<Provider>> getProviders(int page, int size) {
        List<Provider> providers = new ArrayList<>();
        Collections.addAll(providers,
                new Provider(1,"123"),
                new Provider(2,"456"),
                new Provider(3,"789"));
        return BaseResults.success(providers);
    }

    @GetMapping("/{page}/{size}")
    public String path(@PathVariable int page, @PathVariable int size) {
        return "o(*￣︶￣*)o";
    }

    @PostMapping("/")
    public String provider(@RequestBody ProviderParams providerParams) {
        return "(～￣▽￣)～)";
    }
}
