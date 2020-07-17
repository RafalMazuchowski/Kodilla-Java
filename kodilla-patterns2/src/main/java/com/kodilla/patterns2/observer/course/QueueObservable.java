package com.kodilla.patterns2.observer.course;

public interface QueueObservable {
    void registerObserver(MentorObserver observer);

    void notifyObservers();

    void removeObserver(MentorObserver observer);
}