package com.nex3z.examples.contentprovider.rest.model;

import com.google.gson.annotations.SerializedName;
import com.nex3z.examples.contentprovider.model.Movie;

import java.util.List;

public class MovieResponse {
    private long page;

    @SerializedName("results")
    private List<Movie> movies;

    public List<Movie> getMovies() {
        return movies;
    }
}
