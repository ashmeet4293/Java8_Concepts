package com.company.practice.consumer;

public class Movie {
    String movieName;
    String actorName;
    String actressName;
    double rating;

    public Movie(String movieName, String actorName, String actressName, double rating) {
        this.movieName = movieName;
        this.actorName = actorName;
        this.actressName = actressName;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "{" +
                "movieName='" + movieName + '\'' +
                ", actorName='" + actorName + '\'' +
                ", actressName='" + actressName + '\'' +
                ", rating=" + rating +
                '}';
    }
}
