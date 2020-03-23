package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        //creating the library and assigning the books
        Library library = new Library("Municipal Public Library in Wroclaw");

        Book a = new Book("AAA", "Aaaaa Aaaaaaaa", LocalDate.of(1990, 05, 22));
        Book b = new Book("BBB", "Bbbb Bbbbbbb", LocalDate.of(1643, 12, 01));
        Book c = new Book("CCC", "Cccc Ccccccc", LocalDate.of(1982, 11, 04));
        Book d = new Book("DDD", "Dddddd Ddddd", LocalDate.of(1990, 07, 12));

        library.getBooks().add(a);
        library.getBooks().add(b);
        library.getBooks().add(c);
        library.getBooks().add(d);

        //making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Lower Silesian Public Library");

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Mediateka");

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(a);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
