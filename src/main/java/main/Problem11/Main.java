package main.Problem11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Kacper");
        words.add("Kacperek");
        words.add("Bielak");
        words.add("BIeKac");
        Dictionary d = new Dictionary(words);
        System.out.println(d.toString());
        System.out.println();
        List<String> returnWords = d.getPartial("Kac");
    }
}