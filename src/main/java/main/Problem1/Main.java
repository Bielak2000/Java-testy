package main.Problem1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        L.add(10);
        L.add(15);
        L.add(3);
        L.add(7);
        Class c = new Class(L, 17);
        boolean x = c.function();
        System.out.println(x);
    }
}
