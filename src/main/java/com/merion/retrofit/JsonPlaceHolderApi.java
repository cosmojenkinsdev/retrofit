package com.merion.retrofit;

public interface JsonPlaceHolderApi {

    @GET("/posts")
    Call<List<PostResponce>> posts(@Query("userId") Integer userId);
}
