package main.Problem235;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        L.add(4);
        L.add(3);
        L.add(1);
        L.add(2);
        L.add(5);
        Class c = new Class(L);
        List<Integer> L2 = c.function();
        System.out.println("MIN: " + L2.get(0) + ", MAX: " + L2.get(1));
    }
}
