package main.Problem15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        L.add(1);
        L.add(8);
        L.add(20);
        L.add(10);
        L.add(3);
        L.add(25);
        Class c = new Class(L);
        int d = c.Rand();
        System.out.println(d);
    }
}
