package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    String taskName;
    String whatToBuy;
    double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("At shopping task");
    }

    @Override
    public String getTaskName() {
        return "[SHOPPING] " + taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }
}
