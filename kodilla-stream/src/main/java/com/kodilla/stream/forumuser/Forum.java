package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class Forum {
    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int quantityPosts;

    public Forum(int id, String userName, char sex, LocalDate birthDate, int quantityPosts) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.quantityPosts = quantityPosts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getQuantityPosts() {
        return quantityPosts;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", quantityPosts=" + quantityPosts +
                '}';
    }
}
