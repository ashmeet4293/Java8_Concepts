package com.company.practice.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ProgramToDisplayMovieInformationUsingConsumer {
    public static void main(String[] args) {

        List<Movie> movies= new ArrayList<>();
        movies.add(new Movie("Bahubali", "actor1","actress1",8.0));
        movies.add(new Movie("Harry Potter", "actor2","actress2",7.0));
        movies.add(new Movie("Kung fu Panda", "actor3","actress3",6.0));
        movies.add(new Movie("Up", "actor4","actress4",10.00));

        Consumer<Movie> printMoviesConsumer= (movie )->{
            System.out.println("Movie Name : "+movie.movieName);
            System.out.println("Movie Actor Name : "+movie.actorName);
            System.out.println("Movie Actress Name : "+movie.actressName);
            System.out.println("Movie Rating : "+movie.rating);
        };

        movies.forEach(movie->{
            printMoviesConsumer.accept(movie);
            System.out.println("___________________________");
        });



    }
}
