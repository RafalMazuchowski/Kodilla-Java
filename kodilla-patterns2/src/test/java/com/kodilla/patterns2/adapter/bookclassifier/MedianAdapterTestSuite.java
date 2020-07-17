package com.kodilla.patterns2.adapter.bookclassifier;

import static org.junit.jupiter.api.Assertions.*;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Henryk Sienkiewicz", "W pustyni i w puszczy", 1910, "ag-7346"));
        bookSet.add(new Book("Douglas Hulick", "Honor złodzieja", 2012, "ur-8756"));
        bookSet.add(new Book("Jan Brzechwa", "Akademia Pana Kleksa", 1946, "at-7419"));

        //When
        MedianAdapter adapter = new MedianAdapter();
        int medianPublicationYear = adapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(1946, medianPublicationYear);
    }
}