package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Buy milk", "Milk 3,2%", 1.0);
            case PAINTINGTASK:
                return new PaintingTask("Holiday Time", "Pink", "Daughter room");
            case DRIVINGTASK:
                return new DrivingTask("Go at shopping", "Lidl", "Car");
            default:
                return null;
        }
    }
}
