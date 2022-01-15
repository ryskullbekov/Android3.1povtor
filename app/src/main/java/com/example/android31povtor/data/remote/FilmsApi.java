package com.example.android31povtor.data.remote;

import com.example.android31povtor.data.models.Film;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FilmsApi {

    @GET("/films")
    Call<List<Film>> getFilms();

    @GET("/films/{id}")
    Call<Film> getDetailFilms(
            @Path("id") String position
    );
}
