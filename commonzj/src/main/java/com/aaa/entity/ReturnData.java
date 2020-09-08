package com.aaa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ReturnData<T> {

    private int code;

    private String mass;

    private T data;

    public ReturnData() {

    }

    public ReturnData(int code, String mass, T data) {
        this.code = code;
        this.mass = mass;
        this.data = data;
    }
}