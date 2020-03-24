package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    String taskName;
    String where;
    String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("At painting task");
    }

    @Override
    public String getTaskName() {
        return "[DRIVING] " + taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
