package com.smart.provider.entity;

import lombok.Data;

/**
 * @Author: Emilia
 * @Since: 2020.12.02 18:59
 */
@Data
public class Provider {
    private int pid;
    private String title;

    public Provider() {
    }

    public Provider(int pid, String title) {
        this.pid = pid;
        this.title = title;
    }
}
