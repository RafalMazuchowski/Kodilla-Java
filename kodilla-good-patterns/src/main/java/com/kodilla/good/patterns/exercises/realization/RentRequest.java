package com.kodilla.good.patterns.exercises.realization;

import com.kodilla.good.patterns.exercises.realization.input.User;

import java.time.LocalDateTime;

public class RentRequest {
    public RentRequest(User user, LocalDateTime rentFrom, LocalDateTime rentTo) {
    }

    public User getUser() {
        return new User(getUser().getName(), getUser().getSurname());
    }

    public LocalDateTime getFrom() {
        return LocalDateTime.of(2018, 8, 1, 12, 0);
    }

    public LocalDateTime getTo() {
        return LocalDateTime.of(2018, 8, 10, 12, 0);
    }
}
