package com.kodilla.spring.portfolio;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        TaskList taskList1 = board.getToDoList();
        taskList1.TaskList().add("Eat");
        System.out.println(taskList1.getTasks());
        TaskList taskList2 = board.getDoneList();
        taskList2.TaskList().add("Study");
        System.out.println(taskList2.getTasks());
        TaskList taskList3 = board.getInProgressList();
        taskList3.TaskList().add("Sleep");
        System.out.println(taskList3.getTasks());
        //Then
        Assert.assertTrue(taskList1.TaskList().isEmpty());
    }
}