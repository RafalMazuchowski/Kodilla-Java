package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ForumUser {
    private final List<Forum> forumList = new ArrayList<>();

    public ForumUser() {
        forumList.add(new Forum(1, "BigBoy", 'M', LocalDate.of(1999, 1, 28), 23 ));
        forumList.add(new Forum(2, "Flory54", 'F', LocalDate.of(1993, 6, 12), 38 ));
        forumList.add(new Forum(3, "R_user", 'M', LocalDate.of(1980, 6, 21), 0 ));
        forumList.add(new Forum(4, "TappoS", 'M', LocalDate.of(1981, 7, 3), 0 ));
        forumList.add(new Forum(5, "Flamen", 'M', LocalDate.of(1999, 2, 20), 2 ));
        forumList.add(new Forum(6, "Ursa001", 'F', LocalDate.of(1985, 5, 6), 0 ));
        forumList.add(new Forum(7, "Elianus", 'M', LocalDate.of(1986, 10, 26), 1 ));
        forumList.add(new Forum(8, "Jaggi", 'F', LocalDate.of(1996, 1, 31), 12 ));
        forumList.add(new Forum(9, "Mitra17", 'F', LocalDate.of(1986, 11, 8), 6 ));
        forumList.add(new Forum(10, "Leontinus", 'M', LocalDate.of(1986, 4, 24), 3 ));
        forumList.add(new Forum(11, "Abhinav", 'M', LocalDate.of(1999, 2, 16), 4 ));
        forumList.add(new Forum(12, "Golla", 'M', LocalDate.of(2005, 8, 15), 0 ));
    }

    public List<Forum> getUserList() {
        return new ArrayList<>(forumList);
    }
}
