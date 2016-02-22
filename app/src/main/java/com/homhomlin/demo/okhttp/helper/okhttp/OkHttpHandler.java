package com.homhomlin.demo.okhttp.helper.okhttp;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

import okhttp3.Headers;
import okhttp3.Request;

/**
 * Created by linhonghong on 2015/8/13.
 */
public class OkHttpHandler implements OkHttpHandlerInterface{

    public void onStart(){

    }

    @Override
    public void onFailure(Request request, IOException e, String msg) {

    }

    @Override
    public void onSuccess(int code , String url, Headers headers, String responseString, JSONObject object) {

    }

    @Override
    public void onFailure(int statusCode, Headers headers, String responseString) {

    }

    public void onFileSuccess(int code, File file){

    }

}
