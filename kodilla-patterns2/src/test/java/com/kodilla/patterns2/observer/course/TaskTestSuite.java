package com.kodilla.patterns2.observer.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTestSuite {
    @Test
    public void notifyAboutNewTask() {
        //given
        Mentor walaszczyk = new Mentor("Walaszczyk");
        Mentor tarkowski = new Mentor("Tarkowski");
        StudentTasks marcelinaTasks = new StudentTasks(new Student("Marcelina"));
        StudentTasks agataTasks = new StudentTasks(new Student("Agata"));
        StudentTasks tomaszTasks = new StudentTasks(new Student("Tomasz"));

        marcelinaTasks.registerObserver(walaszczyk);
        agataTasks.registerObserver(walaszczyk);
        tomaszTasks.registerObserver(tarkowski);

        //when
        marcelinaTasks.addTaskToQueue("task 1");
        tomaszTasks.addTaskToQueue("task 2");
        marcelinaTasks.addTaskToQueue("task 3");
        marcelinaTasks.addTaskToQueue("task 4");
        agataTasks.addTaskToQueue("task 5");
        tomaszTasks.addTaskToQueue("task 6");
        agataTasks.addTaskToQueue("task 7");

        //then
        assertEquals(2, agataTasks.getTasks().size());
        assertEquals(2, tomaszTasks.getTasks().size());
        assertEquals(3, marcelinaTasks.getTasks().size());
        assertEquals(5, walaszczyk.getUpdateCount());
        assertEquals(2, tarkowski.getUpdateCount());
    }
}