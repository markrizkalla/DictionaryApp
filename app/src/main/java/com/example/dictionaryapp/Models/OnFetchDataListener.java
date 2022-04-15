package com.example.dictionaryapp.Models;

public interface OnFetchDataListener {

    void onFetchData(APIResponse apiResponse,String message);
    void onError(String message);
}
