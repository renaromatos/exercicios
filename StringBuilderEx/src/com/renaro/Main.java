package com.renaro;

import com.renaro.entities.Comment;
import com.renaro.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awsome!");
        Post p1 = new Post(sdf.parse(
                "15/12/2021 11:00:45"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderfull country!",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}
