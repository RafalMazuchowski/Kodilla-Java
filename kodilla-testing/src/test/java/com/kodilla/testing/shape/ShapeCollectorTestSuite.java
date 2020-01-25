package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddCircle() {
        //Given
        ArrayList shapesList = new ArrayList<Shape>();
        ShapeCollector shapeCollector = new ShapeCollector(shapesList);

        //When
        shapeCollector.addFigure(new Circle(4.0));

        //Then
        assertEquals(new Circle(4.0), shapeCollector.getFigure(shapesList.size() - 1));
    }

    @Test
    public void testAddSquare() {
        //Given
        ArrayList shapesList = new ArrayList<Shape>();
        ShapeCollector shapeCollector = new ShapeCollector(shapesList);

        //When
        shapeCollector.addFigure(new Square(5.0));

        //Then
        assertEquals(new Square(5.0), shapeCollector.getFigure(shapesList.size() - 1));
    }

    @Test
    public void testAddTriangle() {
        //Given
        ArrayList shapesList = new ArrayList<Shape>();
        ShapeCollector shapeCollector = new ShapeCollector(shapesList);

        //When
        shapeCollector.addFigure(new Triangle(3.0, 5.0));

        //Then
        assertEquals(new Triangle(3.0, 5.0), shapeCollector.getFigure(shapesList.size() - 1));
    }

    @Test
    public void testRemoveTriangle() {
        //Given
        ArrayList shapesList = new ArrayList<Shape>();
        ShapeCollector shapeCollector = new ShapeCollector(shapesList);
        Shape shape = new Triangle(5.0, 7.0);
        shapeCollector.addFigure(shape);

        //When
        boolean result = shapeCollector.removeFigure(shapesList.size()-1);

        //Then
        assertTrue(result);
        assertEquals(0, shapeCollector.getShapesList().size());
    }

    @Test
    public void testRemoveSquare() {
        //Given
        ArrayList shapesList = new ArrayList<Shape>();
        ShapeCollector shapeCollector = new ShapeCollector(shapesList);
        Shape shape = new Square(7);
        shapeCollector.addFigure(shape);

        //When
        boolean result = shapeCollector.removeFigure(shapesList.size()-1);

        //Then
        assertTrue(result);
        assertEquals(0, shapeCollector.getShapesList().size());
    }


    @Test
    public void testRemoveCircle() {
        //Given
        ArrayList shapesList = new ArrayList<Shape>();
        ShapeCollector shapeCollector = new ShapeCollector(shapesList);
        Shape shape = new Circle(7);
        shapeCollector.addFigure(shape);

        //When
        boolean result = shapeCollector.removeFigure(shapesList.size()-1);

        //Then
        assertTrue(result);
        assertEquals(0, shapeCollector.getShapesList().size());
    }

    @Test
    public void testRemoveFigureWhichDoesNotExist() {
        //Given
        ArrayList shapesList = new ArrayList<Shape>();
        ShapeCollector shapeCollector = new ShapeCollector(shapesList);
        shapeCollector.addFigure(new Square(5));

        //When
        boolean result = shapeCollector.removeFigure(shapesList.size());
        System.out.println(result);

        //Then
        assertFalse(result);
        assertEquals(1, shapeCollector.getShapesList().size());
    }

    @Test
    public void testGetFigureExistNumber() {
        //Given
        ArrayList shapesList = new ArrayList<Shape>();
        ShapeCollector shapeCollector = new ShapeCollector(shapesList);
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);

        //When
        Shape shapeResult = shapeCollector.getFigure(0);

        //Then
        assertEquals(shape, shapeResult);
    }

    @Test
    public void testGetFigureNumberOutOfRange() {
        //Given
        ArrayList shapesList = new ArrayList<Shape>();
        ShapeCollector shapeCollector = new ShapeCollector(shapesList);

        //When
        Shape shapeResult = shapeCollector.getFigure(1);

        //Then
        assertNull(shapeResult);
    }

    @Test
    public void testShowFigures(){
        //Given
        ArrayList shapesList = new ArrayList<Shape>();
        ShapeCollector shapeCollector = new ShapeCollector(shapesList);
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        ArrayList<Shape> testList= new ArrayList<>();
        testList.add(shape);

        //When
        ArrayList<Shape> shapeResultList = shapeCollector.showFigures();

        //Then
        assertEquals(testList.toString(), shapeResultList.toString());
    }
}