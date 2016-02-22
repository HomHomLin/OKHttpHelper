package com.homhomlin.demo.okhttp.helper.okhttp;


import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Headers;
import okhttp3.Request;

/**
 * Created by linhonghong on 2015/8/3.
 */
public interface OkHttpHandlerInterface {
    /**
     * 失败返回的callback
     * @param request
     * @param e
     */
    void onFailure(Request request, IOException e, String msg);

    /**
     * 成功的callback，返回200
     * @param headers
     * @param responseString
     * @param object
     */
    void onSuccess(int code, String url, Headers headers, String responseString, JSONObject object);

    void onFailure(int statusCode, Headers headers, String responseString);

}
