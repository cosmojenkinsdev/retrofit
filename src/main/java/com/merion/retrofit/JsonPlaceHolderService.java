package com.merion.retrofit;

import java.net.http.HttpClient;
import java.util.concurrent.TimeUnit;

public class JsonPlaceHolderService {
    private Retrofit retrofit;
    private static JsonPlaceHolderService instance;
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";

    private JsonPlaceHolderService(){
        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(5, TimeUnit.SECONDS)
                .connectTimeout(5, TimeUnit.SECONDS)
                .build();
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(Conver .create())
                .build();
    }
}
