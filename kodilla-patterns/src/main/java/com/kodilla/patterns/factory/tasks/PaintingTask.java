package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("At painting task");
    }

    @Override
    public String getTaskName() {
        return "[PAINTING] " + taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
