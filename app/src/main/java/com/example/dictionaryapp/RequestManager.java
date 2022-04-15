package com.example.dictionaryapp;

import android.content.Context;
import android.widget.Toast;

import com.example.dictionaryapp.Models.APIResponse;
import com.example.dictionaryapp.Models.OnFetchDataListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class RequestManager {
    Context context;

    Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.dictionaryapi.dev/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public RequestManager(Context context) {
        this.context = context;
    }

    public void getWordMeaning(OnFetchDataListener fetchDataListener ,String word){
        callDictionary callDictionary = retrofit.create(RequestManager.callDictionary.class);
        Call<List<APIResponse>> call = callDictionary.callMeanings(word);

       try {
           call.enqueue(new Callback<List<APIResponse>>() {
               @Override
               public void onResponse(Call<List<APIResponse>> call, Response<List<APIResponse>> response) {
                   if (!response.isSuccessful()){
                       Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show();
                       return;
                   }
                   fetchDataListener.onFetchData(response.body().get(0),response.message());
               }

               @Override
               public void onFailure(Call<List<APIResponse>> call, Throwable t) {
                   fetchDataListener.onError("request Failure");
               }
           });
       }catch (Exception e){
           e.printStackTrace();
           Toast.makeText(context, "an Error Occurred", Toast.LENGTH_SHORT).show();
       }

    }

    public interface callDictionary {
        @GET("entries/en/{word}")
        Call<List<APIResponse>> callMeanings(
                @Path("word") String word
        );
    }
}
