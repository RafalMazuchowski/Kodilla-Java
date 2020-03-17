package com.kodilla.good.patterns.challenges;

import java.util.Collection;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String titles = movieStore.getMovies().values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining("!"));
        System.out.println(titles);
    }
}
