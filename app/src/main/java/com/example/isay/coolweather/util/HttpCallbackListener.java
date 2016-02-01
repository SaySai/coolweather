package com.example.isay.coolweather.util;

/**
 * Created by isay on 1/31/2016.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
