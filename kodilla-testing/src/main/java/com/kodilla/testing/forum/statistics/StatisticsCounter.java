package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {

    private int qtyUsers;
    private int qtyPosts;
    private int qtyComments;
    private Double postsAtUser = null;
    private Double commentsAtUser = null;
    private Double commentsAtPost = null;

    public void calculateAdvStatistics(Statistics statistics) {
        qtyUsers = statistics.usersNames().size();
        qtyPosts = statistics.postsCount();
        qtyComments = statistics.commentsCount();

        if (qtyUsers != 0) {
            postsAtUser = (double) qtyPosts / qtyUsers;
            //System.out.println("A" + postsAtUser);
        } else {
            System.out.println("No users!");
        }

        if (qtyUsers != 0) {
            commentsAtUser = (double) qtyComments / qtyUsers;
            //System.out.println("B" + commentsAtUser);
        } else {
            System.out.println("No users!");
        }

        if (qtyPosts != 0 && qtyUsers != 0) {
            commentsAtPost = (double) qtyComments / qtyPosts;
            //System.out.println("C" + commentsAtPost);
        } else {
            System.out.println("No posts!");
        }
    }

    public void showStatistics() {
        System.out.println("Users: " + qtyUsers + ", posts: " + qtyPosts + ", comments: " + qtyComments);
        System.out.println("Average posts at user: " + postsAtUser);
        System.out.println("Average comments at user: " + commentsAtUser);
        System.out.println("Average comments at post: " + commentsAtPost);
    }

    public int getQtyUsers() {
        return qtyUsers;
    }

    public int getQtyPosts() {
        return qtyPosts;
    }

    public int getQtyComments() {
        return qtyComments;
    }

    public Double getPostsAtUser() {
        return postsAtUser;
    }

    public Double getCommentsAtUser() {
        return commentsAtUser;
    }

    public Double getCommentsAtPost() {
        return commentsAtPost;
    }
}
