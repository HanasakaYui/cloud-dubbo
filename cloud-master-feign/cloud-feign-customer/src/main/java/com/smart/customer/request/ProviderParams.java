package com.smart.customer.request;

import lombok.Data;

/**
 * @Author: Emilia
 * @Since: 2020.12.03 10:47
 */
@Data
public class ProviderParams {
    private String kw;
    private int page;
    private int size;
}
