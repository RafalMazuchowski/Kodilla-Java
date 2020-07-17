package com.kodilla.patterns2.observer.course;

public class Mentor implements MentorObserver {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void notifyAboutNewTask(StudentTasks studentTasks) {
        System.out.println("Student " + studentTasks.getStudent().getName() +
                " has done task: " + studentTasks.getTasks().peekLast() +
                ". Total tasks done by this student: " + studentTasks.getTasks().size());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}