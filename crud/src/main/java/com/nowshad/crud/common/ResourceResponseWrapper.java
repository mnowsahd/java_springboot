package com.nowshad.crud.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResourceResponseWrapper<T> implements ResponseWrapper<T>, Serializable {

    private boolean seccess;

    private String msg;

    private  T data;

    private String responseCode;

    public ResourceResponseWrapper(boolean b, String msg, T data, String responseCode) {
        this.seccess = b;
        this.msg = msg;
        this.data=data;
        this.responseCode = responseCode;
    }


    @Override
    public T getData() {
        return data;
    }

    @Override
    public boolean isSuccess() {
        return seccess;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    public static <T> ResponseWrapper<T> failResult(String msg, T data, String responseCode) {
        return new ResourceResponseWrapper<T>(false, msg, data, responseCode);
    }

    public static <T> ResponseWrapper<T> successResult(String msg, T data) {
        return new ResourceResponseWrapper<T>(true, msg, data, "200_OK");
    }
}
