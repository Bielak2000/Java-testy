package main.Problem189;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        L.add(5);
        L.add(1);
        L.add(3);
        L.add(5);
        L.add(2);
        L.add(3);
        L.add(4);
        L.add(1);
        Class c = new Class(L);
        int x = c.function();
        System.out.println(x);

    }
}
