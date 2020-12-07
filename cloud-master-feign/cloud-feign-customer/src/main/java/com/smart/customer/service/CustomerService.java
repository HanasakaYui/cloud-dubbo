package com.smart.customer.service;

/**
 * @Author: Emilia
 * @Since: 2020.12.02 18:49
 */
public interface CustomerService {
    /**
     * ...
     * @param page
     * @param size
     * @return
     */
    String getList(int page, int size);

    /**
     * ...
     * @param page
     * @param size
     * @return
     */
    String path(int page, int size);

}
