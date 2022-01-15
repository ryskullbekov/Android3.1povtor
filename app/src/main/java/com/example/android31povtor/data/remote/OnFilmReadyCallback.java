package com.example.android31povtor.data.remote;

import com.example.android31povtor.data.models.Film;

import java.util.List;

public interface OnFilmReadyCallback {

    void success(List<Film> films);
    void onServerError();
    void failure(String msg);
}
