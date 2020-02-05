package com.example.design_patterns.ui;

import com.example.design_patterns.pojo.MovieModel;

public class MoviePresenter {
    MovieView view;

    public MoviePresenter(MovieView view) {

        this.view = view;
    }
    public MovieModel GetMovieModel(){
        return new MovieModel("Avengers","w5las",1);
    }

    public void getMovieName(){
        view.onGetMovieName(GetMovieModel().getName());
    }
}
