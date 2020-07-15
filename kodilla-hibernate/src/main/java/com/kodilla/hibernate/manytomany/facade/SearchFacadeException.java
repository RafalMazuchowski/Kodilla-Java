package com.kodilla.hibernate.manytomany.facade;

public class SearchFacadeException extends Exception {
    public static String ERR_EMPLOYEE_NOT_FOUND = "Cannot find such employee name";
    public static String ERR_COMPANY_NOT_FOUND = "Cannot find such company name";

    public SearchFacadeException(String message) {
        super(message);
    }
}