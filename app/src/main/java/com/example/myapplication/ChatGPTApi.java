package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ChatGPTApi {

    @Headers({
            "Content-Type: application/json"
    })
    @POST("v1/chat/completions")
    Call<ChatGPTResponse> getChatResponse(
            @Header("Authorization") String authHeader,
            @Body ChatGPTRequest request
    );
}
