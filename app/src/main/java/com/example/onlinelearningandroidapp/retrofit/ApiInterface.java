package com.example.onlinelearningandroidapp.retrofit;

import com.example.onlinelearningandroidapp.model.Category;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("courses.json")
    Call<List<Category>> getAllCategory();

}
