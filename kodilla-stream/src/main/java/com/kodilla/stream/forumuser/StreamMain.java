package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        ForumUser forumUser = new ForumUser();

        Map<Integer, Forum> theResultMapOfForum =
                forumUser.getUserList().stream()
                        .filter(forum -> forum.getSex() == 'M')
                        .filter(forum -> ChronoUnit.YEARS.between(forum.getBirthDate(), LocalDate.now()) > 20)
                        .filter(forum -> forum.getQuantityPosts() > 0)
                        .collect(Collectors.toMap(Forum::getId, forum -> forum));

        System.out.println("# elements" + theResultMapOfForum.size());
        theResultMapOfForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
