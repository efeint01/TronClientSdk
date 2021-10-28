package com.centerprime.tronsdk.sdk;

import com.google.gson.annotations.SerializedName;

/**
 * Created by CenterPrime on 2020/11/01.
 */
public class BaseResponse<T> {
    String message;
    private T data;
    @SerializedName("status_code")
    int statusCode;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public boolean isSuccess() {
        return statusCode == 200;
    }
}
