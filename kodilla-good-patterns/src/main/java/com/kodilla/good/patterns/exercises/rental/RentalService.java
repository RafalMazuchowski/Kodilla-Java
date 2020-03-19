package com.kodilla.good.patterns.exercises.rental;

import com.kodilla.good.patterns.exercises.realization.input.User;

import java.time.LocalDateTime;

public interface RentalService {
    boolean rent(User user, LocalDateTime rentFrom, LocalDateTime rentTo);
}
