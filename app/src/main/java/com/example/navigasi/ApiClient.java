package com.example.navigasi;

import retrofit2.Restrofit;

    public class ApiClient {
        public static Retrofit retrofit;
        public static final String BASE_URL = "https://api.themoviedb.org/";
        public static Retrofit getRetrofitInstance(){
            if(retrofit==null){
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }
    }
