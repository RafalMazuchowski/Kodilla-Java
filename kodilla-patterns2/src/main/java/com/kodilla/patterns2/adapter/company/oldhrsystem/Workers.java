package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"75012200766", "Philip", "Fry"},
            {"75012200767", "Turanga", "Leela"},
            {"75012200768", "Bender", "Rodriguez"},
            {"75012200769", "Hubert", "Farnsworth"},
            {"75012200770", "Doktor", "Zoidberg"}};
    private double[] salaries = {
            4500.00,
            3700.0,
            4350.00,
            9000.00,
            6200.00};

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}