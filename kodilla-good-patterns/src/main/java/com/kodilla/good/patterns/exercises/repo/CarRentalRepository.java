package com.kodilla.good.patterns.exercises.repo;

import com.kodilla.good.patterns.exercises.realization.input.User;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {
    @Override
    public boolean createRental(User user, LocalDateTime rentFrom, LocalDateTime rentTo) {
        return false;
    }
}
