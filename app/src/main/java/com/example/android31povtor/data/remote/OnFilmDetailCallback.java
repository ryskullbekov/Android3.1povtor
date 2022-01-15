package com.example.android31povtor.data.remote;

import com.example.android31povtor.data.models.Film;

public interface OnFilmDetailCallback {

    void success(Film film);
    void serverError();
    void failure(String msg);
}
