package com.kodilla.good.patterns.exercises.repo;

import com.kodilla.good.patterns.exercises.realization.input.User;

import java.time.LocalDateTime;

public interface RentalRepository {
    boolean createRental(User user, LocalDateTime rentFrom, LocalDateTime rentTo);
}
