package com.kodilla.good.patterns.exercises.realization;

import com.kodilla.good.patterns.exercises.repo.CarRentalRepository;
import com.kodilla.good.patterns.exercises.retrieving.RentRequestRetriever;
import com.kodilla.good.patterns.exercises.rental.CarRentalService;
import com.kodilla.good.patterns.exercises.inform.MailService;

public class Application {
    public static void main(String[] args) {
        RentRequestRetriever rentRequestretriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestretriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(
                new MailService(), new CarRentalService(), new CarRentalRepository());
        rentalProcessor.process(rentRequest);
    }
}
