package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Sepja", text -> text);
        poemBeautifier.beautify("Sepja", text -> text.toUpperCase());
        poemBeautifier.beautify("Sepja", text -> text.toLowerCase());
        poemBeautifier.beautify("Sepja", text -> "\"" + text + "\"");
        poemBeautifier.beautify("Random", text -> text.toUpperCase() + ": " + (int)(Math.random()*100));
    }
}