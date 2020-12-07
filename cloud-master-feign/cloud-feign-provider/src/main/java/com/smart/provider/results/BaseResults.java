package com.smart.provider.results;

import lombok.Builder;
import lombok.Data;

/**
 * @Author: Emilia
 * @Since: 2020.12.02 18:53
 */
@Data
@Builder
public class BaseResults<T> {
    private int status;
    private String msg;
    private T data;

    public static <T> BaseResults<T> success(T data) {
        return BaseResults.<T>builder().status(200).msg("success").data(data).build();
    }

    public static <T> BaseResults<T> error() {
        return BaseResults.<T>builder().status(404).msg("error").build();
    }
}
