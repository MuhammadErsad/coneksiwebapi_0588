package com.example.navigasi;

public interface ApiService {
    @GET("3/movie/now_playing")
    Call<MovieResponse> getPlayingMovie(@Query("api_key") String apiKey);
}